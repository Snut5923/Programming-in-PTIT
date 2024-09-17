public class Main {
    static void in(phanso x){
        long a = x.getTuso(), b = x.getMauso();
        long tmp ;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println((x.getTuso()/a)+"/"+(x.getMauso()/a));
    }
    public static void main(String[] args) {
        phanso a = new phanso();
        a.nhap();
        in(a);
    }
}