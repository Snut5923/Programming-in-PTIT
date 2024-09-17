import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new nv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        String s = sc.nextLine();
        for(nv x : kq){
            if(s.equals(x.getchuc())) System.out.println(x);
        }
    }
}
class nv{
    private String ma,ten,chuc;
    private long luong,ngay;
    public nv(int i,String ten,String chuc,String luong,String ngay){
        this.ma = String.format("NV%02d", i);
        this.ten = ten;
        this.chuc = chuc;
        this.luong = Long.parseLong(luong);
        this.ngay = Long.parseLong(ngay);
    }
    public long phucap(){
        if(chuc.equals("GD")) return 500;
        else if(chuc.equals("PGD")) return 400;
        else if(chuc.equals("TP")) return 300;
        else if(chuc.equals("KT")) return 250;
        return 100;
    }
    public long luongthang(){
        return luong*ngay;
    }
    public long tamung(){
        if((phucap()+luongthang())*2/3 < 25000) return Math.round((double)(phucap()+luongthang())*2/3000)*1000;
        return 25000;
    }
    public long conlai(){
        return luongthang()+phucap()-tamung();
    }
    public String getchuc(){
        return chuc;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+phucap()+" "+luongthang()+" "+tamung()+" "+conlai();
    }
}
// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28