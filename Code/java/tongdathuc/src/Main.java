import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
class DaThuc{
    TreeMap<Integer,Integer> mp;
    public DaThuc(DaThuc x){
        mp = new TreeMap<>(Comparator.reverseOrder());
        mp.putAll(x.mp);
    }
    public DaThuc(String s){
        mp = new TreeMap<>(Comparator.reverseOrder());
        String[] a = s.split("[+]");
        for(String x : a){
            x = x.trim();
            if(x.length()>0){
                int[] c = new int[2];
                String[] b = x.split("[*x^]");
                int idx = 0;
                for(String y : b){
                    if(y.length()>0){
                        c[idx++] = Integer.parseInt(y);
                    }
                }
                mp.put(c[1],c[0]);
            }
        }
    }
    public DaThuc cong(DaThuc x){
        DaThuc a = new DaThuc(this);
        for(Map.Entry<Integer,Integer>y : x.mp.entrySet()){
            int key = y.getKey();
            int value = y.getValue();
            if(a.mp.containsKey(key)){
                a.mp.put(key,a.mp.get(key) + value);
            }
            else a.mp.put(key,value);
        }
        return a;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,Integer> x : mp.entrySet()){
            sb.append(x.getValue()+"*x^"+x.getKey()+" + ");
        }
        return sb.toString().substring(0,sb.length()-3);
    }
}