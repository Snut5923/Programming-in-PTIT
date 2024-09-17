import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class xettuyen {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hs> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new hs(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(hs x : kq){
            System.out.println(x);
        }
    }
}
class hs{
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private String ten,ma;
    private double lt,th;
    private Date dob;
    public hs(int i,String ten,String ngay,String lt,String th) throws ParseException{
        this.ten = chuanhoa(ten);
        this.ma = String.format("PH%02d",i);
        this.dob = sd.parse(ngay);
        this.lt = Double.parseDouble(lt);
        this.th = Double.parseDouble(th);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.toLowerCase().trim().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    public double thuong(){
        if(this.lt >= 8 && this.th >=8) return 1;
        if(this.lt >= 7.5 && this.th >= 7.5) return 0.5;
        return 0;
    }
    public int tb(){
        int x = (int)Math.round((lt+th)/2 + thuong());
        if(x>10) return 10;
        return x;
    }
    public String loai(){
        if(tb()<5) return "Truot";
        else{
            if(tb() <=6 && tb()>= 5) return "Trung binh";
            else{
                if(tb()==7) return "Kha";
                else{
                    if(tb()==8) return "Gioi";
                    else return "Xuat sac";
                }
            }
        }
    }
    public int tuoi(){
        return 121 - dob.getYear();
    }
    @Override
    public String toString(){
        return ma+" "+ten+tuoi()+" "+tb()+" "+loai();
    }
}
