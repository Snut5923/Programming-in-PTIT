import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsachdoanhnghiep {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<dn> kq = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sv = sc.nextLine();
            kq.add(new dn(ma,ten,sv));
        }
        Collections.sort(kq);
        for(dn x : kq){
            System.out.println(x);
        }
    }
}
class dn implements Comparable<dn>{
    private String ma,ten,sv;
    dn(String ma,String ten,String sv){
        this.ma = ma;
        this.ten = ten;
        this.sv = sv;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
    @Override
    public int compareTo(dn x){
        return this.ma.compareTo(x.ma);
    }
}