import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
class Point{
    private double x,y;
    private double d;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    public double distance(Point a){
         return Math.sqrt((x-a.x)*(x-a.x)+(y-a.y)*(y-a.y));
    }
}
class Triangle{
    private double d;
    public double x,y,z;
    public Triangle(Point a,Point b,Point c){
        x = a.distance(b);
        y = a.distance(c);
        z = b.distance(c);
    }
    public boolean valid(){
        if(x+y>z && x+z>y && y+z>x) return true;
        return false;
    }
    public String getPerimeter(){
        return String.format("%.3f",x+y+z);
    }
}
