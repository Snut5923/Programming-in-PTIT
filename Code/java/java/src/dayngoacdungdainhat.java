import java.util.Scanner;
import java.util.Stack;

public class dayngoacdungdainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push(i);
                }
                else {
                    st.pop();
                    if (st.size() > 0) {
                        res = Math.max(res, i - st.peek());
                    }
                    if (st.size() == 0) {
                        st.push(i);
                    }
                }
            }
            System.out.println(res);
        }
    }
}