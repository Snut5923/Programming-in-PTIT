import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());
            double x = a.d(b), y = a.d(c), z = b.d(c);
            if((x+y>z) && (x+z>y) && (y+z>x)){
                a.heron(x,y,z);
                a.surround(x,y,z);
                System.out.println(a);
            }
            else{
                System.out.println("INVALID");
            }
        }

    }
}