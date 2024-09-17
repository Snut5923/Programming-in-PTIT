import java.util.Scanner;

public class hang implements Comparable<hang>{
    private String ten,donvi;
    private int giamua,giaban,ma;
    hang(int ma){
        this.ma = ma;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        donvi = sc.next();
        giamua = sc.nextInt();
        giaban = sc.nextInt();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(ma<10){
            sb.append("MH00");
            sb.append(ma);
        }
        else{
            sb.append("MH0");
            sb.append(ma);
        }
        return sb+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+(giaban-giamua);
    }
    @Override
    public int compareTo(hang a){
        if((this.giaban-this.giamua)!=(a.giaban-a.giamua)){
            return a.giaban - a.giamua - this.giaban + this.giamua;
        }
        else{
            return this.ma-a.ma;
        }
    }

}
