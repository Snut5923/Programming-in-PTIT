import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sv> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            kq.add(new sv(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(kq);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            for(sv x : kq){
                if(x.get().equals(s)) System.out.println(x);
            }
        }
    }
}