/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j05018;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<xyz> kq = new ArrayList<>();
        for(int i=1;i<=t;i++){
            xyz a = new xyz(i,sc.nextLine(),sc.nextLine());
            kq.add(a);
        }
        Collections.sort(kq);
        for(xyz x : kq){
            System.out.println(x);
        }
    }
   
}
