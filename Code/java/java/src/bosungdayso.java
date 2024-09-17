import java.util.Arrays;
import java.util.Scanner;

public class bosungdayso {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dem = new int[201];
        Arrays.fill(dem,0);
        int max = -1;
        while(t-- > 0){
            int x = sc.nextInt();
            dem[x]++;
            max = Math.max(max,x);
        }
        int check=0;
        for(int i=1;i<=max;i++){
            if(dem[i]==0){
                System.out.println(i);
                check++;
            }
        }
        if(check==0){
            System.out.println("Excellent!");
        }
    }
}
