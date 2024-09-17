import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<kh> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new kh(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(kh x : kq){
            System.out.println(x);
        }
    }
}
class kh implements Comparable<kh>{
    private String ten,makh,phong;
    private Long ngay,gia,dv,tien;
    private Date begin,end;
    public kh(int i,String ten,String phong,String begin,String end,String dv)throws ParseException{
        this.makh = String.format("KH%02d",i);
        this.ten = ten;
        this.phong = phong;
        this.gia = doigia();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.begin = sd.parse(begin);
        this.end = sd.parse(end);
        this.ngay = (this.end.getTime() - this.begin.getTime()) / (24*60*60*1000) + 1;
        this.tien = this.ngay * this.gia + Long.parseLong(dv);
    }
    public Long doigia(){
        char c = phong.charAt(0);
        if(c=='1') return 25L;
        else if(c=='2') return 34L;
        else if(c=='3') return 50L;
        return 80L;
    }
    @Override
    public String toString(){
        return makh+" "+ten+" "+phong+" "+ngay+" "+tien;
    }
    @Override
    public int compareTo(kh x){
        if(x.tien > tien) return 1;
        else if(x.tien < tien) return -1;
        return 0;
    }
}
