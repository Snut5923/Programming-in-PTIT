import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class diachiemail {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] c = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
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
