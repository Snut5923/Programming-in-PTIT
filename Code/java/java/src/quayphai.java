import java.util.*;

public class quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Deque<Integer> d = new ArrayDeque<>();
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                int tmp = sc.nextInt();
                arr.add(tmp);
                d.addLast(tmp);
            }
            Collections.sort(arr);
            int dem = 0;
            while(d.getFirst() != arr.get(0)){
                int tmp = d.getFirst();
                d.removeFirst();
                d.addLast(tmp);
                dem++;
            }
            System.out.println(dem);
        }
    }
}
