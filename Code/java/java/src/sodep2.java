import java.util.Scanner;

public class sodep2 {
    static int tong(char[] c){
        if(c[0]=='8' && c[c.length-1]==c[0]){
            int sum = 0;
            for(char x : c){
                sum += x - '0';
            }
            if(sum%10==0) return 1;
            return 0;
        }
        return 0;
    }
    static int tn(char[] c){
        int l=0;
        int r=c.length-1;
        while(l<=r){
            if(c[l]!=c[r]){
                return 0;
            }
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
            if(tong(c)==1 && tn(c)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
