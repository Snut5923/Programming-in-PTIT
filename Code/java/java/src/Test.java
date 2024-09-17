import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    static boolean search(int[] a,int k){
        int m;
        int l = 0;
        int r = a.length-1;
        while(l<=r){
            m = (l+r)/2;
            if(a[m] == k){
                return true;
            }
            if(a[m] < k){
                l = m+1;
            }
            if(a[m] > k){
                r = m-1;
            }
        }
        return false;
    }
    public static void main(String[] args)  throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(search(a,k));
    }
}
//<<pi<t>>ta- i=2,st.push(p)
// point = 4;cur =4;
//c[i] = < point = 3
//
//
//
//
//
//