import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class danhsachdoituongsinhvien_1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        ArrayList<siv> kq = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            siv a = new siv();
            a.nhap(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        for(siv x : kq){
            System.out.println(x);
        }
    }
}
class siv{
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private String ma,ten,lop;
    private Date d;
    private Double gpa;
    public siv(){
        this.ten = "";
        this.lop = "";
        this.gpa = 0.0;
    }
    public void nhap(int i,String ten,String lop,String dob,String gpa) throws ParseException {
        this.ma = String.format("B20DCCN%03d",i);
        this.ten = ten;
        this.lop = lop;
        this.d = sd.parse(dob);
        this.gpa = Double.parseDouble(gpa);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+sd.format(d)+" "+String.format("%.2f",gpa);
    }
}