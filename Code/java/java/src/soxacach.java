import java.util.Scanner;

public class soxacach {
    static int n,ok;
    static int[] a = new int[100];
    static void kt(){
        for(int i=1;i<=n;i++){
            a[i] = i;
        }
    }
    static void sinh(){
        int i = n-1;
        while(i>0 && a[i]>a[i+1]) i--;
        if(i>0){
            int k = n;
            while(a[i] > a[k]) k--;
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            int r = i+1;
            int s = n;
            while(r<=s){
                tmp = a[r];
                a[r] = a[s];
                a[s] = tmp;
                r++;
                s--;
            }
        }
        else ok =0;
    }
    static int check(){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            ok = 1;
            kt();
            while(ok != 0){
                if(check()==1){
                    for(int i=1;i<=n;i++){
                        System.out.print(a[i]);
                    }
                    System.out.println();
                }
                sinh();
            }
            System.out.println();
        }
    }
}
