import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
class WordSet{
    private TreeSet<String> s1 = new TreeSet<>();
    private TreeSet<String> s2 = new TreeSet<>();
    public WordSet(String s) throws IOException{
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            String t = sc.nextLine();
            String[] tmp = t.trim().toLowerCase().split("\\s+");
            for(String x : tmp){
                s1.add(x);
            }
        }
    }
    public WordSet(TreeSet<String> s){
        this.s1 = s;
    }
    public WordSet difference(WordSet x){
        s2.addAll(s1);
        s2.removeAll(x.s1);
        return new WordSet(s2);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String i : s1){
            sb.append(i+" ");
        }
        return sb.toString();
    }
}