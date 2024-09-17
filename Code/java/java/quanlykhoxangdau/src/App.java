import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hang(sc.nextLine()));
        }
        Collections.sort(kq);
        for(hang x : kq){
            System.out.println(x);
        }
        
    }
}
class hang implements Comparable<hang>{
    private String madh,ma,mahang;
    private long sl;
    public hang(String s){
        String[] tmp = s.split("\\s+");
        this.madh = tmp[0];
        this.sl = Long.parseLong(tmp[1]);
        this.ma = madh.substring(0, 1);
        this.mahang = madh.substring(3);

    }
    public long gia(){
        if(ma.equals("X")) return 128000;
        else if(ma.equals("D")) return 11200;
        return 9700;
    }
    public long thue(){
        if(mahang.equals("TN")) return 0;
        else{
            if(ma.equals("X")) return gia()*sl*3/100;
            else if(ma.equals("D")) return gia()*sl*35/1000;
            return gia()*sl*2/100;
        }
    }
    public String tenhang(){
        if(mahang.equals("BP")) return "British Petro";
        else if(mahang.equals("ES")) return "Esso";
        else if(mahang.equals("SH")) return "Shell";
        else if(mahang.equals("CA")) return "Castrol";
        else if(mahang.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    public long thanhtien(){
        return gia()*sl + thue();
    }
    @Override
    public String toString(){
        return madh+" "+tenhang()+" "+gia()+" "+thue()+" "+thanhtien();
    }
    @Override
    public int compareTo(hang x){
        if(x.thanhtien() > thanhtien()) return 1;
        if(x.thanhtien() < thanhtien()) return -1;
        return 0;
    }
}
// 3
// N89BP 4500
// D00BP 3500
// X92SH 2600