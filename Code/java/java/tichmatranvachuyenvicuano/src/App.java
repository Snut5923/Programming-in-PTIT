import java.util.*;
import java.io.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
class Matrix{
    private int n,m;
    private long[][] a = new long[51][51];
    private Scanner sc;
    public Matrix(int n,int m){
        this.n = n;
        this.m = m;
    }
    public Matrix trans(){
        Matrix x = new Matrix(m, n);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                x.a[j][i] = a[i][j];
            }
        }
        return x;
    }
    public void nextMatrix(Scanner s){
        sc = s;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextLong();
            }
        }
    }
    public String mul(Matrix x){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<x.m;j++){
                long r = 0;
                for(int k=0;k<m;k++){
                    r += a[i][k]*x.a[k][j];
                }
                sb.append(r+" ");
            }
            if(i<n-1) sb.append("\n");
        }
        return sb.toString();
    }
}