import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new nv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(nv x : kq){
            System.out.println(x);
        }
    }
}
// 3
// Cao Van Vu
// 50000
// 26
// GD
// Do Van Truong
// 40000
// 25
// PGD
// Truong Thi Tu Linh
// 45000
// 22
// NV