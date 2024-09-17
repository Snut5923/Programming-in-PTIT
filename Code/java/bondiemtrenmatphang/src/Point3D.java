import java.awt.*;
import java.util.*;
class Point3D {
    private double x,y,z;
    public Point3D (double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void xuli(Point3D X,Point3D Y,Point3D Z){
        X.x = Y.x - Z.x;
        X.y = Y.y - Z.y;
        X.z = Y.z - Z.z;
    }
    public static void cohuong(Point3D X,Point3D A,Point3D B){
        X.x = A.y*B.z - A.z*B.y;
        X.y = A.z*B.x - A.x*B.z;
        X.z = A.x*B.y - A.y*B.x;
    }
    public static boolean check(Point3D A,Point3D B,Point3D C,Point3D D){
        Point3D a = new Point3D(A.x - B.x,A.y - B.y,A.z-B.z);
        Point3D b = new Point3D(A.x - C.x,A.y - C.y,A.z-C.z);
        Point3D c = new Point3D(a.y*b.z - a.z*b.y,a.z*b.x - a.x*b.z,a.x*b.y - a.y*b.x);
        if(c.x*(D.x - A.x) + c.y*(D.y - A.y) + c.z*(D.z - A.z) == 0){
            return true;
        }
        return false;
    }
}