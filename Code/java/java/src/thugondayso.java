import java.util.Scanner;
import java.util.Stack;
public class thugondayso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(n-- > 0){
            int t = sc.nextInt();
            if(!st.empty() && (t + st.peek()) %2 ==0){
                st.pop();
            }
            else st.push(t);
        }
        System.out.println(st.size());
    }
}
