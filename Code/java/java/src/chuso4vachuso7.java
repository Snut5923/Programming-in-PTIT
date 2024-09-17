import java.util.Scanner;

public class chuso4vachuso7 {
    static void xuli(char c[]){
        int dem4=0, dem7=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='4') dem4++;
            if(c[i]=='7') dem7++;
        }
        int x = dem4+dem7;
        if(x==4 || x==7){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c= s.toCharArray();
        xuli(c);
    }
}
