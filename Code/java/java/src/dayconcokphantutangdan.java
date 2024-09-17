import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dayconcokphantutangdan {
    static int n,k,ok;
    static int[] a = new int[20];
    static void kt(){
        for(int i=1;i<=k;i++){
            a[i] = i;
        }
    }
    static void sinh(){
        int i = k;
        while(i>0 && a[i]==n-k+i){
            i--;
        }
        if(i>0){
            a[i] = a[i]+1;
            for(int j=i+1;j<=k;j++){
                a[j] = a[i] + j - i;
            }
        }
        else ok = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            Integer[] b = new Integer[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b);
            ok = 1;
            kt();
            while(ok!=0){
                StringBuilder sb = new StringBuilder();
                for(int i=1;i<=k;i++){
                    System.out.print(b[a[i]-1]+" ");
                }
                System.out.println();
                sinh();
            }
        }
    }
}
