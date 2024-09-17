import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }

}
class IntSet{
    private TreeSet<Integer> set = new TreeSet<>();
    public IntSet (int[] a){
        for(int x : a){
            set.add(x);
        }
    }
    public IntSet (TreeSet<Integer> x){
        this.set = x;
    }
    public IntSet union(IntSet x){
        this.set.addAll(x.set);
        return new IntSet(this.set);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int x : this.set){
            sb.append(x+" ");
        }
        return sb.toString();
    }
}