package danhsachsinhvien1;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException,ParseException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> kq = (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien x : kq){
            System.out.println(x);
        }
    }
}
// class SinhVien implements Serializable{
//     private String ma,ten,lop;
//     SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
//     private Date dob;
//     private float gpa;
//     public SinhVien(int id,String ten,String lop,String dob,float gpa) throws ParseException{
//         this.ma = String.format("B20DCCN%03d", id+1);
//         this.ten = ten;
//         this.lop = lop;
//         this.dob = sd.parse(dob);
//         this.gpa = gpa;
//     }
//     @Override
//     public String toString(){
//         return ma+" "+ten+" "+lop+" "+sd.format(dob)+" "+String.format("%.2f", gpa);
//     }
// }