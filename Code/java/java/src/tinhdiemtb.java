import java.io.File;
import java.io.IOException;
import java.util.*;

public class tinhdiemtb {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sinhv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new sinhv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        int tmp=1;
        HashSet<Double> set = new HashSet<>();
        for(int i=1;i<=kq.size();i++){
            if(!set.contains(kq.get(i-1).tb())){
                tmp = i;
                kq.get(i-1).set(i);
                set.add(kq.get(i-1).tb());
            }
            else{
                kq.get(i-1).set(tmp);
            }
        }
        for(sinhv x : kq){
            System.out.println(x);
        }
    }
}
class sinhv implements Comparable<sinhv>{
    private String ma,ten;
    private double mon1,mon2,mon3;
    private int stt;
    public sinhv(int i ,String ten,String mon1,String mon2,String mon3){
        this.ma = String.format("SV%02d",i);
        this.ten = chuanhoa(ten);
        this.mon1 = Double.parseDouble(mon1);
        this.mon2 = Double.parseDouble(mon2);
        this.mon3 = Double.parseDouble(mon3);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    public double tb(){
        return (mon1*3+mon2*3+mon3*2)/8;
    }
    public void set(int stt){
        this.stt = stt;
    }
    @Override
    public String toString(){
        return ma+" "+ten+String.format("%.2f",tb())+" "+stt;
    }
    @Override
    public int compareTo(sinhv x){
        if(x.tb() > this.tb()) return 1;
        if(x.tb() < this.tb()) return -1;
        return this.ma.compareTo(x.ma);
    }
}