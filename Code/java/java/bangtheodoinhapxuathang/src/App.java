import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hang(sc.nextLine(), sc.nextLine()));
        }
        for(hang x : kq){
            System.out.println(x);
        }
    }
}
class hang{
    private String ma;
    private double nhap;
    public hang(String ma,String nhap){
        this.ma = ma;
        this.nhap = Double.parseDouble(nhap);
    }
    public long xuat(){
        if(ma.charAt(0)=='A') return Math.round(nhap*60/100);
        return Math.round(nhap*70/100);
    }
    public long dongia(){
        if(ma.charAt(ma.length()-1)=='Y') return 110000;
        return 135000;
    }
    public long tien(){
        return xuat()*dongia();
    }
    public double thue(){
        if(ma.charAt(0)=='A'){
            if(ma.charAt(ma.length()-1)=='Y') return tien()*8/100;
            return tien()*11/100;
        }
        else{
            if(ma.charAt(ma.length()-1)=='Y') return tien()*17/100;
            return tien()*22/100;
        }
    }
    @Override
    public String toString(){
        return ma+" "+String.format("%.0f",nhap)+" "+xuat()+" "+dongia()+" "+tien()+" "+String.format("%.0f",thue());
    }
}
// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582