import java.util.Scanner;

public class chuanhoaxauhoten_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] c = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : c){
                sb.append(Character.toUpperCase(x.charAt(0)));
                sb.append(x.substring(1).toLowerCase());
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
