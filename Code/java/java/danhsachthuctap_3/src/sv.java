import java.util.*;
import java.io.*;
public class sv implements Comparable<sv>{
    private String ma,ten,lop,email;
    public sv(String ma,String ten,String lop,String email){
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
    }
    public String getmsv(){
        return ma;
    }
    public String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        for(String i : tmp){
            sb.append(Character.toUpperCase(i.charAt(0))+i.substring(1)+" ");
        }
        return sb.toString();
    }
    public String getten(){
        return ten;
    }
    public String getlop(){
        return lop;
    }
    @Override
    public int compareTo(sv x){
        return ma.compareTo(x.ma);
    }
}
