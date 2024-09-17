import java.util.Scanner;
public class tichmatranvoichuyenvicuano {
    static void nhan(int[][] a,int[][] b,int[][] c,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                c[i][j] = 0;
                for(int k=0;k<n;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x =1;
        while(t-- > 0){
            int m = sc.nextInt(),n = sc.nextInt();
            int[][] a = new int[m][n];
            int[][] b = new int[n][m];
            int[][] c = new int[m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Test "+x+":");
            x++;
            nhan(a,b,c,m,n);
        }
    }
}
