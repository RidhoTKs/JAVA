package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int sum = 0;
       int inputNumber;
        System.out.println("Masukan 10 angka");
        for (int i = 0; i < 10; i++) {
            inputNumber = sc.nextInt();
            if (inputNumber == 0) {
                break;
            } else {
                sum += inputNumber;
            }
        }
        
        System.out.println("total number ");

    }
}
