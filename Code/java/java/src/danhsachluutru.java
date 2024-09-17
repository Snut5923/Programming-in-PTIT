import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class danhsachluutru {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ks> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            Date den = sd.parse(sc.nextLine());
            Date di = sd.parse(sc.nextLine());
            kq.add(new ks(i,ten,ma,den,di));
        }
        Collections.sort(kq);
        for(ks x : kq){
            System.out.println(x);
        }
    }
}
class ks implements Comparable<ks>{
    private String makh,ten,ma;
    private long songay;
    ks(int i,String ten,String ma,Date den,Date di){
        this.makh = String.format("KH%02d",i);
        this.ten = ten;
        this.ma = ma;
        this.songay = (di.getTime()-den.getTime())/(24*60*60*1000);
    }
    @Override
    public String toString(){
        return makh+" "+ten+" "+ma+" "+songay;
    }
    @Override
    public int compareTo(ks x){
        return (int)(x.songay-this.songay);
    }
}
