import java.util.Scanner;

public class uocsonguyentolonnhat {
    static int nt(long n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        if(n>1) return 1;
        else return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong();
            long res = -1;
            if(nt(n)==1) System.out.println(n);
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        if(nt(i)==1){
                            res = Math.max(res,i);
                        }
                        if(nt(n/i)==1){
                            res = Math.max(res,n/i);
                        }
                    }
                }
                System.out.println(res);
            }
        }
    }
}
