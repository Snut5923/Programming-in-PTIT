import java.util.Scanner;

public class biensodep {
    static int tangchat(char[] c){
        for(int i=0;i<c.length-1;i++){
            if(c[i]-c[i+1] >= 0) return 0;
        }
        return 1;
    }
    static int bang(char[] c){
        if(c[0] == c[1] && c[1] == c[2] && c[2]==c[3] && c[3]==c[4]) return 1;
        return 0;
    }
    static int bavahai(char[] c){
        if(c[0] == c[1] && c[1] == c[2] && c[3]==c[4]) return 1;
        return 0;
    }
    static int locphat(char[] c){
        for(char x : c){
            if(x == '6' || x=='8') continue;
            return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
           String s = sc.next();
           s = s.substring(5);
           StringBuilder sb = new StringBuilder();
           sb.append(s.substring(0,3));
           sb.append(s.substring(4));
           char[] c = sb.toString().toCharArray();
           if(tangchat(c)==1 || bang(c)==1 || bavahai(c)==1 || locphat(c)==1) System.out.println("YES");
           else System.out.println("NO");
        }
    }
}
