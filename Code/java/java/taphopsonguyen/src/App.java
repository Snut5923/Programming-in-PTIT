import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
        TreeSet<Integer> set4 = new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            set1.add(a[i]);
            set3.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            set2.add(b[i]);
            set4.add(b[i]);
        }
        for(int i : set1){
            if(set2.contains(i)) System.out.print(i+" ");
        }
        System.out.println();
        set1.removeAll(set2);
        for(int i : set1){
            System.out.print(i+" ");
        }
        System.out.println();
        set4.removeAll(set3);
        for(int i : set4){
            System.out.print(i+" ");
        }
    }
}
// 5 6
// 1 2 3 4 5
// 3 4 5 6 7 8