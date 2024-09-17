import java.util.Scanner;

public class ttong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++){
            int n = sc.nextInt();
            System.out.println(n*(n+1)/2);
        }
    }
}
