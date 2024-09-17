import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class sokhacnhautrongfile_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] dem = new int[1001];
        Arrays.fill(dem,0);
        while(sc.hasNext()){
            dem[Integer.parseInt(sc.next())]++;
        }
        for(int i=0;i<=1000;i++){
            if(dem[i]!=0){
                System.out.println(i+" "+dem[i]);
            }
        }
    }
}
