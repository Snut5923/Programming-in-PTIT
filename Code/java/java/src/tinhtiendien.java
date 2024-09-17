import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tinhtiendien {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<kh> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new kh(i,sc.nextLine(),sc.next(),sc.next(),sc.next()));
            if(i<t) sc.nextLine();
        }
        Collections.sort(kq);
        for(kh x : kq){
            System.out.println(x);
        }
    }
}
class kh implements Comparable<kh>{
    private String ma,ten,loai;
    private int dau,cuoi,sodien;
    public kh(int i,String ten,String loai,String dau,String cuoi){
        this.ma = String.format("KH%02d",i);
        this.ten = chuanhoa(ten);
        this.loai = loai;
        this.dau = Integer.parseInt(dau);
        this.cuoi = Integer.parseInt(cuoi);
        this.sodien = this.cuoi - this.dau;
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    public int dinhmuc(){
        if(loai.equals("A")) return 100;
        if(loai.equals("B")) return 500;
        return 200;
    }
    public int trong(){
        if(sodien < dinhmuc()) return sodien*450;
        else return dinhmuc()*450;
    }
    public int vuot(){
        if(sodien>dinhmuc()) return (sodien-dinhmuc())*1000;
        return 0;
    }
    public int vat(){
        return vuot()/20;
    }
    public int tong(){
        return trong()+vuot()+vat();
    }
    @Override
    public String toString(){
        return ma+" "+ten+trong()+" "+vuot()+" "+vat()+" "+tong();
    }
    @Override
    public int compareTo(kh x){
        if(x.tong() > this.tong()) return 1;
        else return -1;
    }
}