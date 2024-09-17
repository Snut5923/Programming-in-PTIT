import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        HashMap<String,tram> mp = new HashMap<>();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<tram> kq = new ArrayList<>();
        while(t-->0){
            tram a = new tram(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            String s = a.getten();
            if(!mp.containsKey(s)){
                a.setma(i);
                i++;
                kq.add(a);
                mp.put(s,a);
            }
            else{
                tram b = mp.get(s);
                b.update(a);
            }
        }
        for(tram x : kq){
            System.out.println(x);
        }
    }
}
class tram{
    private String ma,ten;
    private Date begin,end;
    private Double t,mua;
    public tram(String ten,String begin,String end,String mua)throws ParseException{
        this.ten = ten;
        SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
        this.begin = sd.parse(begin);
        this.end = sd.parse(end);
        this.t = (double)(this.end.getTime() - this.begin.getTime()) / (60*60*1000);
        this.mua = Double.parseDouble(mua);
    }
    public void setma(int i){
        this.ma = String.format("T%02d",i);
    }
    public String getten(){
        return ten;
    }
    public double gett(){
        return t;
    }
    public double getmua(){
        return mua;
    }
    public void update(tram x){
        t = t + x.gett();
        mua = mua + x.getmua();
    }
    public double tb(){
        return mua/t;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f",tb());
    }
}