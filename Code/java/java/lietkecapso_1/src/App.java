import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) ois.readObject();
        ArrayList<Pair> kq = new ArrayList<>();
        HashMap<Pair,Integer> mp = new HashMap<>();
        for(Pair x : a){
            if(x.getFirst() < x.getSecond()){
                if(!mp.containsKey(x)){
                    mp.put(x, 1);
                    kq.add(x);
                }
            }
        }
        Collections.sort(kq);
        for(Pair x : kq){
            System.out.println(x);
        }
    }
}
