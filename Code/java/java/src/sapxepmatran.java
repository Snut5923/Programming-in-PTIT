import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sapxepmatran {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int m,n,i;
            int[][] a = new int[101][101];
            n = Integer.parseInt(sc.next());
            m = Integer.parseInt(sc.next());
            i = Integer.parseInt(sc.next());
            sc.nextLine();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    a[x][y] = Integer.parseInt(sc.next());
                    if(y == i-1) arr.add(a[x][y]);
                }
            }
            Collections.sort(arr);
            int tmp = 0;
            for(int x=0;x<n;x++){
                a[x][i-1] = arr.get(tmp);
                tmp++;
            }
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    System.out.print(a[x][y]+" ");
                }
                System.out.println();
            }
            sc.nextLine();
        }

    }
}
