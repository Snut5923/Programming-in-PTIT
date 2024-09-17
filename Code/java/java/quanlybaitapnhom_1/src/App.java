import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<sv> a = new ArrayList<>();
        ArrayList<bt> b = new ArrayList<>();
        HashMap<String,bt> hw = new HashMap<>();
        while(n-->0){
            sv x = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        for(int i=1;i<=m;i++){
            bt x = new bt(i, sc.nextLine());
            b.add(x);
            hw.put(x.getnhom(), x);
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH NHOM "+s+":");
            for(sv x : a){
                if(s.equals(x.getnhom())) System.out.println(x);
            }
            System.out.println("Bai tap dang ky: "+hw.get(s));
        }
    }
}
class sv{
    private String masv,ten,sdt,nhom;
    public sv(String masv,String ten,String sdt,String nhom){
        this.masv = masv;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    public String getnhom(){
        return nhom;
    }
    @Override
    public String toString(){
        return masv+" "+ten+" "+sdt;
    }
}
class bt{
    private String nhom,detai;
    public bt(int i,String detai){
        this.nhom = String.format("%d", i);
        this.detai = detai;
    }
    public String getnhom(){
        return nhom;
    }
    @Override
    public String toString(){
        return detai;
    }
}
// 5 2
// B17DTCN001
// Nguyen Chi  Linh
// 0987345543
// 1
// B17DTCN011
// Vu Viet Thang
// 0981234567
// 1
// B17DTCN023
// Pham Trong Thang
// 0992123456
// 1
// B17DTCN022
// Nguyen Van  Quyet
// 0977865432
// 2
// B17DTCN031
// Ngo Thanh Vien
// 0912313111
// 2
// Xay dung website ban dien thoai truc tuyen
// Xay dung ung dung quan ly benh nhan Covid-19
// 1
// 1