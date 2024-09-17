import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,String> mp = new HashMap<>();
        ArrayList<nv> kq = new ArrayList<>();
        while(t-->0){
            String s = sc.nextLine();
            String x = s.substring(0, 2);
            String y = s.substring(3);
            if(!mp.containsKey(x)){
                mp.put(x, y);
            }
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            kq.add(new nv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), mp));
        }
        String tmp = sc.nextLine();
        System.out.println("Bang luong phong "+mp.get(tmp)+":");
        for(nv x : kq){
            if(tmp.equals(x.getmp())) System.out.println(x);
        }
    }
}
class nv{
    private String manv,ten,phong,loai,maphong;
    private long nam,luongcb,luongthang,ngay;
    public nv(String manv,String ten,String luongcb,String ngay,HashMap<String,String> mp){
        this.manv = manv;
        this.ten = ten;
        this.luongcb = Long.parseLong(luongcb);
        this.ngay = Long.parseLong(ngay);
        this.loai = manv.substring(0, 1);
        this.nam = Long.parseLong(manv.substring(1, 3));
        this.maphong = manv.substring(3);
        this.luongthang = this.luongcb*this.ngay*heso()*1000;
        this.phong = mp.get(maphong);
    }
    public long heso(){
        if(loai.equals("A")){
            if(nam>=16) return 20;
            else if(nam>=9) return 14;
            else if(nam>=4) return 12;
            return 10;
        }
        else{
            if(loai.equals("B")){
                if(nam>=16) return 16;
                else if(nam>=9) return 13;
                else if(nam>=4) return 11;
                return 10;
            }
            else{
                if(loai.equals("C")){
                    if(nam>=16) return 14;
                    else if(nam>=9) return 12;
                    else if(nam>=4) return 10;
                    return 9;
                }
                else{
                    if(nam>=16) return 13;
                    else if(nam>=9) return 11;
                    else if(nam>=4) return 9;
                    return 8;
                }
            }
        }
    }
    public String getmp(){
        return maphong;
    }
    @Override
    public String toString(){
        return manv+" "+ten+" "+luongthang;
    }
}
// 2
// HC Hanh chinh
// KH Ke hoach Dau tu
// 2
// C06HC
// Tran Binh Minh
// 65
// 25
// D03KH
// Le Hoa Binh
// 59
// 24