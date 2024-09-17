import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loaibosonguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        ArrayList<String> kq = new ArrayList<>();
        while(sc.hasNext()){
            s = sc.next();
            try {
                Integer.parseInt(s);
            }
            catch (Exception e){
                kq.add(s);
            }
        }
        Collections.sort(kq);
        for(String x : kq){
            System.out.print(x + " ");
        }
    }
}
