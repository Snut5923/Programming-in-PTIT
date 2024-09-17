import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class dayconcotongle {
    static int n,ok;
    static int[] a = new int[20];
    static void kt(){
        for(int i=1;i<=n;i++){
            a[i] = 0;
        }
    }
    static void sinh(){
        int i = n;
        while(i>0 && a[i]==1){
            a[i] = 0;
            i--;
        }
        if(i>0){
            a[i] = 1;
        }
        else ok = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            ArrayList<String> kq = new ArrayList<>();
            n = sc.nextInt();
            Integer[] b = new Integer[n];
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b, Collections.reverseOrder());
            ok = 1;
            kt();
            while(ok!=0){
                sinh();
                int tong = 0;
                StringBuilder sb = new StringBuilder();
                for(int i=1;i<=n;i++){
                    if(a[i]==1){
                        sb.append(b[i-1]+" ");
                        tong += b[i-1];
                    }
                }
                if(tong%2==1) kq.add(sb.toString());
            }
            for(String x : kq){
                System.out.println(x);
            }
        }
    }
}
