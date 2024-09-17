import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class danhsachtrungtuyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ts> kq = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            kq.add(new ts(ma,ten,toan,ly,hoa));
        }
        int a = Integer.parseInt(sc.nextLine());
        if(a > kq.size()) a = kq.size();
        Collections.sort(kq);
        double chuan = kq.get(a-1).diem;
        System.out.println(String.format("%.1f",chuan));
        for(ts x : kq){
            System.out.print(x);
            if(x.diem >= chuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
    }
}
class ts implements Comparable<ts> {
    private String ma,ten;
    Double ut,diem;
    ts(String ma,String ten,double toan,double ly,double hoa){
        this.ma = ma;
        if(ma.charAt(2)=='1') this.ut = 0.5;
        if(ma.charAt(2)=='2') this.ut = 1.0;
        if(ma.charAt(2)=='3') this.ut = 2.5;
        this.diem = toan*2+ly+hoa+this.ut;
        String[] tmp = ten.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1)+" ");
        }
        this.ten = sb.toString();
    }
    @Override
    public String toString(){
        return ma+" "+ten+(new DecimalFormat().format(ut))+" "+(new DecimalFormat().format(diem))+" ";
    }
    @Override
    public int compareTo(ts x){
        if(!Objects.equals(diem, x.diem)) return (int)(x.diem - diem);
        return this.ma.compareTo(x.ma);
    }
}