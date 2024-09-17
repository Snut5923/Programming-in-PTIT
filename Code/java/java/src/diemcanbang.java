import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sum = new int[n];
            int tong=0;
            int check=0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                tong += a[i];
                sum[i] = tong;
            }
            for(int i=1;i<n-1;i++){
                if(tong-a[i] == sum[i-1]*2){
                    System.out.println(i+1);
                    check++;
                    break;
                }
            }
            if(check==0) System.out.println("-1");
        }
    }
}
