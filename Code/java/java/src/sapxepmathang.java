import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sapxepmathang {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<mh> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            Double mua = Double.parseDouble(sc.nextLine());
            Double ban = Double.parseDouble(sc.nextLine());
            kq.add(new mh(i,ma,ten,mua,ban));
        }
        Collections.sort(kq);
        for(mh x : kq){
            System.out.println(x);
        }
    }
}
class mh implements Comparable<mh>{
    private String ma,ten,nhom,loi;
    mh(int i,String ten,String nhom,double mua,double ban){
        this.ma = String.format("MH%02d",i);
        this.ten = ten;
        this.nhom = nhom;
        this.loi = String.format("%.2f",ban-mua);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+nhom+" "+loi;
    }
    @Override
    public int compareTo(mh x){
        return Double.compare(Double.parseDouble(x.loi),Double.parseDouble(this.loi));
    }
}
