import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<hang> a = new ArrayList<>();
        for(int i=1;i<=t;i++){
            hang x = new hang(i);
            x.nhap();
            a.add(x);
        }
        Collections.sort(a);
        for(hang y : a){
            System.out.println(y.toString());
        }
    }
}