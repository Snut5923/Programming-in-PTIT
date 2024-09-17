import java.util.Scanner;

public class daotu {
    static void reverse(String a){
        char[] c = a.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
        System.out.print(" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for(String x : a){
                reverse(x);
            }
            System.out.println();
        }
    }
}
