import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class diemtuyensinh {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<thisinh> kq = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            kq.add(new thisinh(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(thisinh x : kq){
            System.out.println(x);
        }
    }
}
class thisinh implements Comparable<thisinh>{
    private String ma,ten,toc;
    private double thi;
    private int khu;
    public thisinh(int i,String ten,String thi,String toc,String khu){
        this.ma = String.format("TS%02d",i);
        this.ten = chuanhoa(ten);
        this.thi = Double.parseDouble(thi);
        this.toc = toc;
        this.khu = Integer.parseInt(khu);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    public double uutien(){
        double x = 0;
        if(khu == 1) x += 1.5;
        if(khu == 2) x += 1;
        if(!toc.equals("Kinh")) x+=1.5;
        return x;
    }
    public double tong(){
        return uutien()+thi;
    }
    public String status(){
        if(tong()>=20.5) return "Do";
        return "Truot";
    }
    @Override
    public String toString(){
        return ma+" "+ten+String.format("%.1f",tong())+" "+status();
    }
    @Override
    public int compareTo(thisinh x){
        if(x.tong() > this.tong()) return 1;
        if(x.tong() < this.tong()) return -1;
        return this.ma.compareTo(x.ma);
    }
}
