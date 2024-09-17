import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dayconlientieptongbangk {
    static boolean search(int i,long[] a,long k){
        int m;
        int l = i;
        int r = a.length-1;
        while(l<=r){
            m = (l+r)/2;
            if(a[m] == k){
                return true;
            }
            if(a[m] < k){
                l = m+1;
            }
            if(a[m] > k){
                r = m-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            boolean check = false;
            int[] a = new int[n+1];
            a[0] = 0;
            long[] tong = new long[n+1];
            tong[0] =0;
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
                tong[i] = a[i] + tong[i-1];
            }
            for(int i=1;i<=n;i++){
                if(search(i,tong,k+tong[i-1])){
                    check = true;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
