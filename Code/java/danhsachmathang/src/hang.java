import java.util.*;

public class hang implements Comparable<hang>{
    private String ten, donvi ,mamh;
    private int giamua, giaban;
    private int loiNhuan;

    hang(String ten,String donvi,int giamua,int giaban,int i){
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        loiNhuan = giaban - giamua;
        this.mamh = String.format("MH%03d",i);
    }
    @Override
    public String toString(){
        return mamh+" "+ten+" "+donvi+" "+giamua+" "+giaban+" "+loiNhuan;
    }
    @Override
    public int compareTo(hang a){
        if(this.loiNhuan != a.loiNhuan){
            return a.loiNhuan - this.loiNhuan;
        }
        else{
            return this.mamh.compareTo(a.mamh);
        }
    }

}
