import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hang> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(hang x : kq){
            System.out.println(x);
        }
    }
}
class hang implements Comparable<hang>{
    private String ten,ma,stt,maloai;
    private long dongia,sl;
    public hang(String ten,String ma,String dongia,String sl){
        this.ten = ten;
        this.ma = ma;
        this.dongia = Long.parseLong(dongia);
        this.sl = Long.parseLong(sl);
        this.stt = ma.substring(1, 4);
        this.maloai = ma.substring(4);
    }
    public long giamgia(){
        if(maloai.equals("1")) return dongia*sl*50/100;
        else return dongia*sl*30/100;
    }
    public long thanhtien(){
        return dongia*sl-giamgia();
    }
    @Override
    public String toString(){
        return ten+" "+ma+" "+stt+" "+giamgia()+" "+thanhtien();
    }
    @Override
    public int compareTo(hang x){
        if(Integer.parseInt(x.stt) < Integer.parseInt(stt)) return 1;
        return -1;
    }
}
// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12