package danhsachsinhvien1;
import java.util.*;
import java.io.*;
import java.text.*;
public class SinhVien implements Serializable{
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int id,String ten,String lop,String ngaysinh,float gpa) throws ParseException{
        this.ma = String.format("B20DCCN%03d", id+1);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sd.parse(ngaysinh);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return ma+" "+ten+" "+lop+" "+sd.format(ngaysinh)+" "+String.format("%.2f", gpa);
    }
}
