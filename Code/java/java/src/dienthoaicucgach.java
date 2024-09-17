import java.util.Scanner;

public class dienthoaicucgach {
    static void doi(char[] c){
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='b' || c[i]=='c') c[i]='2';
            if(c[i]=='d' || c[i]=='e' || c[i]=='f') c[i]='3';
            if(c[i]=='g' || c[i]=='h' || c[i]=='i') c[i]='4';
            if(c[i]=='j' || c[i]=='k' || c[i]=='l') c[i]='5';
            if(c[i]=='m' || c[i]=='n' || c[i]=='o') c[i]='6';
            if(c[i]=='p' || c[i]=='q' || c[i]=='r' || c[i]=='s') c[i]='7';
            if(c[i]=='t' || c[i]=='u' || c[i]=='v') c[i]='8';
            if(c[i]=='w' || c[i]=='x' || c[i]=='y' || c[i]=='z') c[i]='9';
        }
    }
    static int check(char[] c){
        int l=0;
        int r=c.length-1;
        while (l<=r){
            if(c[l]!=c[r]) return 0;
            l++;
            r--;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            char[] c = s.toLowerCase().toCharArray();
            doi(c);
            if(check(c)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
