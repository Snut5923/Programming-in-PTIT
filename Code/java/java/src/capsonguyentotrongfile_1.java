import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class capsonguyentotrongfile_1 {
    static boolean nt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return (n>1);
    }
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        ObjectInputStream a1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream a2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> set1 = new TreeSet<>((ArrayList) a1.readObject());
        Set<Integer> set2 = new TreeSet<>((ArrayList) a2.readObject());
        for(Integer i : set1){
            if(nt(i) && nt(1000000-i) && set2.contains(1000000-i) && (i < 1000000-i)){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
}
