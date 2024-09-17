import java.util.Arrays;
import java.util.Scanner;

public class khoangcachnhohonk {
    static int lowerbound(int n,int[] a,int k){
        int l = 0;
        int r = n;
        int m;
        while(l<r){
            m = (l+r)/2;
            if(a[m] >= k){
                r = m;
            }
            else{
                l = m+1;
            }
        }
        if(l<n && a[l] < k){
            l++;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long dem = 0;
            for(int i=0;i<n-1;i++){
                int x = lowerbound(n,a,a[i] + k);
                if(x-i-1 > 0) dem += x-i-1;
            }
            System.out.println(dem);
        }
    }
}
