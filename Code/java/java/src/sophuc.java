import java.util.Scanner;

public class sophuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            i a = new i(sc.nextInt(),sc.nextInt());
            i b = new i(sc.nextInt(),sc.nextInt());
            a.c(b);
            a.d(b);
            System.out.println(a);
        }
    }
}
class i{
    private int ao,thuc;
    private int cao,cthuc,dao,dthuc;
    public i(int thuc,int ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    public void c(i a){
        int x = a.thuc + thuc;
        int y = a.ao + ao;
        cthuc = x*thuc - y*ao;
        cao = x*ao + y*thuc;
    }
    public void d(i a){
        int x = thuc + a.thuc;
        int y = ao + a.ao;
        dthuc = x*x - y*y;
        dao = 2*x*y;
    }
    @Override
    public String toString(){
        String dau1,dau2;
        if(cao <0) dau1 = " - ";
        else dau1 = " + ";
        if(dao < 0) dau2 = " - ";
        else dau2 = " + ";
        return cthuc+dau1+Math.abs(cao)+"i, "+dthuc+dau2+Math.abs(dao)+"i";
    }
}