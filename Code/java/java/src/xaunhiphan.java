import java.util.Scanner;

public class xaunhiphan {
    static int xuli(int n,long k,long[] l){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k > l[n-2]) return xuli(n-1,k-l[n-2],l);
        return xuli(n-2,k,l);
    }
    public static void main(String[] args){
        long[] l = new long[93];
        l[0] = 0;
        l[1] = 1;
        for(int i=2;i<93;i++){
            l[i] = l[i-1] + l[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(xuli(n,k,l));
        }
    }
}
