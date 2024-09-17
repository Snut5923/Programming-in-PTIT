import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        long a[] = new long[93];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=92;i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int i=1;i<=tc;i++){
            int check=0;
            long n = sc.nextLong();
            for(int j=0;j<=92;j++){
                if(n == a[j]){
                    System.out.println("YES");
                    check=1;
                    break;
                }
            }
            if(check==0) System.out.println("NO");
        }
    }
}