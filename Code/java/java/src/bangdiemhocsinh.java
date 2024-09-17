import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bangdiemhocsinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<xyz> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            xyz a = new xyz(i,sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        for(xyz x : kq){
            System.out.println(x);
        }
    }
}
class xyz implements Comparable<xyz>{
    private String ten,status,ma;
    private double tb;
    public xyz(int i,String ten,String s){
        this.ma = String.format("HS%02d",i);
        this.ten = ten;
        String[] tmp = s.split("\\s+");
        double tong = 0;
        for(int j=0;j<10;j++){
            if(j<=1){
                tong += 2*Double.parseDouble(tmp[j]);
            }
            else tong += Double.parseDouble(tmp[j]);
        }
        this.tb = tong/12;
        this.status = loai();
    }
    public String loai(){
        if(tb >= 9) return "XUAT SAC";
        else if(tb >= 8) return "GIOI";
        else if(tb >= 7) return "KHA";
        else if(tb>= 5) return "TB";
        return "YEU";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+tb+" "+status;
    }
    @Override
    public int compareTo(xyz x){
        if(tb < x.tb) return 1;
        if(tb > x.tb) return -1;
        return ma.compareTo(x.ma);
    }
}