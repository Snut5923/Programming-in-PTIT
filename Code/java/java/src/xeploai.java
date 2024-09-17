import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xeploai {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<svien> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new svien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(svien x : kq){
            System.out.println(x);
        }
    }
}
class svien implements Comparable<svien>{
    private String masv,ten;
    private int lt,th,thi;
    public svien(int i,String ten,String lt,String th,String thi){
        this.masv = String.format("SV%02d",i);
        this.ten = chuanhoa(ten);
        this.lt = Integer.parseInt(lt);
        this.th = Integer.parseInt(th);
        this.thi = Integer.parseInt(thi);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    public double tb(){
        return lt*0.25+th*0.35+thi*0.4;
    }
    public String loai(){
        if(tb()>=8) return "GIOI";
        else if(tb()>=6.5) return "KHA";
        else if(tb()>=5) return "TRUNG BINH";
        else return "KEM";
    }
    @Override
    public String toString(){
        return masv+" "+ten+String.format("%.2f",tb())+" "+loai();
    }
    @Override
    public int compareTo(svien x){
        if(x.tb() > this.tb()) return 1;
        if(x.tb() < this.tb()) return -1;
        else return 0;
    }
}