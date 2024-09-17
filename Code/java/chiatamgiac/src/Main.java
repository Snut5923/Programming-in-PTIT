import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int c=1; c<=tc; c++){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for(int i = 1; i <= n-1 ; i++){
                double y = i/n;
                double x = h * Math.sqrt(y);
                System.out.print(String.format("%.6f",x)+" ");
            }
            System.out.println();
        }
    }
}
