import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(new File("D:/3.txt"));
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.contains(b)){
                for(int i=0;i<=a.length()-b.length();i++){
                    if(a.charAt(i)==b.charAt(0)){
                        String tmp = a.substring(i, i+b.length());
                        if(tmp.equals(b)) System.out.print(i+1+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
