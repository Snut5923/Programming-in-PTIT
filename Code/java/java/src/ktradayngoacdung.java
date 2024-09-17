import java.util.Scanner;
import java.util.Stack;

public class ktradayngoacdung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<Character> st = new Stack<>();
            String s = sc.next();
            char[] c = s.toCharArray();
            for(int i=0;i<c.length;i++) {
                if(c[i]=='['||c[i]=='{'||c[i]=='(') st.push(c[i]);
                else{
                    if(st.empty()) st.push(c[i]);
                    if(((c[i] == ']' && st.peek() == '[') ||
                            (c[i] == '}' && st.peek() == '{') ||
                            (c[i] == ')' && st.peek() == '('))) st.pop();

                }
            }
            if(st.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
