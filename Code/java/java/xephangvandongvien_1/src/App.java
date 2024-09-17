import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception,ParseException {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<vdv> kq = new ArrayList<>();
        ArrayList<vdv> b = new ArrayList<>();
        for(int i=1;i<=t;i++){
            vdv a = new vdv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kq.add(a);
            b.add(a);
        }
        Collections.sort(b);
        b.get(0).setstt(1);
        for(int i=1;i<t;i++){
            if(b.get(i).getrank()==b.get(i-1).getrank()){
                b.get(i).setstt(b.get(i-1).getstt());
            }
            else b.get(i).setstt(i+1);
        }
        for(vdv x : kq){
            System.out.println(x);
        }
        
    }
}
class vdv implements Comparable<vdv>{
    SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat nam = new SimpleDateFormat("dd/MM/yyyy"); 
    private String ma,ten;
    private int stt;
    private Date thucte,uutien,xephang;
    private long tuoi,rank;
    public vdv(int i,String ten,String dob,String start,String end) throws ParseException{
        this.ma = String.format("VDV%02d", i);
        this.ten = ten;
        this.tuoi = 121 - nam.parse(dob).getYear();
        this.thucte = sd.parse(doi(time(end) - time(start)));
        this.uutien = sd.parse(ut());
        this.rank = time(end) - time(start) - time(ut());
        this.xephang = sd.parse(doi(time(end) - time(start) - time(ut())));

    }
    public int getstt(){
        return stt;
    }
    public void setstt(int n){
        this.stt = n;
    }
    public long getrank(){
        return rank;
    }
    public long time(String s) throws ParseException{
        return sd.parse(s).getHours()*3600+sd.parse(s).getMinutes()*60+sd.parse(s).getSeconds();
    }
    public String doi(long x){
        StringBuilder sb = new StringBuilder();
        sb.append(x/3600);
        sb.append(":");
        x = x % 3600;
        sb.append(x/60);
        sb.append(":");
        x = x % 60;
        sb.append(x);
        return sb.toString();
    }
    public String ut(){
        if(tuoi < 18) return "00:00:00";
        else if(tuoi<25) return "00:00:01";
        else if(tuoi<32) return "00:00:02";
        return "00:00:03";
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+sd.format(thucte)+" "+sd.format(uutien)+" "+sd.format(xephang)+" "+stt;
    }
    @Override
    public int compareTo(vdv x){
        if(x.rank < rank) return 1;
        return -1;
    }
}
// 3
// Nguyen Van Thanh
// 20/03/1990
// 07:00:00
// 07:10:01
// Nguyen Hoa Binh
// 01/10/1993
// 07:02:00
// 07:11:20
// Le Thanh Van
// 15/03/1998
// 07:05:00
// 07:15:30
