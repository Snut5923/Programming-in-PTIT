import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class daycontangdan {
    static int n;
    static int[] a ;
    static int[] b ;
    static ArrayList<Integer> arr = new ArrayList<>();
    static ArrayList<String> res = new ArrayList<>();
    static int check(){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)) return 0;
        }
        return 1;
    }
    static void xuli(){
        if(arr.size()>1 && check()==1){
            String tmp = "";
            for(int i=0;i<arr.size();i++){
                tmp += arr.get(i) + " ";
            }
            res.add(tmp);
            arr.clear();
        }
        else{
            arr.clear();
        }
    }
    static void Try(int i){
        for(int j=0;j<=1;j++){
            b[i] = j;
            if(i==n-1){
                for(int x=0;x<n;x++){
                    if(b[x]==1) arr.add(a[x]);
                }
                xuli();
            }
            else{
                Try(i+1);
            }
        }

    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a= new int[n];
        b= new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Try(0);
        Collections.sort(res);
        for(String i : res){
            System.out.println(i);
        }
    }
}
