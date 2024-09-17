import java.util.Scanner;
import java.lang.Math;
public class Main {
    static int xuli(int n){
        int dem=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                if(i%2 ==0) dem++;
                if(n/i % 2 == 0) dem++;

            }
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            System.out.println(xuli(n));
        }
    }
}