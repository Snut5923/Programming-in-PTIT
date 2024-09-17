import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class sapxepdanhsachdoituognnhanvien {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<contractt> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            contractt a = new contractt(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        for(contractt x : kq){
            System.out.println(x);
        }
    }
}
class contractt implements Comparable<contractt> {
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    private String ma,ten,sex,diachi,thue;
    private Date dob,ky;
    public contractt(int i,String ten,String sex,String dob,String diachi,String thue,String ky) throws ParseException {
        this.ma = String.format("%05d",i);
        this.ten = ten;
        this.sex = sex;
        this.dob = sd.parse(dob);
        this.diachi = diachi;
        this.thue = thue;
        this.ky = sd.parse(ky);
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sex+" "+sd.format(dob)+" "+diachi+" "+thue+" "+sd.format(ky);
    }
    @Override
    public int compareTo(contractt x){
        if(x.dob.getTime() < dob.getTime()) return 1;
        return -1;
    }
}