import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<kh> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new kh(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(kh x : kq){
            System.out.println(x);
        }
    }
}
class kh implements Comparable<kh>{
    private String ten,makh;
    private Double tien,gia,phuphi,dau,cuoi,so;
    public kh(int i,String ten,String dau,String cuoi){
        this.makh = String.format("KH%02d",i);
        this.ten = ten;
        this.dau = Double.parseDouble(dau);
        this.cuoi = Double.parseDouble(cuoi);
        this.so = this.cuoi - this.dau;
        this.tien = tongtien();
    }
    public Double doigia(double x){
        if(x>100) return 200D;
        else if(x>50) return 150D;
        return 100D;
    }
    public Double doiphuphi(double x){
        if(x>100) return 0.05;
        else if(x>50) return 0.03;
        return 0.02;
    }
    public Double tongtien(){
        if(so <= 50) return so*100*1.02;
        else if(so <=100) return (50*100 + (so-50)*150)*1.03;
        return (50*100 + 50*150 + (so-100)*200)*1.05;
    }
    @Override
    public String toString(){
        return makh+" "+ten+" "+String.format("%.0f",tien);
    }
    @Override
    public int compareTo(kh x){
        if(x.tien > tien) return 1;
        else if(x.tien < tien) return -1;
        return 0;
    }
}