import java.util.*;

public class sapxepsinhvientheolop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<abc> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new abc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(abc x : kq){
            System.out.println(x);
        }
    }
}
class abc implements Comparable<abc>{
    private String ma,ten,lop,mail;
    public abc(String ma,String ten,String lop,String mail){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
    @Override
    public int compareTo(abc x){
        if(!lop.equals(x.lop)) return lop.compareTo(x.lop);
        return ma.compareTo(x.ma);
    }
}