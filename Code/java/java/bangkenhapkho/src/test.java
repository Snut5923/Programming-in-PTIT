import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb= new StringBuilder();
        String[] tmp = s.toUpperCase().split(" ");
        char c1 = tmp[0].charAt(0);
        char c2 = tmp[1].charAt(0);
        sb.append(c1+""+c2);
        System.out.println(sb.toString());
    }
}
