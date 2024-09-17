import java.util.*;
public class timkiemgiangvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<fuck> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new fuck(i,sc.nextLine(),sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(fuck x : kq){
                if(x.check(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
class fuck{
    private String ma,ten,mon;
    public fuck(int i,String ten,String mon){
        this.ma = String.format("GV%02d",i);
        this.ten = ten;
        this.mon = doi(mon);
    }
    public String doi(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.split("\\s+");
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0)));
        }
        return sb.toString();
    }
    public boolean check(String s){
        if(ten.toLowerCase().contains(s.toLowerCase())) return true;
        return false;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+mon;
    }
}