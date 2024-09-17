import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<kh> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new kh(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(kh x : kq){
            System.out.println(x);
        }
    }
}
class kh implements Comparable<kh>{
    private String ma,ten,sex,diachi;
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private Date dob;
    private long tuoi;
    public kh(int i,String ten,String sex,String ngay,String diachi) throws ParseException{
        this.ten = chuanhoa(ten);
        this.sex = sex;
        this.dob = sd.parse(ngay);
        this.diachi = diachi;
        this.ma = String.format("KH%03d",i);
        this.tuoi = 121 - this.dob.getYear();
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.toLowerCase().trim().split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0))+x.substring(1)+" ");
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        return ma+" "+ten+sex+" "+diachi+" "+sd.format(dob);
    }
    @Override
    public int compareTo(kh x){
        if(dob.getYear() != x.dob.getYear()){
            if(x.dob.getYear() < dob.getYear()) return 1;
            return -1; 
        }
        else{
            if(x.dob.getMonth() != dob.getMonth()){
                if(x.dob.getMonth() < dob.getMonth()) return 1;
                return -1;
            }
            else{
                if(x.dob.getDate() < dob.getDate()) return 1;
                return -1;
            } 
        }
    }
}
// 2
//  nGuyen VAN     nAm
// Nam
// 12/12/1997
// Mo Lao-Ha Dong-Ha Noi
//  TRan    vAn     biNh
// Nam
// 14/11/1995
// Phung Khoang-Nam Tu Liem-Ha Noi