import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<hang> a = new ArrayList<>();
        for(int i=1; i<=t; i++){
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = sc.nextInt();
            int giaban = sc.nextInt();
            if(sc.hasNextLine()){
                sc.nextLine();
            }
            a.add(new hang(ten,donvi,giamua,giaban,i));
        }
        Collections.sort(a);
        for(hang y : a){
            System.out.println(y);
        }
    }
}