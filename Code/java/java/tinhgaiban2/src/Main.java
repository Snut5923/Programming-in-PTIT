import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new hang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(hang x : kq){
            System.out.println(x);
        }
    }
}
// 4
// DUONG
// KG
// 7500
// 150
// TRUNG
// CHUC
// 10000
// 225
// GAO
// KG
// 14000
// 118
// SUA
// HOP
// 48000
// 430