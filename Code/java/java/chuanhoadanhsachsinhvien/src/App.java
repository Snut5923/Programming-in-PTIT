import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException,ParseException {
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new sv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(sv x : kq){
            System.out.println(x);
        }
    }
}
class sv{
    private String ma,ten,lop;
    private double gpa;
    private Date ngaysinh;
    public sv(int i,String ten,String lop,String ngaysinh,String gpa) throws ParseException{
        this.ma = String.format("B20DCCN%03d", i);
        this.ten = chuanhoa(ten);
        this.lop = lop;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sd.parse(ngaysinh);
        this.gpa = Double.parseDouble(gpa);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return ma+" "+ten+lop+" "+sd.format(ngaysinh)+" "+String.format("%.2f", gpa);
    }
}