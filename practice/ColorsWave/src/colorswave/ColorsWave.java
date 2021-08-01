/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorswave;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class ColorsWave {
    Scanner sc = new Scanner(System.in);
    public double colorCode;
    /**
     * @param args the command line arguments
     */
    
    public void getColorByCode (double colorCode){
        if (colorCode >= 380 && colorCode < 450) {
            System.out.println("the color : " + "Violet");
        } else if (colorCode >=450 && colorCode < 495) {
            System.out.println("the color : " + "Blue");
        } else if (colorCode >= 495 && colorCode < 570) {
            System.out.println("the color : " + "Green");
        } else if (colorCode >= 570 && colorCode < 590) {
            System.out.println("the color : " + "Yellow");
        } else if (colorCode >= 590 && colorCode < 620) {
            System.out.println("the color : " + "Orange");
        } else if (colorCode >= 620 && colorCode < 750) {
            System.out.println("the color : " + "Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ColorsWave cw = new ColorsWave();
        System.out.println("input color code");
        cw.colorCode = cw.sc.nextDouble();
        cw.getColorByCode(cw.colorCode);
    }
    
}
