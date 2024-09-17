import java.util.*;
import java.text.*;
import java.io.*;
public class App {
    public static boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeSet<Integer> kq = new TreeSet<>();
        ArrayList<Integer> a1 = (ArrayList) sc1.readObject();
        ArrayList<Integer> a2 = (ArrayList) sc2.readObject();
        HashMap<Integer,Integer> dem1 = new HashMap<>();
        HashMap<Integer,Integer> dem2 = new HashMap<>();
        for(int i : a1){
            if(nt(i) && a2.contains(i)){
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
        for(int i : kq){
            System.out.println(i+" "+dem1.get(i)+" "+dem2.get(i));
        }
    }
}
