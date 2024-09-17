import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++){
            int n = sc.nextInt();
            int check = 0;
            if(n>1){
                int j;
                for(j=2 ;j<= Math.sqrt(n); j++){
                    if(n%j==0){
                        check++;
                        break;
                    }
                }
            }
            if(check > 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}