import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dkihinhthucgiangday {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<monhoc> kq = new ArrayList<>();
        while(t-->0){
            monhoc y = new monhoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            if(!y.getTh().equals("Truc tiep")){
                kq.add(y);
            }
        }
        Collections.sort(kq);
        for(monhoc x : kq){
            System.out.println(x);
        }
    }
}
class monhoc implements Comparable<monhoc>{
    private String ma,ten,lt,th;
    private int tin;
    public monhoc(String ma,String ten,String tin,String lt,String th){
        this.ma = ma;
        this.ten = ten;
        this.tin = Integer.parseInt(tin);
        this.lt = lt;
        this.th = th;
    }
    public String getTh(){
        return this.th;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+tin+" "+lt+" "+th;
    }
    @Override
    public int compareTo(monhoc x){
        return this.ma.compareTo(x.ma);
    }
}