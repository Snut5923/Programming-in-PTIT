import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class lietketukhacnhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String s;
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNextLine()){
            s = sc.nextLine();
            String[] tmp = s.split(" ");
            for(String x : tmp){
                set.add(x.toLowerCase());
            }
        }
        for(String i : set){
            System.out.println(i);
        }
    }
}
