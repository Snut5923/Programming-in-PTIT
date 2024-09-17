import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            a.Point(sc.nextDouble(),sc.nextDouble());
            b.Point(sc.nextDouble(),sc.nextDouble());
            c.Point(sc.nextDouble(),sc.nextDouble());
            if((a.distance(b)+b.distance(c)>a.distance(c))&&
                    (b.distance(c)+c.distance(a)>a.distance(b)) &&
                    (c.distance(a)+a.distance(b)>b.distance(c))){
                System.out.println(String.format("%.3f",a.distance(b)+b.distance(c)+c.distance(a)));
            }
            else System.out.println("INVALID");
        }
    }
}