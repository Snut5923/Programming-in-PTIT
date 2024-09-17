import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sapxepdanhsachmathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            hang a = new hang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        for(hang x : kq){
            System.out.println(x);
        }
    }
}
class hang implements Comparable<hang>{
    private String ma,ten,nhom;
    private double mua,ban,loi;
    public hang(int i,String ten,String nhom,String mua,String ban){
        this.ma = String.format("%d",i);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = Double.parseDouble(mua);
        this.ban = Double.parseDouble(ban);
        this.loi = this.ban - this.mua;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+nhom+" "+String.format("%.2f",loi);
    }
    @Override
    public int compareTo(hang x){
        return (int)(x.loi - loi);
    }
}