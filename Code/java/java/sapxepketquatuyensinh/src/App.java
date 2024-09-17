import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new ts(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(ts x : kq){
            System.out.println(x);
        }
    }
}
class ts implements Comparable<ts>{
    private String ma,ten,kv;
    private double toan,ly,hoa;
    public ts(String ma,String ten,String toan,String ly,String hoa){
        this.ma = ma;
        this.kv = ma.substring(0, 3);
        this.ten = ten;
        this.toan = Double.parseDouble(toan);
        this.ly = Double.parseDouble(ly);
        this.hoa = Double.parseDouble(hoa); 
    }
    public double ut(){
        if(kv.equals("KV1")) return 0.5;
        else if(kv.equals("KV2")) return 1;
        return 2.5;
    }
    public double tb(){
        return toan*2+ly+hoa+ut();
    }
    public String status(){
        if(tb() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String in(double n){
        if(n==(long)n) return String.format("%.0f", n);
        return String.format("%.1f", n);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+in(ut())+" "+in(tb())+" "+status();
    }
    @Override
    public int compareTo(ts x){
        if(x.tb() > tb()) return 1;
        if(x.tb() < tb()) return -1;
        return ma.compareTo(x.ma);
    }
}
// 2
// KV2A002
// Hoang Thanh Tuan
// 5
// 6
// 5
// KV2B123
// Ly Thi Thu Ha
// 8
// 6.5
// 7