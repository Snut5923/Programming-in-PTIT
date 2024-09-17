import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class timthukhoacuakithi {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<stu> kq = new ArrayList<>();
        double chuan = -1;
        for(int i=1;i<=t;i++){
            stu a = new stu(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            chuan = Math.max(chuan,a.get());
            kq.add(a);
        }
        Collections.sort(kq);
        for(stu x : kq){
            if(x.get() == chuan){
                System.out.println(x);
            }
        }
    }
}
class stu implements Comparable<stu>{
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private String ma,ten,dob;
    private Double diem,mot,hai,ba;
    public stu(int i,String ten,String dob,String mot,String hai,String ba) throws ParseException {
        this.ma = String.format("%d",i);
        this.ten = ten;
        this.dob = dob;
        this.mot = Double.parseDouble(mot);
        this.hai = Double.parseDouble(hai);
        this.ba = Double.parseDouble(ba);
        this.diem = this.mot + this.hai + this.ba;
    }
    public double get(){
        return this.diem;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+dob+" "+diem;
    }
    @Override
    public int compareTo(stu x){
        if(diem != x.diem){
            if(diem > x.diem ) return -1;
            else return 1;
        }
        return ma.compareTo(x.ma);
    }
}