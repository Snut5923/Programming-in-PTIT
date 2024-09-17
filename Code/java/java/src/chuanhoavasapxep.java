import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class chuanhoavasapxep {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<ds> kq = new ArrayList<>();
        while(sc.hasNextLine()){
            kq.add(new ds(sc.nextLine()));
        }
        Collections.sort(kq);
        for(ds x : kq){
            System.out.println(x);
        }
    }
}
class ds implements Comparable<ds>{
    private String ho,dem,ten;
    public ds(String hovaten){
        StringBuilder sb = new StringBuilder();
        String[] tmp = hovaten.trim().toLowerCase().split("\\s+");
        String s = "";
        for(int i=1;i<tmp.length-1;i++){
            s += String.format(Character.toUpperCase(tmp[i].charAt(0))+tmp[i].substring(1)+" ");
        }
        this.dem = s.trim();
        this.ho = String.format(Character.toUpperCase(tmp[0].charAt(0))+tmp[0].substring(1));
        this.ten = String.format(Character.toUpperCase(tmp[tmp.length-1].charAt(0))+tmp[tmp.length-1].substring(1));
    }
    @Override
    public String toString(){
        return ho+" "+dem+" "+ten;
    }
    @Override
    public int compareTo(ds x){
        if(!this.ten.equals(x.ten)) return this.ten.compareTo(x.ten);
        if(!this.ho.equals(x.ho)) return this.ho.compareTo(x.ho);
        return this.dem.compareTo(x.dem);
    }
}