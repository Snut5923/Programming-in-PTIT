import java.util.ArrayList;
import java.util.Scanner;

public class uscln {
    public static int ucln(int a,int b){
        int tmp;
        while(b!=0){
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static int bcnn(int a,int b){
        return a*b/ucln(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a= new int[n];
            ArrayList<Integer> kq = new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            kq.add(a[0]);
            for(int i=0;i<n-1;i++){
                kq.add(bcnn(a[i],a[i+1]));
            }
            kq.add(a[n-1]);
            for(int x : kq){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
