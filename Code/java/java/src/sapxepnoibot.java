import java.util.Scanner;

public class sapxepnoibot {
    static void bubble(int[] a){
        boolean swap;
        for(int i=0;i<a.length-1;i++){
            int l = 0;
            swap = false;
            while(l < a.length-1-i){
                if(a[l]>a[l+1]){
                    swap = true;
                    int tmp = a[l+1];
                    a[l+1] = a[l];
                    a[l] = tmp;
                }
                l++;
            }
            if(swap){
                System.out.print("Buoc "+(i+1)+": ");
                for(int x : a){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            else return;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        bubble(a);
    }
}
