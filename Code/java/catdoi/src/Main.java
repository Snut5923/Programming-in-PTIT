import java.util.Scanner;

public class Main {
    static void split(char c[]){
        for(int i=0;i<c.length;i++){
            if(c[i] == '0' ||c[i] == '1' ||c[i] == '8'||c[i] == '9'){
                if(c[i] =='8' || c[i] =='9'){
                    c[i] ='0';
                }
            }
            else{
                System.out.println("INVALID");
                return;
            }
        }
        int tmp =0;
        while(tmp < c.length && c[tmp]=='0'){
            tmp++;
        }
        if(tmp == c.length){
            System.out.println("INVALID");
        }
        else{
            for(int i = tmp;i<c.length;i++){
                System.out.print(c[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            split(c);

        }
    }
}