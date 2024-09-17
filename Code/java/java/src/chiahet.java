import java.math.BigInteger;
import java.util.Scanner;

public class chiahet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if(a.compareTo(b) < 0){
                if(b.divide(a).multiply(a).equals(b)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else{
                if(a.divide(b).multiply(b).equals(a)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
