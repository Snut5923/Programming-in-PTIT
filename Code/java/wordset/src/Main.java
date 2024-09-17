import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    private TreeSet<String> set1 = new TreeSet<>();
    private TreeSet<String> set2 = new TreeSet<>();
    public WordSet(String s){
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            set1.add(x);
            set2.add(x);
        }
    }
    public String union(WordSet x){
        StringBuilder sb = new StringBuilder();
        set1.addAll(x.set1);
        for(String a : set1){
            sb.append(a+" ");
        }
        return sb.toString();
    }
    public String intersection(WordSet x){
        StringBuilder sb = new StringBuilder();
        for(String a : set2){
            if(x.set2.contains(a)){
               sb.append(a+" ");
            }
        }
        return sb.toString();
    }
}