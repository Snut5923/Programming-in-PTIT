import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class danhsachcathi {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<cathi> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new cathi(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(cathi x : kq){
            System.out.println(x);
        }
    }
}
class cathi implements Comparable<cathi>{
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat df = new SimpleDateFormat("HH:mm");
    private String ma,id,date,hour;
    private Date ngay,gio;
    public cathi(int i,String ngay,String gio,String id) throws ParseException {
        this.ma = String.format("C%03d",i);
        this.ngay = sd.parse(ngay);
        this.gio = df.parse(gio);
        this.id = id;
        this.hour = df.format(this.gio);
    }
    @Override
    public String toString(){
        return ma+" "+sd.format(ngay)+" "+df.format(gio)+" "+id;
    }
    @Override
    public int compareTo(cathi x){
        int a = (int)this.ngay.getTime();
        int b = (int)x.ngay.getTime();
        String i[] = this.hour.split(":");
        String j[] = x.hour.split(":");
        if(a>b) return 1;
        else if(a<b) return -1;
        else if(a==b){
            if(i[0].equals(j[0])) return i[1].compareTo(j[1]);
            else{
                return i[0].compareTo(j[0]);
            }
        }
        else return this.ma.compareTo(x.ma);
    }
}