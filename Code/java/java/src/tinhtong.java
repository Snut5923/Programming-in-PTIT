import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class tinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        String s;
        while(sc.hasNext()){
            s = sc.next();
            try{
                res += Integer.parseInt(s);
            }
            catch (Exception e){}
        }
        System.out.println(res);
    }
}
