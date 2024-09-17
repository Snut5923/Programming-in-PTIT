import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException {
        // Scanner sc1 = new Scanner(new File("D:/1.txt"));
        // Scanner sc2 = new Scanner(new File("D:/2.txt"));
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        ArrayList<gd> kq = new ArrayList<>();
        HashMap<String,String> mp = new HashMap<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String tin = sc1.nextLine();
            mp.put(ma, ten);
        }
        t = Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=t;i++){
            kq.add(new gd(i, sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }
        Collections.sort(kq);
        String ma = sc2.nextLine();
        System.out.println("LICH GIANG DAY MON "+mp.get(ma)+":");
        for(gd x : kq){
            if(ma.equals(x.getma())) System.out.println(x);
        }
    }
}
class gd implements Comparable<gd>{
    private String mamon,manhom,gv,phong;
    private int thu,kip;
    public gd(int i,String mamon,String thu,String kip,String gv,String phong){
        this.manhom =String.format("HP%03d", i);
        this.mamon = mamon;
        this.thu = Integer.parseInt(thu);
        this.kip = Integer.parseInt(kip);
        this.gv = gv;
        this.phong = phong;
    }
    public String getma(){
        return mamon;
    }
    @Override
    public String toString(){
        return manhom+" "+thu+" "+kip+" "+gv+" "+phong;
    }
    @Override
    public int compareTo(gd x){
        if(thu != x.thu){
            if(x.thu < thu) return 1;
            return -1;
        }
        else{
            if(kip != x.kip){
                if(x.kip < kip) return 1;
                return -1;
            }
            return gv.compareTo(x.gv);
        }
    }
}