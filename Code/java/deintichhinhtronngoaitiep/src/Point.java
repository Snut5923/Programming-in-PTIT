import java.util.*;
import java.lang.*;
public class Point {
    private double x,y,s,r,sur;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double d (Point tmp){
        return Math.sqrt((x-tmp.x)*(x-tmp.x)+(y-tmp.y)*(y-tmp.y));
    }
    public void heron(double a,double b,double c){
        double p = (a+b+c)/2;
        this.s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void surround(double a,double b,double c){
        this.r = (a*b*c)/(4*this.s);
        this.sur =  Math.PI*r*r;
    }
    @Override
    public String toString(){
        return String.format("%.3f",sur);
    }
}
