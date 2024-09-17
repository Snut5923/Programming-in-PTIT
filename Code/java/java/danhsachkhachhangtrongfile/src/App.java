import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws ParseException,IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
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
    private Date dob;
    public kh(int i,String ten,String sex,String dob,String diachi) throws ParseException{
        this.ma = String.format("KH%03d", i);
        this.ten = chuanhoa(ten);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = sd.parse(dob);
        this.sex = sex;
        this.diachi = diachi;
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String i : tmp){
            sb.append(Character.toUpperCase(i.charAt(0))+i.substring(1)+" ");
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return ma+" "+ten+sex+" "+diachi+" "+sd.format(dob);
    }
    @Override
    public int compareTo(kh x){
        if(dob.getYear()!=x.dob.getYear()){
            if(x.dob.getYear()<dob.getYear()) return 1;
            return -1;
        }
        else{
            if(dob.getMonth()!=x.dob.getMonth()){
                if(x.dob.getMonth() < dob.getMonth()) return 1;
                return -1;
            }
            else{
                if(x.dob.getDay() < dob.getDay()) return 1;
                return -1; 
            }
        }
    }
}