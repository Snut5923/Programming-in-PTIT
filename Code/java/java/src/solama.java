import java.util.Scanner;

public class solama {
    public static int doi(char c){
        if(c == 'I') return 1;
        if(c== 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            long tong = 0;
            for(int i=0;i<c.length;i++){
                if(i < c.length - 1 && doi(c[i]) < doi(c[i+1])){
                    tong += doi(c[i+1]) - doi(c[i]);
                    i++;
                }
                else{
                    tong += doi(c[i]);
                }
            }
            System.out.println(tong);
        }
    }
}
