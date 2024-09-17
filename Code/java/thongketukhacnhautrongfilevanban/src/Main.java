import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static boolean dau(char s){
        if(s==',' || s=='.' || s=='?' || s=='!' || s==':' || s==';' || s=='(' || s==')' || s=='/' || s=='-'){
            return true;
        }
        return false;
    }
    public static void xuli(String s){
        for(int i=0;i<s.length();i++){
            if(dau(s.charAt(i))) s.charAt(i) = ' ';
        }
    }
    public static boolean checkkitu(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) && Character.isDigit(s.charAt(i))) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/1.txt"));
        int t = Integer.parseInt(sc.nextLine());
        TreeSet<String> kq = new TreeSet<>();
        HashSet<String> s = new HashSet<>();
        while(t-->0){

        }
    }
}
