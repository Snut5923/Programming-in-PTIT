import java.util.*;
public class lietkesinhvientheonganh {
    public static String doi(String s){
        if(s.equals("Ke toan")) return "DCKT";
        else if(s.equals("Cong nghe thong tin")) return "DCCN";
        else if(s.equals("An toan thong tin")) return "DCAT";
        else if(s.equals("Vien thong")) return "DCVT";
        return "DCDT";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<langa> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new langa(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int j = Integer.parseInt(sc.nextLine());
        while(j-->0){
            String s = sc.nextLine();
            String p = doi(s);
            System.out.println("DANH SACH SINH VIEN NGANH "+s.toUpperCase()+":");
            for(langa x : kq){
                if(x.check(p)){
                    System.out.println(x);
                }
            }
        }
    }
}
class langa{
    private String ma,ten,lop,email;
    public langa(String ma,String ten,String lop,String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public boolean check(String s){
        String x = ma.substring(3,7);
        if(x.equals(s)){
            if(x.equals("DCCN") || x.equals("DCAT")){
                if(lop.charAt(0)=='E') return false;
                return true;
            }
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+email;
    }
}