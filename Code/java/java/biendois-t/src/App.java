import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int j = Integer.parseInt(sc.nextLine());
        while(j-->0){
            String x = sc.nextLine();
            String[] tmp = x.split("\\s+");
            int s = Integer.parseInt(tmp[0]);
            int t = Integer.parseInt(tmp[1]);
            int dem = 0;
            while(s!=t){
                if(s <= t/2){
                    s*=2;
                    dem++;
                }
                else{
                    
                    s-=1;
                    dem++;
                    
                }
            }
            System.out.println(dem);
        }
    }
}
