import java.util.Scanner;
import java.util.Stack;

public class luachonthamlam {
    public static void lonnhat(int n,int s){
        StringBuilder sb = new StringBuilder();
        while(s>0){
            n--;
            if(s >= 9){
                sb.append(9);
                s -= 9;
            }
            else{
                sb.append(s);
                break;
            }
        }
        if(n<0) System.out.print("-1");
        else{
            while(n-->0){
                sb.append(0);
            }
            System.out.print(sb.toString());
        }
    }
    public static void nhonhat(int n,int s){
        Stack<Integer> st = new Stack<>();
        while(s>0){
            n--;
            if(s>=9){
                st.push(9);
                s -= 9;
            }
            else{
                st.push(s);
                break;
            }
        }
        if(n<0) System.out.print("-1");
        else{
            if(n>0){
                int k = st.peek();
                st.pop();
                st.push(k-1);
                while(n>1){
                    st.push(0);
                    n--;
                }
                st.push(1);
            }
            while(!st.empty()){
                System.out.print(st.peek());
                st.pop();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(s==0){
            if(n==1){
                System.out.println("0 0");
            }
            else{
                System.out.println("-1 -1");
            }
        }
        else{
            nhonhat(n,s);
            System.out.print(" ");
            lonnhat(n,s);
        }
    }
}
