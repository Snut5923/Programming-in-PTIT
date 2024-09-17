import java.util.Scanner;
import java.util.TreeSet;

public class tapturiengcuahaixau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a1 = s1.split(" ");
            String[] a2 = s2.split(" ");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            for(String x : a1){
                set1.add(x);
            }
            for(String y : a2){
                set2.add(y);
            }
            for(String x : set1){
                if(!set2.contains(x)){
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}
