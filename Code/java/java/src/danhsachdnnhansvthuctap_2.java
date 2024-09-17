import java.util.*;
public class danhsachdnnhansvthuctap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        ArrayList<dngh> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new dngh(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(dngh x : kq){
                if(x.check(a,b)) System.out.println(x);
            }
        }
    }
}
class dngh implements Comparable<dngh>{
    private String ma,ten;
    private int sv;
    public dngh(String ma,String ten,String sv){
        this.ma = ma;
        this.ten = ten;
        this.sv = Integer.parseInt(sv);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
    public boolean check(int a,int b){
        if(a <= sv && sv <= b) return true;
        return false;
    }
    @Override
    public int compareTo(dngh x){
        if(sv < x.sv) return 1;
        if(sv > x.sv) return -1;
        return ma.compareTo(x.ma);
    }
}