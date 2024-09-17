import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] res = new int[1000001];
        res[1] = 1;
        int dem = 0;
        for(int i=2;i<=b;i++){
            for(int j = i*2;j<=b;j+=i){
                res[j] += i;
            }
        }
        System.out.println(res);
        for(int i=a;i<=b;i++){
            if(res[i]-i > i) dem++;
        }
        System.out.println(dem);
    }
}
