import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class sothuannghichtrongfile {
    static boolean tn(int n){
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        if(c.length ==1 || c.length%2==0) return false;
        int l =0;
        int r =c.length-1;
        while(l<r){
            if(c[l]!=c[r]) return false;
            if((c[l]-'0')%2==0) return false;
            l++;
            r--;
        }
        return true;

    }
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream a1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream a2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) a1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) a2.readObject();
        Set<Integer> s1 = new TreeSet<>(arr1);
        Set<Integer> s2 = new TreeSet<>(arr2);
        ArrayList<Integer> kq = new ArrayList<>();
        for(int i : s1){
            if(kq.size()==10) break;
            if(tn(i) && s2.contains(i)){
                kq.add(i);
            }
        }
        for(int i : kq){
            System.out.println(i+" "+ (Collections.frequency(arr1,i)+Collections.frequency(arr2,i)));
        }
    }
}
