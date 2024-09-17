import java.util.ArrayList;
import java.util.Scanner;

public class lietkesinhvientheokhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<jkl> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new jkl(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int j = Integer.parseInt(sc.nextLine());
        while(j-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+s+":");
            for(jkl x : kq){
                if(x.check(s)) System.out.println(x);
            }
        }
    }
}
class jkl{
    private String ma,ten,lop,mail;
    public jkl(String ma,String ten,String lop,String mail){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public boolean check(String s){
        if(s.substring(2).equals(this.lop.substring(1,3))) return true;
        return false;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
}