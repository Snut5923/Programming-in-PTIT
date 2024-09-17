import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int ht=0,hp=0;
        ArrayList<gv> kq = new ArrayList<>();
        while(t-->0){
            gv a = new gv(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(a.chucvu().equals("HT") || a.chucvu().equals("HP")){
                if(a.chucvu().equals("HT")){
                    if(ht!=1){
                        ht++;
                        kq.add(a);
                    }
                }
                else{
                    if(hp!=2){
                        hp++;
                        kq.add(a);
                    }
                }
            }
            else kq.add(a);
        }
        for(gv x : kq){
            System.out.println(x);
        }
    }
}
class gv{
    private String ma,chuc,ten;
    private long heso,luong;
    public gv(String ma,String ten,String luong){
        this.ma = ma;
        this.ten = ten;
        this.chuc = ma.substring(0, 2);
        this.heso = Long.parseLong(ma.substring(2));
        this.luong = Long.parseLong(luong);
    }
    public String chucvu(){
        return chuc;
    }
    public long phucap(){
        if(chuc.equals("HT")) return 2000000;
        else if(chuc.equals("HP")) return 900000;
        return 500000;
    }
    public long thunhap(){
        return luong*heso+phucap();
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+heso+" "+phucap()+" "+thunhap();
    }
}
// 3
// GV01
// Nguyen Kim Loan
// 1420000
// HT05
// Hoang Thanh Tuan
// 1780000
// GV02
// Tran Binh Nguyen
// 1468000