import java.util.Map;
import java.util.Scanner;

public class stamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            p a = new p(sc.nextDouble(),sc.nextDouble());
            p b = new p(sc.nextDouble(),sc.nextDouble());
            p c = new p(sc.nextDouble(),sc.nextDouble());
            double x = a.distance(b),y = b.distance(c), z = c.distance(a);
            if((x+y>z) && (x+z>y) && (y+z>x)){
                a.heron(x,y,z);
                System.out.println(a);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
class p{
    private double x,y,s;
    public p(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance(p a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }
    public void heron(double a,double b,double c){
        this.s = 0.25 * Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
    }
    @Override
    public String toString(){
        return String.format("%.2f",s);
    }
}