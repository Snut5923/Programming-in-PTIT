import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsachsinhvientrongfile_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<sv> kq = new ArrayList<>();
        while(t-- > 0){
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            kq.add(new sv(masv,ten,lop,email));
        }
        Collections.sort(kq);
        for(sv x : kq){
            System.out.println(x);
        }
    }
}
class sv implements Comparable<sv>{
    private String masv,ten,lop,email;
    sv(String masv,String ten,String lop,String email){
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public void doi(){
        String[] tmp = ten.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String x : tmp){
            sb.append(Character.toUpperCase(x.charAt(0)));
            sb.append(x.substring(1)+" ");
        }
        ten = sb.toString();
    }
    @Override
    public String toString(){
        doi();
        return masv+" "+ten+lop+" "+email;
    }
    @Override
    public int compareTo(sv x){
        return this.masv.compareTo(x.masv);
    }
}
