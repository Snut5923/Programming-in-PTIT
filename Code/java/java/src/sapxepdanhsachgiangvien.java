import java.text.CollationElementIterator;
import java.util.*;
public class sapxepdanhsachgiangvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<mnp> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new mnp(i,sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(mnp x : kq){
            System.out.println(x);
        }
    }
}
class mnp implements Comparable<mnp>{
    private String ma,ten,mon;
    public mnp(int i,String ten,String mon){
        this.ma = String.format("GV%02d",i);
        this.ten = ten;
        this.mon = chuanhoa(mon);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0)));
        }
        return sb.toString();
    }
    public String cuoi(){
        String[] tmp = ten.split("\\s+");
        return tmp[tmp.length-1];
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+mon;
    }
    @Override
    public int compareTo(mnp x){
        if(!cuoi().equals(x.cuoi())) return cuoi().compareTo(x.cuoi());
        return ma.compareTo(x.ma);
    }
}