import java.util.Arrays;
import java.util.Scanner;

public class demsolanxuathien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++){
            int n = sc.nextInt();
            int[] dem = new int[100001];
            int[] a = new int[n];
            Arrays.fill(dem,0);
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                dem[a[i]]++;
            }
            System.out.println("Test "+j+":");
            for(int i=0;i<n;i++){
                if(dem[a[i]] != 0){
                    System.out.println(a[i]+" xuat hien "+dem[a[i]]+" lan");
                    dem[a[i]]=0;
                }
            }
        }
    }
}
