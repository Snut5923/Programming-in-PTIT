import java.util.Scanner;
import java.util.Stack;

public class xaudoixung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            int l=0;
            int r=c.length-1;
            int dem=0;
            while(l<=r){
                if(c[l]!=c[r]){
                    dem++;
                }
                l++;
                r--;
            }
            if(dem == 0 && c.length%2==1){
                System.out.println("YES");
            }
            else{
                if(dem==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
