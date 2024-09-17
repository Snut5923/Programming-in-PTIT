import java.util.*;
import java.io.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Point> kq = new ArrayList<>();
            for(int i=0;i<n;i++){
                kq.add(new Point(sc.nextDouble(), sc.nextDouble()));
            }
            Point A = kq.get(0);
            double res = 0;
            for(int i=1;i<n-1;i++){
                Point B = kq.get(i);
                Point C = kq.get(i+1);
                double a = A.distance(B), b = B.distance(C), c = C.distance(A);
                res += A.s(a, b, c);
            }
            System.out.println(String.format("%.3f", res));
        }
    }
}
class Point{
    private double x,y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double s(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double distance(Point a,Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    public double distance(Point a){
        return Math.sqrt(Math.pow(x - a.x, 2)+Math.pow(y - a.y, 2));
    }
    
}