import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,String> mp = new HashMap<>();
        HashMap<String,Integer> dem = new HashMap<>();
        ArrayList<mh> kq = new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String gv = sc.nextLine();
            if(!mp.containsKey(ma)){
                mp.put(ma, ten);
            }
            if(!dem.containsKey(ma)){
                dem.put(ma, 1);
                kq.add(new mh(ma, ten, nhom, gv));
            }
            else{
                if(dem.get(ma)!=40){
                    int x = dem.get(ma);
                    dem.put(ma, x+1);
                    kq.add(new mh(ma, ten, nhom, gv));
                }
            }
        }
        Collections.sort(kq);
        ArrayList<String> a = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            // String s = sc.nextLine();
            // a.add(s);
            String s = sc.nextLine();
            System.out.println("Danh sach nhom lop mon "+mp.get(s)+":");
            for(mh x : kq){
                if(s.equals(x.getma())){
                    System.out.println(x);
                }
            }
        }
        // for(String i : a){
        //     System.out.println("Danh sach nhom lop mon "+mp.get(i)+":");
        //     for(mh x : kq){
        //         if(i.equals(x.getma())){
        //             System.out.println(x);
        //         }
        //     }
        // }
    }
}
class mh implements Comparable<mh>{
    private String ma,ten,gv,nhom;
    public mh(String ma,String ten,String nhom,String gv){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gv= gv;
    }
    public String getma(){
        return ma;
    }
    @Override
    public String toString(){
        return nhom+" "+gv;
    }
    @Override
    public int compareTo(mh x){
        if(Integer.parseInt(x.nhom) < Integer.parseInt(nhom)) return 1;
        if(Integer.parseInt(x.nhom) > Integer.parseInt(nhom)) return -1;
        return 0;
    }
}
// 4
// THCS2D20
// Tin hoc co so 2 - D20
// 01
// Nguyen Binh An
// CPPD20
// Ngon ngu lap trinh C++ - D20
// 01
// Le Van Cong
// THCS2D20
// Tin hoc co so 2 - D20
// 02
// Nguyen Trung Binh
// LTHDTD19
// Lap trinh huong doi tuong - D19
// 01
// Nguyen Binh An
// 1
// THCS2D20