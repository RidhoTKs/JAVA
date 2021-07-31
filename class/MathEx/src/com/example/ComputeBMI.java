/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            double weights = 132.5;
            double heigths = 62.5;
            int bmi;
            bmi =  (int) Math.round(weights/Math.pow(heigths, 2)*703);
            System.out.println(bmi);
        }
}
