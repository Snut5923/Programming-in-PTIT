import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<in4> kq = new ArrayList<>();
        HashMap<String,hang> mp = new HashMap<>();
        while(t-->0){
            hang a = new hang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!mp.containsKey(a.getma())){
                mp.put(a.getma(), a);
            }
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            in4 a = new in4(sc.nextLine());
            a.xuli(mp);
            kq.add(a);
        }
        for(in4 x : kq){
            System.out.println(x);
        }
    }
}
class hang{
    private String ma,ten,xeploai;
    private double lai;
    public hang(String ma,String ten,String xeploai){
        this.ma = ma;
        this.ten = ten;
        this.xeploai = xeploai;
        this.lai = doi();
    }
    public String getten(){
        return ten;
    }
    public double doi(){
        if(xeploai.equals("A")) return 0.08;
        else if(xeploai.equals("B")) return 0.05;
        return 0.02;
    }
    public String getma(){
        return ma;
    }
}
class in4{
    private String ma,ten,xeploai;
    private long slnhap,gianhap,slxuat;
    private double lai;
    public in4(String s){
        String[] tmp = s.split("\\s+");
        this.ma = tmp[0];
        this.slnhap = Long.parseLong(tmp[1]);
        this.gianhap = Long.parseLong(tmp[2]);
        this.slxuat = Long.parseLong(tmp[3]);
    }
    public void xuli(HashMap<String,hang> mp){
        hang a = mp.get(ma);
        this.ten = a.getten();
        this.lai = a.doi();
    }
    public long gianhap(){
        return slnhap*gianhap;
    }
    public long giaxuat(){
        double x = gianhap*(1+lai)*slxuat;
        return (long)x;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gianhap()+" "+giaxuat();
    }
}
// 2
// A001
// Tu lanh
// A
// P002
// May giat
// B
// 2
// A001 500 100 300
// P002 1000 1000 500