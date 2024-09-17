import java.util.*;

public class rutgonxaukytu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();

        Stack<Character> st= new Stack<>();
        for(int i=0;i<c.length;i++){
            if(!st.empty() && st.peek() == c[i]){
                st.pop();
            }
            else st.push(c[i]);
        }
        if(st.empty()){
            System.out.println("Empty String");
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(char x : st){
                sb.append(x);
            }
            System.out.println(sb);
        }
    }
}
