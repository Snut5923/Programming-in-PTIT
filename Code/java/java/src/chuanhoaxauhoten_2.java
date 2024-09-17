import java.util.Scanner;

public class chuanhoaxauhoten_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] c = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<c.length-1;i++){
                sb.append(Character.toUpperCase(c[i].charAt(0)));
                sb.append(c[i].substring(1).toLowerCase());
                sb.append(" ");
            }
            sb.append(Character.toUpperCase(c[c.length-1].charAt(0)));
            sb.append(c[c.length-1].substring(1).toLowerCase());
            sb.append(", ");
            sb.append(c[0].toUpperCase());
            System.out.println(sb);
        }
    }
}
