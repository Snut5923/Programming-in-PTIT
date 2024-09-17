import java.util.Scanner;

public class sapxepchon {
    static void selectionsort(int[] a){
        int r=1;
        for(int i=0;i<a.length-1;i++){
            int min = 200;
            int t=0;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < min){
                    min = a[j];
                    t = j;
                }
            }
            if(a[t] < a[i]){
                int tmp = a[i];
                a[i] = a[t];
                a[t] = tmp;
            }
            System.out.print("Buoc "+r+": ");
            r++;
            for(int x  : a){
                System.out.print(x+" ");
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
        selectionsort(a);
    }
}
