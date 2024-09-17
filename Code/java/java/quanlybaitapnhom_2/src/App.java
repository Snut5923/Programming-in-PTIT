import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<sv> a = new ArrayList<>();
        HashMap<String,String> b = new HashMap<>();
        while(n-->0){
            sv x = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        for(int i=1;i<=m;i++){
           b.put(String.format("%d",i), sc.nextLine());
        }
        Collections.sort(a);
        for(sv x : a){
            System.out.println(x+b.get(x.getnhom()));
        }

    }
}
class sv implements Comparable<sv>{
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
        return masv+" "+ten+" "+sdt+" "+nhom+" ";
    }
    @Override
    public int compareTo(sv x){
        return masv.compareTo(x.masv);
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
