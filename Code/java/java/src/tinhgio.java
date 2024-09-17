import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class tinhgio {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<game> kq = new ArrayList<>();
        while(t-->0){
            game a = new game(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        for(game x : kq){
            System.out.println(x);
        }
    }
}
class game implements Comparable<game>{
    SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
    private String ma,ten;
    private Date begin,end;
    private long gio,phut,tong;
    public game(String ma,String ten,String begin,String end) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.begin = sd.parse(begin);
        this.end = sd.parse(end);
        this.tong = (this.end.getTime() - this.begin.getTime())/60000;
        this.gio = this.tong / 60;
        this.phut = this.tong % 60;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+gio+" gio "+phut+" phut";
    }
    @Override
    public int compareTo(game x){
        return (int)(x.tong - tong);
    }
}