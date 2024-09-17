import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class hinhsao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        Arrays.fill(a,0);
        for(int i=1;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x]++;
            a[y]++;
        }
        int dem1 = 0,dem2 =0;
        for(int i=1;i<=n;i++){
            if(a[i] == n-1) dem1++;
            if(a[i] == 1) dem2++;
        }
        if(dem1==1 && dem2 == n-1) System.out.println("Yes");
        else System.out.println("No");
    }
}
