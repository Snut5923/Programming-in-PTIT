import java.util.Scanner;

public class sapxepchen {
    static void sxchen(int[] a){
        for(int i=0;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
            System.out.print("Buoc "+i+": ");
            for(int k=0;k<=i;k++){
                System.out.print(a[k]+ " ");
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
        sxchen(a);
    }
}
