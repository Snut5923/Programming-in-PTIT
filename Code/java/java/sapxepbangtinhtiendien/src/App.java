import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dien> kq = new ArrayList<>(); 
        for(int i=1;i<=t;i++){
            kq.add(new dien(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(dien x : kq){
            System.out.println(x);
        }
    }
}
class dien implements Comparable<dien>{
    private String loai,ma;
    private int cu,moi;
    public dien(int i,String loai,String cu,String moi){
        this.ma = String.format("KH%02d", i);
        this.loai = loai;
        this.cu = Integer.parseInt(cu);
        this.moi = Integer.parseInt(moi);
    }
    public int heso(){
        if(loai.equals("KD")) return 3;
        else if(loai.equals("NN")) return 5;
        else if(loai.equals("TT")) return 4;
        return 2;
    }
    public long thanhtien(){
        return (moi-cu)*heso()*550;
    }
    public double phutroi(){
        if((moi-cu) < 50) return 0;
        else if((moi-cu) <=100) return Math.ceil(thanhtien()*0.35);
        return thanhtien();
    }
    public double tongtien(){
        return phutroi()+thanhtien();
    }
    @Override
    public String toString(){
        return ma+" "+heso()+" "+thanhtien()+" "+String.format("%.0f",phutroi())+" "+String.format("%.0f",tongtien());
    }
    @Override
    public int compareTo(dien x){
        if(x.tongtien() > tongtien()){
            return 1;
        }
        return -1;
    }
}
// 3
// KD
// 400
// 555
// NN
// 58
// 400
// CN
// 150
// 700