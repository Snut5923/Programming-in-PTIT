import java.util.HashSet;
import java.util.Scanner;

public class danhdauchucai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Integer> set = new HashSet<>();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            set.add(c[i]-'0');
        }
        System.out.println(set.size());
    }
}
