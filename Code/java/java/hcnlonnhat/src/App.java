import java.util.*;
public class App {
    public static long xuli(long n,long[] a){
        int i= 0;
        long res = 0;
        Stack<Integer> st = new Stack<>();
        while(i<n){
            if(st.empty() || a[i] >= a[st.peek()]){
                st.push(i);
                ++i;
            }
            else{
                int idx = st.peek();
                st.pop();
                if(st.empty()){
                    res = Math.max(res, i*a[idx]);
                }
                else{
                    res = Math.max(res, a[idx] * (i-st.peek()-1));
                }
            }
        }
        while(!st.empty()){
            int idx = st.peek();
            st.pop();
            if(st.empty()){
                res = Math.max(res, i*a[idx]);
            }
            else{
                res = Math.max(res, a[idx] * (i-st.peek()-1));
            }
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[] a = new long[100001];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            System.out.println(xuli(n, a));
        }
    }
}
