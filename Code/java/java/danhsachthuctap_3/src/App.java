import java.util.*;
import java.io.*;
import java.text.*;
public class App {
    public static void main(String[] args) throws IOException {
        // Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        // Scanner sc2 = new Scanner(new File("DN.in"));
        // Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        Scanner sc1 = new Scanner(new File("D:/1.txt"));
        Scanner sc2 = new Scanner(new File("D:/2.txt"));
        Scanner sc3 = new Scanner(new File("D:/3.txt"));
        HashMap<String,sv> a = new HashMap<>();
        HashMap<String,Long> d = new HashMap<>();
        HashMap<String,String> b = new HashMap<>();
        ArrayList<tt> kq = new ArrayList<>();
        ArrayList<tt> c = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine());
        while(t-->0){
            sv x = new sv(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            if(!a.containsKey(x.getmsv())){
                a.put(x.getmsv(), x);

            }
        }
        t = Integer.parseInt(sc2.nextLine());
        while(t-->0){
            dn x = new dn(sc2.nextLine(), sc2.nextLine(), sc2.nextLine());
            if(!b.containsKey(x.getmdn())){
                b.put(x.getmdn(), x.getten());
            }
            if(!d.containsKey(x.getmdn())){
                d.put(x.getmdn(), x.sl());
            }
        }
        HashMap<String,Integer> dem = new HashMap<>();
        t = Integer.parseInt(sc3.nextLine());
        while(t-->0){
            tt x = new tt(sc3.nextLine(), a);
            c.add( x);
        }
        Collections.sort(c);
        for(tt x : c){
            if(!dem.containsKey(x.getmdn())){
                dem.put(x.getmdn(), 1);
            }
            else{
                int z = dem.get(x.getmdn());
                dem.put(x.getmdn(), z+1);
            }
            if(dem.get(x.getmdn()) <= d.get(x.getmdn())){
                kq.add(x);
            }
        }
        t = Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s = sc3.nextLine();
            System.out.println("DANH SACH THUC TAP TAI "+b.get(s)+":");
            for(tt x : kq){
                if(s.equals(x.getmdn())) System.out.println(x);
            }
        }

    }
}
