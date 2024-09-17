import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++){
            int n = sc.nextInt();
            System.out.print("Test "+i+": ");
            for(int j=2;j<=n;j++){
                int dem=0;
                if(n%j==0) {
                    while (n % j == 0) {
                        n = n / j;
                        dem++;
                    }
                    System.out.print(j +"(" + dem +") ");
                }
            }
            System.out.println();
        }
    }
}