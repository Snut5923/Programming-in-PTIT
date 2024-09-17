import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a[]= new long[93];
        a[1]=1;
        a[2]=1;
        for(int i=3;i<=92;i++){
            a[i] = a[i-2] + a[i-1];
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++){
            int x = sc.nextInt();
            System.out.println(a[x]);
        }
    }
}