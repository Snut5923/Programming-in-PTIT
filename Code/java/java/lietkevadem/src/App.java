import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) - s.charAt(i+1) > 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(new File("D:/1.txt"));
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> mp = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        ArrayList<number> kq = new ArrayList<>();
        String s = "";
        while(sc.hasNext()){
            s += sc.nextLine()+" ";
        }
        String[] tmp = s.split("\\s+");
            for(int i=0;i<tmp.length;i++){
                if(check(tmp[i])){
                    set.add(tmp[i]);
                    if(!map.containsKey(tmp[i])){
                        map.put(tmp[i], i);
                    }
                    if(!mp.containsKey(tmp[i])){
                        mp.put(tmp[i], 1);
                    }
                    else{
                        int x = mp.get(tmp[i]);
                        mp.put(tmp[i], x+1);
                    }
                }
            }
        for(String x : set){
            kq.add(new number(x, mp.get(x), map.get(x)));
        }
        Collections.sort(kq);
        for(number x : kq){
            System.out.println(x);
        }
    }
}
class number implements Comparable<number>{
    private String so;
    private int thutu,dem;
    public number(String so,int dem,int thutu){
        this.so = so;
        this.dem = dem;
        this.thutu = thutu;
    }
    @Override
    public String toString(){
        return so+" "+dem;
    }
    @Override
    public int compareTo(number x){
        if(dem!=x.dem){
            if(x.dem > dem) return 1;
            return -1;
        }
        else{
            if(x.thutu < thutu) return 1;
            return -1;
        }
    }
}