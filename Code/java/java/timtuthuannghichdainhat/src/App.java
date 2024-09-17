import java.io.File;
import java.io.IOException;
import java.util.*;
public class App {
    public static boolean check(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) throws Exception,IOException {
        // Scanner sc= new Scanner(new File("D:/1.txt"));
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> a = new LinkedHashSet<>();
        HashMap<String,Integer> b = new HashMap<>();
        int n = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                a.add(s);
                n = Math.max(n, s.length());
                if(!b.containsKey(s)){
                    b.put(s, 1);
                }
                else{
                    int x = b.get(s);
                    b.put(s, x+1);
                }
            }
            if(s.isEmpty()) break;
        }
        int dem = 0;
        for(String x : a){
            if(x.length()==n) System.out.println(x+" "+b.get(x));
        }
    }
}
// AAA BAABA HDHDH ACBSD SRGTDH DDDDS
// DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
// DDDAS HDHDH HDH AAA AAA AAA AAA AAA
// AAA AAA AAA
// DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
// TDTD