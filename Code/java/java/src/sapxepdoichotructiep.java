import java.util.Scanner;

public class sapxepdoichotructiep {
    static void sort(int[] a){
        int y=1;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j< a.length; j++){
                if(a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
            System.out.print("Buoc "+y+": ");
            y++;
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sort(a);
    }
}
