import java.util.Scanner;

public class baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String luong = sc.nextLine();
        String ngay = sc.nextLine();
        String chuc = sc.nextLine();
        nvien a = new nvien(ten,luong,ngay,chuc);
        System.out.println(a);
    }
}
class nvien{
    private String ten,chuc;
    private int luong,ngay;
    public nvien(String ten,String luong,String ngay,String chuc){
        this.ten = ten;
        this.ngay = Integer.parseInt(ngay);
        this.chuc = chuc;
        this.luong = this.ngay * Integer.parseInt(luong);
    }
    public int thuong(){
        if(ngay >= 25) return luong/5;
        else if(ngay>=22) return luong/10;
        return 0;
    }
    public int phucap(){
        if(chuc.equals("GD")) return 250000;
        else if(chuc.equals("PGD")) return 200000;
        else if(chuc.equals("TP")) return 180000;
        return 150000;
    }
    @Override
    public String toString(){
        return "NV01 "+ten+" "+luong+" "+thuong()+" "+phucap()+" "+(luong+thuong()+phucap());
    }
}