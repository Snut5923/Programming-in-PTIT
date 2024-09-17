import java.util.*;
public class danhsachdnnhansvthuctap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer t = Integer.parseInt(sc.nextLine());
        ArrayList<dng> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new dng(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(dng x : kq){
            System.out.println(x);
        }
    }
}
class dng implements Comparable<dng>{
    private String ma,ten;
    private int sv;
    public dng(String ma,String ten,String sv){
        this.ma = ma;
        this.ten = ten;
        this.sv = Integer.parseInt(sv);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
    @Override
    public int compareTo(dng x){
        if(sv < x.sv) return 1;
        if(sv > x.sv) return -1;
        return ma.compareTo(x.ma);
    }
}