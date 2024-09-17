import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new ts(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(ts x : kq){
            System.out.println(x);
        }
    }
}
class ts implements Comparable<ts>{
    private Double lt,th;
    private String ten,ma;
    public ts(int i,String ten,String lt,String th){
        this.ma = String.format("TS%02d", i);
        this.ten = ten;
        this.lt = Double.parseDouble(lt);
        this.th = Double.parseDouble(th);
    }
    public Double tb(){
        double x = (lt+th)/2;
        if(x>10 && x<100){
            return x/10;
        }
        return x;
    }
    public String status(){
        if(tb() < 5) return "TRUOT";
        else if(tb() < 8) return "CAN NHAC";
        else if(tb() < 9.5) return "DAT";
        return "XUAT SAC";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f", tb())+" "+status();
    }
    @Override
    public int compareTo(ts x){
        if(x.tb() > tb()) return 1;
        if(x.tb() < tb()) return -1;
        return 0;
    }
}
// 3
// Nguyen Thai Binh
// 45
// 75
// Le Cong Hoa
// 4
// 4.5
// Phan Van Duc
// 56
// 56