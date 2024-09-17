import java.util.Scanner;

public class sodep1 {
    static int chan(char[] c){
        for(int i=0;i<c.length;i++){
            if((c[i] - '0')%2!=0){
                return 0;
            }
        }
        return 1;
    }
    static int tn(char[] c){
        int l=0;
        int r=c.length-1;
        while(l<=r){
            if(c[l] != c[r]){
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
            char[] c= s.toCharArray();
            if(chan(c)==1 && tn(c)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
