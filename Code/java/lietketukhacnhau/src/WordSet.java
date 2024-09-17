import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String res = "";
        for(String x : set){
           res += x + "\n";
        }
        return res;
    }
}
