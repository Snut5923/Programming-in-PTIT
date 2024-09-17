import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<nv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new nv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        long tong = 0;
        for(nv x : kq){
            System.out.println(x);
            tong += x.thuclinh();
        }
        System.out.println("Tong chi phi tien luong: "+tong);
    }
}
// 5
// Cao Van Vu
// 50000
// 26
// GD
// Bui Thi Trang
// 45000
// 23
// PGD
// Do Van Truong
// 40000
// 25
// PGD
// Nguyen Van Cam
// 37000
// 26
// TP
// Truong Thi Tu Linh
// 45000
// 22
// NV