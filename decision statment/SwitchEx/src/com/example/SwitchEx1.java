/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("masukan bulan dalam angka");
        month = sc.nextInt();
        switch(month){
            case 1 :
                System.out.println("Januari");
                break;
            case 2 :
                System.out.println("Februari");
                break;
            case 3 :
                System.out.println("Maret");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("Mei");
                break;
            case 6 :
                System.out.println("Juni");
                break;
            case 7 :
                System.out.println("Juli");
                break;
            case 8 :
                System.out.println("Agustus");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("Oktober");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("Desember");
                break;
            default :
                System.out.println("invalid number,  input beetwen 1 - 12");
        }
                
    }
}
