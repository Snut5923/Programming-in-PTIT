import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class thoigianonlinelientuc {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<gio> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new gio(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(kq);
        for(gio x : kq){
            System.out.println(x);
        }
    }
}
class gio implements Comparable<gio>{
    private String ten;
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date start,end;
    private long time;

    public gio(String ten,String start,String end) throws ParseException {
        this.ten = ten;
        this.start = sd.parse(start);
        this.end = sd.parse(end);
        this.time = (this.end.getTime() - this.start.getTime())/60000;
    }
    @Override
    public String toString(){
        return ten+" "+time;
    }
    @Override
    public int compareTo(gio x){
        if(x.time > this.time) return 1;
        else{
            if(x.time < this.time) return -1;
            else return this.ten.compareTo(x.ten);
        }
    }
}