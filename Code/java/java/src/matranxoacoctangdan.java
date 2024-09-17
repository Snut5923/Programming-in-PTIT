import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class matranxoacoctangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer> arr = new ArrayList<>();
        int t = n*n;
        int tmp = t;
        while(tmp-->0){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int cnt = 0;
        int h1 = 0,h2 = n-1,c1=0,c2=n-1;
        while(cnt < t){
            for(int i=c1;i<=c2;i++){
                a[h1][i] = arr.get(cnt);
                cnt++;
            }
            for(int i=h1+1;i<=h2;i++){
                a[i][c2] = arr.get(cnt);
                cnt++;
            }
            for(int i=c2-1;i>=c1;i--){
                a[h2][i] = arr.get(cnt);
                cnt++;
            }
            for(int i=h2-1;i>=h1+1;i--){
                a[i][c1] = arr.get(cnt);
                cnt++;
            }
            c1++;
            c2--;
            h1++;
            h2--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
