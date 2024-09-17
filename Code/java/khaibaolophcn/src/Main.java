import java.util.Scanner;

public class Main {
    static void in(Rectange a){
        String c = a.getColor().toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(c.charAt(0)));
        sb.append(c.substring(1));
        System.out.print(sb);
    }
    static int check(Rectange a){
        if(a.getWidth()<=0 || a.getHeight()<= 0) return 0;

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange();
        a.setHeight(sc.nextDouble());
        a.setWidth(sc.nextDouble());
        a.setColor(sc.next());
        if(a.getWidth()>0 && a.getHeight()>0){
            System.out.print(String.format("%.0f",a.findPerimeter())+" ");
            System.out.print(String.format("%.0f",a.findArea())+" ");
            in(a);
            System.out.println();
        }
        else System.out.println("INVALID");
    }
}