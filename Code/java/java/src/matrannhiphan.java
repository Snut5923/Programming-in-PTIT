import java.util.Scanner;

public class matrannhiphan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int dem;
        int kq = 0;
        for(int i=0;i<n;i++){
            dem =0;
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    dem++;
                }
            }
            if(dem > 3-dem) kq++;
        }
        System.out.println(kq);
    }
}
