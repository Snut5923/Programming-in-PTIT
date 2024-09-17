import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07006 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        int[] dem = new int[1001];
        for(int i : a){
            dem[i]++;
        }
        for(int i=0;i<=1000;i++){
            if(dem[i] > 0){
                System.out.println(i+" "+dem[i]);
            }
        }
    }
}
