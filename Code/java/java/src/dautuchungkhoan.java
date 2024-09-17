import java.util.Scanner;
import java.util.Stack;

public class dautuchungkhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int[] res = new int[n+1];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i=1;i<=n;i++){
                while(!st.empty() && a[i] >= a[st.peek()]) st.pop();
                if(st.empty()) res[i] = 0;
                else res[i] = st.peek();
                st.push(i);
            }
            for(int i=1;i<=n;i++){
                System.out.print(i-res[i] + " ");
            }
            System.out.println();
        }
    }
}
