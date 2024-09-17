import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    private String tenfile;
    private TreeSet<String> set1 = new TreeSet<>();
    private TreeSet<String> set2 = new TreeSet<>();
    public WordSet(String tenfile) throws IOException{
        this.tenfile = tenfile;
        Scanner sc = new Scanner(new File(this.tenfile));
        while(sc.hasNext()){
            String s = sc.nextLine().toLowerCase();
            String[] tmp = s.trim().split("\\s+");
            for(String i : tmp){
                set1.add(i);
                set2.add(i);
            }
        }
    }
    public String union(WordSet x){
        StringBuilder sb = new StringBuilder();
        set1.addAll(x.set1);
        for(String i : set1){
            sb.append(i+" ");
        }
        return sb.toString();
    }
    public String intersection(WordSet x){
        StringBuffer sb = new StringBuffer();
        for(String i : set2){
            if(x.set2.contains(i)){
                sb.append(i+" ");
            }
        }
        return sb.toString();
    }
}