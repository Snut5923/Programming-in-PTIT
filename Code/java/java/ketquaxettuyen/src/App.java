import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception,ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ph> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new ph(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(ph x : kq){
            System.out.println(x);
        }
    }
}
class ph implements Comparable<ph>{
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private String ten,ma;
    private Date d;
    private long tuoi;
    private Double lt,th;
    public ph(int i,String ten,String d,String lt,String th) throws ParseException{
        this.ma = String.format("PH%02d", i);
        this.ten = ten;
        this.tuoi = 121 - sd.parse(d).getYear();
        this.d = sd.parse(d);
        this.lt = Double.parseDouble(lt);
        this.th = Double.parseDouble(th);
    }
    public double thuong(){
        if(lt >=8 && th >=8) return 1;
        else if(lt >=7.5 && th>=7.5) return 0.5;
        return 0;
    }
    public long tb(){
        double x = (lt+th)/2 + thuong();
        if(x>10) return 10;
        return Math.round(x);
    }
    public String loai(){
        if(tb() < 5) return "Truot";
        else if(tb() <=6) return "Trung binh";
        else if(tb() == 7) return "Kha";
        else if(tb() == 8) return "Gioi";
        return "Xuat sac";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+tuoi+" "+tb()+" "+loai();
    }
    @Override
    public int compareTo(ph x){
        if(x.tb() > tb()) return 1;
        if(x.tb() < tb()) return -1;
        return ma.compareTo(x.ma);
    }
}
// 3
// Doan Thi Kim
// 13/03/1982
// 8
// 9.5
// Dinh Thi Ngoc Ha
// 03/09/1996
// 6.5
// 8
// Tran Thanh Mai
// 12/09/2004
// 8
// 9