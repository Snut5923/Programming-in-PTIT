import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static boolean check(int n){
        String s = Integer.toString(n);
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList) ois2.readObject();
        HashMap<Integer,Integer> dem1 = new HashMap<>();
        HashMap<Integer,Integer> dem2 = new HashMap<>();
        TreeSet<Integer> kq = new TreeSet<>();
        for(int i : a1){
            if(check(i) && nt(i) && a2.contains(i)){
                kq.add(i);
                if(!dem1.containsKey(i)){
                    dem1.put(i, 1);
                }
                else{
                    int x = dem1.get(i);
                    dem1.put(i, x+1);
                }
            }

        }
        for(int i : a2){
            if(kq.contains(i)){
                if(!dem2.containsKey(i)){
                    dem2.put(i, 1);
                }
                else{
                    int x = dem2.get(i);
                    dem2.put(i, x+1);
                }
            }
        }
        for(int x : kq){
            System.out.println(x+" "+dem1.get(x)+" "+dem2.get(x));
        }
    }
}
