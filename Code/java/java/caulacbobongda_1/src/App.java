import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String,clb> mp = new HashMap<>();
        ArrayList<ve> kq = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            clb a = new clb(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!mp.containsKey(a.getma())){
                mp.put(a.getma(), a);
            }
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            ve a = new ve(sc.nextLine());
            a.doi(mp);
            kq.add(a);
        }
        Collections.sort(kq);
        for(ve x : kq){
            System.out.println(x);
        }
    }
}
class clb{
    private String ma,ten,matran;
    private long giave,doanhthu;
    public clb(String ma,String ten,String giave){
        this.ma = ma;
        this.ten = ten;
        this.giave = Long.parseLong(giave);
    }
    public long getgv(){
        return giave;
    }
    public String getma(){
        return ma;
    }
    public String getten(){
        return ten;
    }
}
class ve implements Comparable<ve>{
    private String matran,ma,ten;
    private long sl,thunhap;
    public ve(String s){
        String[] tmp = s.split("\\s+");
        this.matran = tmp[0];
        this.ma = matran.substring(1, 3);
        this.sl = Long.parseLong(tmp[1]);
    }
    public void doi(HashMap<String,clb> mp){
        clb a = mp.get(ma);
        this.ten = a.getten();
        this.thunhap = sl*a.getgv();
    }
    @Override
    public String toString(){
        return matran+" "+ten+" "+thunhap;
    }
    @Override
    public int compareTo(ve x){
        if(x.thunhap > thunhap) return 1;
        if(x.thunhap < thunhap) return -1;
        return ten.compareTo(x.ten);
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000