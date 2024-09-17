import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class danhsachsinhvientrongfile_2{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<String> kq = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        int cnt = 1;
        while(t-- > 0){
            String ten,masv,ngaysinh,lop;
            double gpa;
            ten = sc.nextLine();
            lop = sc.next();
            String a = sc.next();
            gpa = sc.nextDouble();
            if(sc.hasNextLine()){
                sc.nextLine();
            }
            masv = String.format("B20DCCN%03d",cnt);
            if(a.length()<10){
                StringBuilder sb = new StringBuilder();
                if(a.length()==8){
                    sb.append("0");
                    sb.append(a.substring(0,2));
                    sb.append("0");
                    sb.append(a.substring(2));
                    ngaysinh = sb.toString();
                }
                else{
                    if(a.charAt(1)=='/'){
                        sb.append("0");
                        sb.append(a);
                        ngaysinh = sb.toString();
                    }
                    else{
                        sb.append(a.substring(0,3));
                        sb.append("0");
                        sb.append(a.substring(3));
                        ngaysinh = sb.toString();
                    }
                }
            }
            else{
                ngaysinh = a;
            }
            cnt++;
            kq.add(masv+" "+ten+" "+lop+" "+ngaysinh+" "+String.format("%.2f",gpa));
        }
        for(String y : kq){
            System.out.println(y);
        }
    }
}

