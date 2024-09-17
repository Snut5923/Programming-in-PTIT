package tt;

import java.util.*;
import java.io.*;
public class tt implements Comparable<tt>{
    private String masv,madn,ten,lop;
    private long sosv;
    public tt(String s,HashMap<String,sv> a){
        String[] tmp = s.split("\\s+");
        this.masv = tmp[0];
        this.madn = tmp[1];
        xuli(a);
    }
    public void xuli(HashMap<String,sv> a){
        sv x = a.get(masv);
        this.ten = x.getten();
        this.lop = x.getlop();
    }
    public String getmdn(){
        return madn;
    }
    @Override
    public String toString(){
        return masv+" "+ten+lop;
    }
    @Override
    public int compareTo(tt x){
        return masv.compareTo(x.masv);
    }
}
