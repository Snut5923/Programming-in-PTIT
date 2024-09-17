import java.util.*;
import java.io.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hs> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hs(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        t = Integer.parseInt(sc.nextLine());
        Double chuan = kq.get(t-1).tb();
        System.out.println(String.format("%.1f",chuan));
        for(hs x : kq){
            System.out.println(x+" "+x.status(chuan));
        }

    }
}
class hs implements Comparable<hs>{
    private String ma,ten;
    private double toan,ly,hoa;
    public hs(String ma,String ten,String toan,String ly,String hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan =Double.parseDouble(toan);
        this.ly = Double.parseDouble(ly);
        this.hoa = Double.parseDouble(hoa);
    }
    public double ut(){
        String s = ma.substring(0,3);
        if(s.equals("KV1")) return 0.5;
        else if(s.equals("KV2")) return 1;
        return 2.5;
    }
    public String xuli(double x){
        if(x == (long)x) return Long.toString((long)x);
        return String.format("%.1f",x);
    }
    public Double tb(){
        return toan*2+ly+hoa+ut();
    }
    public String status(double x){
        if(tb() >= x) return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+xuli(ut())+" "+xuli(tb());
    }
    @Override
    public int compareTo(hs x){
        if(x.tb() > tb()) return 1;
        else if(x.tb() < tb()) return -1;
        return 0;
    }
}