import java.util.Scanner;

public class giaocuahaidayso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] dema = new int[1001];
        int[] demb = new int[1001];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            dema[a[i]] = 1;
        }
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
            demb[b[i]] = 1;
        }
        for(int i=1;i<=1000;i++){
            if(dema[i]==1 && demb[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
