import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sapxepdanhsachsinhvien {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sinhvien> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(sinhvien x : kq){
            System.out.println(x);
        }
    }
}
class sinhvien implements Comparable<sinhvien>{
    private String ho,dem,ten,ma,sdt,email;
    public sinhvien(String ma,String ten,String sdt,String email){
        this.ma = ma;
        chuanhoa(ten);
        this.sdt = sdt;
        this.email = email;
    }
    public void chuanhoa(String s){
        String x = "";
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(int i=1;i<tmp.length-1;i++){
            x += String.format(Character.toUpperCase(tmp[i].charAt(0))+tmp[i].substring(1)+" ");
        }
        this.dem = x.trim();
        this.ho = String.format(Character.toUpperCase(tmp[0].charAt(0))+tmp[0].substring(1));
        this.ten = String.format(Character.toUpperCase(tmp[tmp.length-1].charAt(0))+tmp[tmp.length-1].substring(1));
    }
    @Override
    public String toString(){
        return ma+" "+ho+" "+dem+" "+ten+" "+sdt+" "+email;
    }
    @Override
    public int compareTo(sinhvien x){
        if(!this.ten.equals(x.ten)) return this.ten.compareTo(x.ten);
        else if(!this.ho.equals(x.ho)) return this.ho.compareTo(x.ho);
        else if(!this.dem.equals(x.dem)) return this.dem.compareTo(x.dem);
        else return this.ma.compareTo(x.ma);
    }
}