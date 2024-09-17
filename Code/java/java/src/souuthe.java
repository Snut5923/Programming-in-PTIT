import java.util.Scanner;

public class souuthe {
    static int check(char c){
        if(c>='0' && c<='9'){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toCharArray();
            int chan =0,le=0;
            int check = 0;
            for(int i=0;i<c.length;i++){
                if(check(c[i])==0){
                    System.out.println("INVALID");
                    check++;
                    break;
                }
                if((c[i]-'0')%2==0) chan++;
                else le++;
            }
            if(check==0){
                if((chan>le && c.length%2==0) || (le>chan && c.length%2==1)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
