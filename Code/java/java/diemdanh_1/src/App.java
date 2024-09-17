import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> kq = new ArrayList<>();
        HashMap<String,sv> mp = new HashMap<>();
        for(int i=1;i<=t;i++){
            sv a = new sv(sc.nextLine(), sc.nextLine(), sc.nextLine());
            kq.add(a);
            if(!mp.containsKey(a.getma())){
                mp.put(a.getma(), a);
            }
        }
        for(int i=1;i<=t;i++){
            kitu a = new kitu(sc.nextLine());
            a.xuli(mp);
        }
        String s = sc.nextLine();
        for(sv x : kq){
            if(s.equals(x.getlop())) System.out.println(x);
        }
    }
}
class sv{
    private String ma,ten,lop,status;
    private int diem;
    public sv(String ma,String ten,String lop){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    public String getma(){
        return ma;
    }
    public String getlop(){
        return lop;
    }
    public void setstt(String s){
        this.status = s;
    }
    public void setd(int x){
        this.diem = x;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+diem+" "+status;
    }
}
class kitu{
    private String ma,kt,status;
    private int diem;
    public kitu(String s){
        String[] tmp = s.split("\\s+");
        this.ma = tmp[0];
        this.kt = tmp[1];
        int x = 10;
        for(int i=0;i<kt.length();i++){
            if(kt.charAt(i)=='m') x -= 1;
            if(kt.charAt(i)=='v') x -= 2;
        }
        if(x<0) diem = 0;
        else diem = x;
        if(diem == 0) this.status = "KDDK";
        else this.status = "";
    }
    public void xuli(HashMap<String,sv> mp){
        sv a = mp.get(ma);
        a.setstt(status);
        a.setd(diem);
    }
}
// 3
// B19DCCN999
// Le Cong Minh
// D19CQAT02-B
// B19DCCN998
// Tran Truong Giang
// D19CQAT02-B
// B19DCCN997
// Nguyen Tuan Anh
// D19CQCN04-B
// B19DCCN998 xxxmxmmvmx
// B19DCCN997 xmxmxxxvxx
// B19DCCN999 xvxmxmmvvm