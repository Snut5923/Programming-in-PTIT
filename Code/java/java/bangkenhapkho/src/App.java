import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> mp = new HashMap<>();
        ArrayList<mh> kq = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String sl = sc.nextLine();
            String gia = sc.nextLine();
            mh z = new mh(ten, sl, gia);
            if(!mp.containsKey(z.getma())){
                mp.put(z.getma(), 1);
            }
            else{
                int y = mp.get(z.getma());
                mp.put(z.getma(), y+1);
            }
            z.setma(mp);
            kq.add(z);
        }
        for(mh x : kq){
            System.out.println(x);
        }
    }
}
class mh{
    private String ten,ma,mahang;
    private long sl,gia;
    public mh(String ten,String sl,String gia){
        this.ten = ten;
        this.sl = Long.parseLong(sl);
        this.gia = Long.parseLong(gia);
        this.ma = chuanhoa(this.ten);
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.toLowerCase().trim().split("\\s+");
        sb.append(Character.toUpperCase(tmp[0].charAt(0))+""+Character.toUpperCase(tmp[1].charAt(0)));
        return sb.toString(); 
    }
    public String getma(){
        return ma;
    }
    public double percent(){
        if(sl > 10) return 0.05;
        else if(sl >= 8 ) return 0.02;
        else if(sl >= 5) return 0.01;
        return 0;
    }
    public long chietkhau(){
        return (long)(gia*sl*percent());
    }
    public long thanhtien(){
        return gia*sl - chietkhau();
    }
    public void setma(HashMap<String,Integer> mp){
        StringBuilder sb = new StringBuilder();
        sb.append(ma + String.format("%02d", mp.get(ma)));
        this.mahang = sb.toString();
    }
    @Override
    public String toString(){
        return mahang+" "+ten+" "+chietkhau()+" "+thanhtien();
    }
}
// 3
// May lanh SANYO
// 12
// 4000000
// Dien thoai Samsung
// 30
// 3230000
// Dien thoai Nokia
// 18
// 1240000