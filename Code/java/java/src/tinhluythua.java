import java.util.Scanner;

public class tinhluythua {
    static long nhan(long a,long b){
        long mod = 1000000007;
        if(b==0) return 0;
        long tmp = nhan(a,b/2);
        if(b%2==0) return tmp*2%mod;
        else return (tmp*2+a)%mod;
    }
    static long lt(int a,long b){
        long mod = 1000000007;
        if(b==0) return 1;
        if(b==1) return a%mod;
        long tmp = lt(a,b/2);
        long x = nhan(tmp,tmp);
        if(b%2==0) return x%mod;
        else return x*a%mod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(1 > 0){
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(a ==0 && b==0) break;
            else{
                System.out.println(lt(a,b));
            }
        }
    }
}
