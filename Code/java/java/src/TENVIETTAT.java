import java.io.File;
import java.io.IOException;
import java.util.*;
public class TENVIETTAT {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<name> kq = new ArrayList<>();
        while(t-->0){
            name a = new name(sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        int k = Integer.parseInt(sc.nextLine());
        while(k-->0){
            String tmp = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i)!='.'){
                    sb.append(tmp.charAt(i));
                }
            }
            String s = sb.toString();
            for(name x : kq){
                if(check(s,x.get())){
                    System.out.println(x);
                }
            }
        }
    }
    public static boolean check(String a,String b){
        if(a.length()!=b.length()) return false;
        else{
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i) && a.charAt(i)!='*') return false;
            }
        }
        return true;
    }
}
class name implements Comparable<name>{
    private String tat,ten,ho,in;
    public name(String s){
        this.in = s;
        String[] tmp = s.split("\\s+");
        this.ten = tmp[tmp.length-1];
        this.ho = tmp[0];
        StringBuilder sb = new StringBuilder();
        for(String x : tmp){
            sb.append(x.charAt(0));
        }
        this.tat = sb.toString();
    }
    public String get(){
        return tat;
    }
    @Override
    public String toString(){
        return in;
    }
    @Override
    public int compareTo(name x){
        if(ten != x.ten) return ten.compareTo(x.ten);
        return ho.compareTo(x.ho);
    }

}
