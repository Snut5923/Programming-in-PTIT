import java.util.HashMap;
import java.util.Scanner;

public class bobasopytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            HashMap<Long,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                a[i] =(long)x*x;
                if(!mp.containsKey(a[i])){
                    mp.put(a[i],0);
                }
                mp.put(a[i],mp.get(a[i])+1);
            }
            int check=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(mp.containsKey(a[i]+a[j])){
                        System.out.println("YES");
                        check++;
                        break;
                    }
                }
            }
            if(check==0) System.out.println("NO");
        }
    }
}
