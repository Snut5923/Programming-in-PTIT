import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[1001][1001];
        ArrayList<Pair> kq = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
                if(i<=j && a[i][j]==1){
                    kq.add( new Pair<>(i+1,j+1));
                }
            }
        }
        for(Pair x : kq){
            System.out.println(x);
        }
    }
}
class Pair<V,E> {
    private V a;
    private E b;
    public Pair(V a,E b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString(){
        return "("+a+","+b+")";
    }
}