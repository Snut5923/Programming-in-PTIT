import java.util.Scanner;

public class Main {
    static long gt(int n){
        long x=1;
        for(int i=1;i<=n;i++){
            x = x * i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong =0;
        for(int i=1;i<=n;i++){
            tong = tong + gt(i);
        }
        System.out.println(tong);
    }
}