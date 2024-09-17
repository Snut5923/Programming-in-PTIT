import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyelon_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger n = new BigInteger(sc.next());
            BigInteger m = new BigInteger(sc.next());
            String s = String.valueOf(n.subtract(m).abs());
            int max = Math.max(String.valueOf(n).length(),String.valueOf(m).length());
            while(s.length()<max){
                s = "0"+s;
            }
            System.out.println(s);
        }
    }
}
