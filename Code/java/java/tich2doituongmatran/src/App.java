import java.util.*;
import java.io.*;
public class App {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
        // a.mul(b);
    }
}
class Matrix{
    private int n,m;
    private int[][] a = new int[51][51];
    private Scanner sc;
    public Matrix(int n,int m){
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner s){
        sc = s;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public String mul(Matrix x){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<x.m;j++){
                int r = 0;
                for(int k=0;k<m;k++){
                    r += a[i][k]*x.a[k][j];
                }
                sb.append(r+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}