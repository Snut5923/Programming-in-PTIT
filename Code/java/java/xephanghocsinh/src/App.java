import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hs> kq = new ArrayList<>();
        ArrayList<hs> a = new ArrayList<>();
        for(int i=1;i<=t;i++){
            hs b = new hs(i, sc.nextLine(), sc.nextLine());
            kq.add(b);
            a.add(b);
        }
        Collections.sort(a);
        a.get(0).settt(1);
        for(int i=1;i<t;i++){
            if(a.get(i).gettb()==a.get(i-1).gettb()){
                a.get(i).settt(a.get(i-1).gettt());
            }
            else a.get(i).settt(i+1);
        }
        for(hs x : kq){
            System.out.println(x);
        }
    }
}
class hs implements Comparable<hs>{
    private String ma,ten;
    private double tb;
    private int tt;
    public hs(int i,String ten,String tb){
        this.ma = String.format("HS%02d", i);
        this.ten = ten;
        this.tb = Double.parseDouble(tb);
    }
    public double gettb(){
        return tb;
    }
    public int gettt(){
        return tt;
    }
    public void settt(int x){
        this.tt = x;
    }
    public String loai(){
        if(tb<5) return "Yeu";
        else if(tb<7) return "Trung Binh";
        else if(tb<9) return "Kha";
        return "Gioi";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+tb+" "+loai()+" "+tt;
    }
    @Override
    public int compareTo(hs x){
        if(x.tb > tb) return 1;
        return -1;
    }
    
}
// 3
// Tran Minh Hieu
// 5.9
// Nguyen Bao Trung
// 8.6
// Le Hong Ha
// 9.2