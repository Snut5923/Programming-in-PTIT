import java.util.Scanner;

public class tinhtoanphanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            pso a = new pso(sc.nextLong(),sc.nextLong());
            pso b = new pso(sc.nextLong(),sc.nextLong());
            a.c(b);
            a.d(b);
            System.out.println(a);
        }
    }
}
class pso{
    private long tu,mau;
    private long ctu,cmau,dtu,dmau;
    public pso(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long ucln(long a,long b){
        long tmp;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public void c(pso a){
        long x = a.tu*mau + a.mau*tu;
        long y = a.mau*mau;
        long tmp = ucln(x,y);
        ctu = (x/tmp)*(x/tmp);
        cmau = (y/tmp)*(y/tmp);
    }
    public void d(pso a){
        long x = a.tu*tu*ctu;
        long y = a.mau*mau*cmau;
        long tmp = ucln(x,y);
        dtu = x / tmp;
        dmau = y/tmp;
    }
    @Override
    public String toString(){
        return ctu+"/"+cmau+" "+dtu+"/"+dmau;
    }
}