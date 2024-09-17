import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        HashMap<String,hd> mp = new HashMap<>();
        ArrayList<hd> kq = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            hd a = new hd(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
            mp.put(a.getma(),a);
        }
        t = Integer.parseInt(sc2.nextLine());

        for(int i=1;i<=t;i++){
            String s = sc2.nextLine();
            String[] tmp = s.split("\\s+");
            String a = tmp[0];
            Double b = Double.parseDouble(tmp[1]);
            String ma = a.substring(0,2);
            hd x = mp.get(ma);
            hd y = new hd(i,x);
            y.setma(a);
            y.setsl(b);
            y.xuli();
            kq.add(y);
        }
        for(hd x : kq){
            System.out.println(x);
        }
    }
}
class hd{
    private String ma,ten,mahd;
    private double l1,l2,sl,giam,tra;
    private int i;
    public hd(String ma,String ten,String l1,String l2){
        this.ma = ma;
        this.ten = ten;
        this.l1 = Double.parseDouble(l1);
        this.l2 = Double.parseDouble(l2);
    }
    public hd(int i,hd x){
        this.i = i;
        this.ma = x.ma;
        this.ten = x.ten;
        this.l1 = x.l1;
        this.l2 = x.l2;
    }
    public void setma(String s){
        this.mahd = s+String.format("-%03d",i);
    }
    public void setsl(Double sl){
        this.sl = sl;
    }
    public String getma(){
        return ma;
    }
    public double percent(){
        if(sl>=150) return 0.5;
        else if(sl>=100) return 0.3;
        else if(sl>=50) return 0.15;
        return 0;
    }
    public void xuli(){
        if(mahd.charAt(2)=='1'){
            giam = l1*sl*percent();
            tra = l1*sl - giam;
        }
        else{
            giam = l2*sl*percent();
            tra = l2*sl - giam;
        }
    }
    @Override
    public String toString(){
        return mahd+" "+ten+" "+String.format("%.0f",giam)+" "+String.format("%.0f",tra);
    }
}