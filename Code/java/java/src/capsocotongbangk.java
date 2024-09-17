import java.util.HashMap;
import java.util.Scanner;

public class capsocotongbangk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashMap<Integer,Integer> mp = new HashMap<>();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(!mp.containsKey(a[i])){
                    mp.put(a[i],0);
                }
                mp.put(a[i],mp.get(a[i])+1);
            }
            long res = 0;
            for(int i=0;i<n;i++){
                if(mp.get(k-a[i])!= null) res+=mp.get(k-a[i]);
                if(k-a[i] == a[i]) res--;
            }
            if(res!=0) System.out.println(res/2);
            else System.out.println("-1");
        }
    }
}
