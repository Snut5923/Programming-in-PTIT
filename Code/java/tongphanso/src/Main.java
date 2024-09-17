import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phanso a = new phanso(sc.nextLong(),sc.nextLong());
        phanso b = new phanso(sc.nextLong(),sc.nextLong());
        a.cong(b);
        a.toigian();
        a.in();
    }
}