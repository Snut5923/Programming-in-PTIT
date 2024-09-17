import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class songuyentotrongfilenhiphan {
    static boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return (n>1);
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        int[] dem = new int[10001];
        for(int x : a){
            dem[x]++;
        }
        for(int i=2;i<=10000;i++){
            if(nt(i) && dem[i]>0){
                System.out.println(i+" "+dem[i]);
            }
        }
    }
}
