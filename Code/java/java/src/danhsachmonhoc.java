import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsachmonhoc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<mon> kq = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sotin = sc.nextLine();
            kq.add(new mon(ma,ten,sotin));
        }
        Collections.sort(kq);
        for(mon x : kq){
            System.out.println(x);
        }
    }
}
class mon implements Comparable<mon>{
    private String ma,ten,sotin;
    mon(String ma,String ten,String sotin ){
        this.ma= ma;
        this.ten = ten;
        this.sotin = sotin;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sotin;
    }
    @Override
    public int compareTo(mon x){
        return this.ten.compareTo(x.ten);
    }
}