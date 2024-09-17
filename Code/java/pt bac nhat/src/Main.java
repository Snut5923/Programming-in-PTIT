import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }
        else{
            double c = -b/a;
            System.out.println(String.format("%.2f",c));
        }
    }
}