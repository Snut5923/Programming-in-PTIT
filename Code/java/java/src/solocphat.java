import java.util.*;

public class solocphat {
    public static void xuli(int n){
        Queue<String> q = new LinkedList<>();
        ArrayList<String> kq = new ArrayList<>();
        q.add("6");
        q.add("8");
        while(true){
            if(q.peek().length()>n) break;
            else{
                String s = q.poll();
                kq.add(s);
                q.add(s+"6");
                q.add(s+"8");
            }
        }
        System.out.println(kq.size());
        for(int i=kq.size()-1;i>=0;i--){
            System.out.print(kq.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            xuli(n);
        }
    }
}
