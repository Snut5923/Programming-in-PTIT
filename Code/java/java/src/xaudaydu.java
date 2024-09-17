import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class xaudaydu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Set<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    set.add(s.charAt(i));
                }
            }
            if(s.length()<26){
                System.out.println("NO");
            }
            else{
                int x = 26 - set.size();
                if(x>=0 && x<=k) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
