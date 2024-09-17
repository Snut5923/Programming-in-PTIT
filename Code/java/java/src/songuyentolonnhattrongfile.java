import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class songuyentolonnhattrongfile {
    static boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        ArrayList<Integer> kq = new ArrayList<>();
        int[] dem = new int[1000005];
        Arrays.fill(dem,0);
        for(int i : a){
            if(nt(i)){
                if(dem[i]==0){
                    kq.add(i);
                }
                dem[i]++;
            }
        }
        Collections.sort(kq,Collections.reverseOrder());
        for(int j=0;j<10;j++){
            System.out.println(kq.get(j)+" "+dem[kq.get(j)]);
        }
    }
}
