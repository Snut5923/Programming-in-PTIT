import java.util.Scanner;

public class sokhonglienke {
    static int tong(char c[]){
        int sum = 0;
        for(int i=0;i<c.length;i++){
            sum += c[i] - '0';
        }
        if(sum%10==0) return 1;
        return 0;
    }
    static int check(char c[]){
        for(int i=1;i<c.length-1;i++){
            if(Math.abs(c[i]-c[i-1])==2 && Math.abs(c[i]-c[i+1])==2){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            if(tong(c)==1 && check(c)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
