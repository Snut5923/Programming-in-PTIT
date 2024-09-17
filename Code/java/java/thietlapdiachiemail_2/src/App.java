import java.util.*;
import java.io.*;
import java.text.*;
public class App{
    public static void main(String[] args) throws IOException{
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] c = s.trim().toLowerCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            StringBuilder b = new StringBuilder();
            for(String i : c){
                b.append(i+" ");
            }
            String  y = b.toString();
            if(!set.contains(y)){
                set.add(y);
                sb.append(c[c.length-1].toLowerCase());
                for(int i=0;i<c.length-1;i++){
                    sb.append(Character.toLowerCase(c[i].charAt(0)));
                }
                System.out.print(sb);
                String tmp = sb.toString();
                if(!map.containsKey(tmp)){
                    map.put(tmp,1);
                }
                else{
                    int x = map.get(tmp);
                    x++;
                    map.put(tmp,x);
                    System.out.print(x);
                }
                System.out.print("@ptit.edu.vn");
                System.out.println();
            }
        }
    }
}
//    nGUYEn    quaNG   vInH  
//    tRan   thi THU    huOnG
//    nGO   quoC  VINH
//  lE            tuAn    aNH
// NGO QUOC VINH
// Tran THI THU huong