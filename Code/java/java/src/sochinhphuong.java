import java.util.Scanner;

public class sochinhphuong {
    static void xuli(int n){
        double x = Math.sqrt(n);
        if(x == (int)x){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            xuli(n);
        }
    }
}
