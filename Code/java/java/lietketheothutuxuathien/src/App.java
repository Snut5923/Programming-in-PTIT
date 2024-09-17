import java.util.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList) ois.readObject();
        HashSet<String> b = new HashSet<>();
        for(String x : a){
            String[] tmp = x.toLowerCase().trim().split("\\s+");
            for(String i : tmp){
                b.add(i);
            }
        }
        HashSet<String> inroi = new HashSet<>();

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(b.contains(s) && !inroi.contains(s)){
                System.out.println(s);
                inroi.add(s);
            }
        }
    }
}
