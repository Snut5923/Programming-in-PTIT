import java.util.*;
class sv implements Comparable<sv>{
    private String stt,ma,ten,lop,email,dn;
    public sv(int i,String ma,String ten,String lop,String email,String dn){
        this.stt = String.format("%d",i);
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String get(){
        return dn;
    }
    @Override
    public String toString(){
        return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+dn;
    }
    @Override
    public int compareTo(sv x){
        return ten.compareTo(x.ten);
    }
}
