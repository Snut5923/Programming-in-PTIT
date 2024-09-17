import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsachsanpham_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<sp> kq = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gia = sc.nextLine();
            String bh = sc.nextLine();
            kq.add(new sp(ma,ten,gia,bh));
        }
        Collections.sort(kq);
        for(sp x : kq){
            System.out.println(x);
        }
    }
}
class sp implements Comparable<sp>{
    private String ma,ten,bh;
    private String gia;
    sp(String ma,String ten,String gia,String bh){
        this.ma= ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gia+" "+bh;
    }
    @Override
    public int compareTo(sp x){
        if(!x.gia.equals(this.gia)){
            return Integer.parseInt(x.gia)-Integer.parseInt(this.gia);
        }
        else{
            return this.ma.compareTo(x.ma);
        }
    }
}
