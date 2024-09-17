import java.math.BigInteger;
import java.util.Scanner;

public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger n = new BigInteger(sc.next());
            BigInteger m = new BigInteger("11");
            if(n.divide(m).multiply(m).equals(n)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
