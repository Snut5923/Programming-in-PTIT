import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class phantubenphaidautienlonhon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            Stack<Long> st = new Stack<>();
            long[] a = new long[n];
            long[] res = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=n-1;i>=0;i--){
                while(!st.empty() && a[i] >= st.peek() ){
                    st.pop();
                }
                if(st.empty()) res[i] = -1;
                else res[i] = st.peek();
                st.push(a[i]);
            }
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
