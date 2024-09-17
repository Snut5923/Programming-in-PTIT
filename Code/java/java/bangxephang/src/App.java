import java.io.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hs> kq = new ArrayList<>();
        while(t-->0){
            kq.add(new hs(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        for(hs x : kq){
            System.out.println(x);
        }
    }
}
class hs implements Comparable<hs>{
    private String ten;
    private int bai,sub;
    public hs(String ten,String s){
        this.ten = ten;
        String[] tmp = s.split("\\s+");
        this.bai = Integer.parseInt(tmp[0]);
        this.sub = Integer.parseInt(tmp[1]);
    }
    @Override
    public String toString(){
        return ten+" "+bai+" "+sub;
    }
    @Override
    public int compareTo(hs x){
        if(bai != x.bai){
            if(bai > x.bai) return -1;
            return 1;
        }
        else{
            if(sub != x.sub){
                if(sub < x.sub) return -1;
                return 1;
            }
            return ten.compareTo(x.ten);
        }

    }
}
// 2
// Nguyen Van Nam
// 168 600
// Tran Thi Ngoc
// 168 600
