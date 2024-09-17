import java.util.Scanner;

public class baitoantuyensinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tsinh a = new tsinh(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println(a);
    }
}
class tsinh{
    private String ma,ten;
    private double toan,ly,hoa;
    public tsinh(String ma,String ten,String toan,String ly,String hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan = Double.parseDouble(toan);
        this.ly = Double.parseDouble(ly);
        this.hoa = Double.parseDouble(hoa);
    }
    public double uutien(){
        String s = ma.substring(0,3);
        if(s.equals("KV1")) return 0.5;
        else if (s.equals("KV2")) return 1;
        return 2.5;
    }
    public double tb(){
        return toan*2 + ly + hoa;
    }
    public String status(){
        if(tb()+uutien() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String doi(double x){
        if((int)x == x) return String.format("%.0f",x);
        else return Double.toString(x);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+doi(uutien())+" "+doi(tb())+" "+status();
    }
}