import java.util.Scanner;

public class boisonhonhatcuansonguyenduongdautien {
    static long ucln(long a,long b){
        long tmp;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    static long bcnn(long a,long b){
        return a*b/ucln(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long res = 1;
            for(long i=1;i<=n;i++){
                res = bcnn(res,i);
            }
            System.out.println(res);
        }
    }
}
