import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hoadon> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hoadon(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(hoadon x : kq){
            System.out.println(x);
        }
    }
}
class hoadon implements Comparable<hoadon>{
    private String ma,ten;
    private long sl,gia,chietkhau,tien;
    public hoadon(String ma,String ten,String sl,String gia,String chietkhau){
        this.ma = ma;
        this.ten = ten;
        this.sl = Long.parseLong(sl);
        this.gia = Long.parseLong(gia);
        this.chietkhau = Long.parseLong(chietkhau);
        tien = this.gia*this.sl - this.chietkhau;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sl+" "+gia+" "+chietkhau+" "+tien;
    }
    @Override
    public int compareTo(hoadon x){
        if(x.tien > tien) return 1;
        if(x.tien < tien) return -1;
        return 0;
    }
}
// 3
// ML01
// May lanh SANYO
// 12
// 4000000
// 2400000
// ML02
// May lanh HITACHI
// 4
// 2550000000
// 0
// ML03
// May lanh NATIONAL
// 5
// 3000000
// 150000