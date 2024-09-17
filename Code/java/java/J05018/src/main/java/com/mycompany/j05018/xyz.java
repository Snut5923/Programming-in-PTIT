/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j05018;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class xyz implements Comparable<xyz>{
    private String ten,status,ma;
    private double tb;
    public xyz(int i,String ten,String s){
        this.ma = String.format("HS%02d",i);
        this.ten = ten;
        String[] tmp = s.split("\\s+");
        double tong = 0;
        for(int j=0;j<10;j++){
            if(j<=1){
                tong += 2*Double.parseDouble(tmp[j]);
            }
            else tong += Double.parseDouble(tmp[j]);
        }
        this.tb = Double.parseDouble(String.format("%.2f", tong/12));
        this.status = loai();
    }
    public String loai(){
        if(tb >= 9) return "XUAT SAC";
        else if(tb >= 8) return "GIOI";
        else if(tb >= 7) return "KHA";
        else if(tb>= 5) return "TB";
        return "YEU";
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f",tb)+" "+status;
    }
    @Override
    public int compareTo(xyz x){
        if(tb < x.tb) return 1;
        if(tb > x.tb) return -1;
        return ma.compareTo(x.ma);
    }
}
