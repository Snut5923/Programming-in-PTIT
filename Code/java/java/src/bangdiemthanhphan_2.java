import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bangdiemthanhphan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<tp1> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new tp1(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(kq);
        int j = 1;
        for(tp1 x: kq){
            System.out.print(j+" ");
            System.out.println(x);
            j++;
        }
    }
}
class tp1 implements Comparable<tp1>{
    private String ma,ten,lop;
    private double d1,d2,d3;
    public tp1(String ma,String ten,String lop,String d1,String d2,String d3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = Double.parseDouble(d1);
        this.d2 = Double.parseDouble(d2);
        this.d3 = Double.parseDouble(d3);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+d1+" "+d2+" "+d3;
    }
    @Override
    public int compareTo(tp1 x){
        return ten.compareTo(x.ten);
    }
}