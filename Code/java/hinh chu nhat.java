import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int p = (a+b)*2;
        int s = a*b;
        if(a<=0 || b<=0){
            System.out.println("0");
        }
        else{
            System.out.println(p + " " + s);
           
        }
    }
}