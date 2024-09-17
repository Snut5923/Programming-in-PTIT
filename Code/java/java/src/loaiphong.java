import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loaiphong {
    public static void main(String[] args) throws IOException{
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    static class LoaiPhong implements Comparable<LoaiPhong> {
        private String kh, ten, don, phi;

        LoaiPhong(String s) {
            String[] tmp = s.split("\\s+");
            int t = 4;
            for (String x : tmp) {
                if (t == 4) kh = x;
                if (t == 3) ten = x;
                if (t == 2) don = x;
                if (t == 1) phi = x;
                t--;
            }
        }

        @Override
        public String toString() {
            return kh + " " + ten + " " + don + " " + phi;
        }

        @Override
        public int compareTo(LoaiPhong x) {
            return this.ten.compareTo(x.ten);
        }
    }
}
