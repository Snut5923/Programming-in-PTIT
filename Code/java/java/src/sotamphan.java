import java.util.Scanner;

public class sotamphan {
    static void xuli(char c[]){
        for(int i=0;i<c.length;i++){
            if(c[i]=='0'||c[i]=='1'||c[i]=='2'){
                continue;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            xuli(c);
        }
    }
}
