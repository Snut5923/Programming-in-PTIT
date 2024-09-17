import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mahoadrm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<Character,Integer> arr = new HashMap<>();
        Map<Integer,Character> mp = new HashMap<>();
        for(char i='A';i<='Z';i++){
            arr.put(i , i - 'A');
            mp.put(i-'A',i);
        }
        while(t-->0){
            String s = sc.nextLine();
            int n = s.length();
            String a = s.substring(0,n/2);
            String b = s.substring(n/2);
            int k =0,l=0;
            for(int i=0;i<a.length();i++){
                k += arr.get(a.charAt(i));
                l += arr.get(b.charAt(i));
            }
            String x = xoay(a,k,arr,mp);
            String y = xoay(b,l,arr,mp);
            System.out.println(tron(x,y,arr,mp));
        }
    }
    public static String xoay(String s,int n,Map<Character,Integer> arr,Map<Integer,Character> mp){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int x = arr.get(s.charAt(i)) + n;
            sb.append(mp.get(x%26));
        }
        return sb.toString();
    }
    public static String tron(String a,String b,Map<Character,Integer> arr,Map<Integer,Character> mp){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++){
            int x = arr.get(a.charAt(i)) + arr.get(b.charAt(i));
            sb.append(mp.get(x%26));
        }
        return sb.toString();
    }
}
