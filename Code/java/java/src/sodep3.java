import java.util.Scanner;

public class sodep3 {
    static boolean nt(char c){
        int n = c - '0';
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    static int check(char[] c){
        for(int i=0;i<c.length;i++){
            if(!nt(c[i])){
                return 0;
            }
        }
        return 1;
    }
    static int tn(char[] c){
        int l=0;
        int r=c.length-1;
        while(l<=r){
            if(c[l]!=c[r]) return 0;
            l++;
            r--;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            if(tn(c)==1 && check(c)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
