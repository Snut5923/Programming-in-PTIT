import java.util.Scanner;

public class solienke {
    static void xuli(char c[]){
        for(int i=2;i<c.length-1;i++){
            if(Math.abs(c[i]-c[i-1])==1 && Math.abs(c[i]-c[i+1])==1 ){
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
            char[] c= s.toCharArray();
            xuli(c);

        }
    }
}
