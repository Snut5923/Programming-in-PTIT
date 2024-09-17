import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsachmonthi {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<m> kq = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String thi = sc.nextLine();
            kq.add(new m(ma,ten,thi));
        }
        Collections.sort(kq);
        for(m x : kq){
            System.out.println(x);
        }
    }
}
class m implements Comparable<m>{
    private String ma,ten,thi;
    m(String ma,String ten,String thi){
        this.ma = ma;
        this.ten = ten;
        this.thi = thi;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+thi;
    }
    @Override
    public int compareTo(m x){
        return this.ma.compareTo(x.ma);
    }
}