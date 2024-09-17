import java.io.File;
import java.io.IOException;
import java.util.*;
public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
class IntSet{
    private TreeSet<Integer> set = new TreeSet<>();
    public IntSet(int[] a){
        for(int x : a){
            set.add(x);
        }
    }
    public IntSet(TreeSet<Integer> x){
        this.set = x;
    }
    public IntSet intersection(IntSet x){
        TreeSet<Integer> tmp = new TreeSet<>();
        for(int i : set){
            if(x.set.contains(i)) tmp.add(i);
        }
        return new IntSet(tmp);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int x : set){
            sb.append(x+" ");
        }
        return sb.toString();
    }
}
// 5 6
// 1 2 3 4 5
// 3 4 5 6 7 8