package tt;

import java.util.*;
import java.io.*;
public class dn{
    private String ma,ten;
    private long sosv;
    public dn(String ma,String ten,String sosv){
        this.ma = ma;
        this.ten = ten;
        this.sosv = Long.parseLong(sosv);
    }
    public String getmdn(){
        return ma;
    }
    public String getten(){
        return ten;
    }
    public long sl(){
        return sosv;
    }
}