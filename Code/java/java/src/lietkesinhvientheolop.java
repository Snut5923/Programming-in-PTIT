import java.util.*;
public class lietkesinhvientheolop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ghi> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new ghi(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int j = Integer.parseInt(sc.nextLine());
        while(j-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+s+" :");
            for(ghi x : kq){
                if(x.check(s)) System.out.println(x);
            }
        }
    }
}
class ghi{
    private String ma,ten,lop,mail;
    public ghi(String ma,String ten,String lop,String mail){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public boolean check(String s){
        if(s.equals(this.lop)) return true;
        return false;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
}