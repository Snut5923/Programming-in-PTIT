import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J07021 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> kq = new ArrayList<>();
        String s;
        while(!(s = sc.nextLine()).equals("END")){
            s = s.toLowerCase();
            String[] tmp = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : tmp){
                sb.append(Character.toUpperCase(x.charAt(0)));
                sb.append(x.substring(1));
                sb.append(" ");
            }
            kq.add(sb.toString());
        }
        for(String y : kq){
            System.out.println(y);
        }
    }
}
