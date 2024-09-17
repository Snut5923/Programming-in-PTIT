import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xephang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ng> danhsach = new ArrayList<>();
        while(t-->0){
            danhsach.add(new ng(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(danhsach);
        long kq = danhsach.get(0).gett();
        for(ng x : danhsach){
            if(kq >= x.gett()) kq += x.getd();
            else kq = x.gett()+x.getd();
        }
        System.out.println(kq);
    }
}
class ng implements Comparable<ng>{
    private int t,d;
    public ng(int t,int d){
        this.t = t;
        this.d = d;
    }
    public int gett(){
        return t;
    }
    public int getd(){
        return d;
    }
    @Override
    public int compareTo(ng x){
        if(this.t!=x.t) return (this.t - x.t);
        else return (this.d-x.d);
    }
}
