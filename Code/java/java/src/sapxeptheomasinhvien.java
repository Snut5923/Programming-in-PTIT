import java.util.*;
public class sapxeptheomasinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<def> kq = new ArrayList<>();
        while(sc.hasNext()){
            kq.add(new def(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(def x : kq){
            System.out.println(x);
        }
    }
}
class def implements Comparable<def>{
    private String ma,ten,lop,mail;
    public def(String ma,String ten,String lop,String mail){
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
    public int compareTo(def x){
        return ma.compareTo(x.ma);
    }
}