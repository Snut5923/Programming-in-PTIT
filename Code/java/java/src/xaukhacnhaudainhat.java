import java.util.Scanner;

public class xaukhacnhaudainhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            int res = -1;
            for(int i=0;i<a.length();i++){
                for(int j=i+1;j<=a.length();j++){
                    String tmp = a.substring(i,j);
                    if(!b.contains(tmp)){
                        res = Math.max(res,tmp.length());
                    }
                }
            }
            for(int i=0;i<b.length();i++){
                for(int j=i+1;j<=b.length();j++){
                    String tmp = b.substring(i,j);
                    if(!a.contains(tmp)){
                        res = Math.max(res,tmp.length());
                    }
                }
            }
            System.out.println(res);
        }
    }
}
