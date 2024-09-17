import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class trenhatgianhat {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int x = t-1;
        ArrayList<tuoi> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new tuoi(sc.nextLine()));
        }
        Collections.sort(kq);
        System.out.println(kq.get(0));
        System.out.println(kq.get(x));
    }
}
class tuoi implements Comparable<tuoi>{
    SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
    private String ten;
    private Date dob;
    public tuoi(String ten) throws ParseException {
        String[] tmp = ten.split("\\s+");
        this.ten = tmp[0];
        this.dob = sd.parse(tmp[1]);
    }
    @Override
    public String toString(){
        return ten;
    }
    @Override
    public int compareTo(tuoi x){
        if(dob.getTime() < x.dob.getTime()) return 1;
        else if(dob.getTime() > x.dob.getTime()) return -1;
        return 0;
    }
}