import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] dem = new int[1001];
        Arrays.fill(dem,0);
        for(int i=0;i<100000;i++){
            dem[sc.readInt()]++;
        }
        for(int i=0;i<=1000;i++){
            if(dem[i] > 0){
                System.out.println(i+" "+dem[i]);
            }
        }
    }
}
