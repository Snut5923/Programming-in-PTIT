import java.util.Scanner;

public class dayuuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] tmp = s.trim().split("\\s+");
            int le=0,chan=0;
            for(String x : tmp){
                if(Integer.parseInt(x)%2==0) chan++;
                else le++;
            }
            if((tmp.length%2==0 && chan>le)||(tmp.length%2==1 && le>chan)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
