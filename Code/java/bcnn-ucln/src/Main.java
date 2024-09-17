import java.util.Scanner;

public class Main {
    static long ucln(long a, long b){
        long tmp;
        while(b !=0 ){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(a*b/ucln(a,b)+" ");
            System.out.println(ucln(a,b));
        }

    }
}