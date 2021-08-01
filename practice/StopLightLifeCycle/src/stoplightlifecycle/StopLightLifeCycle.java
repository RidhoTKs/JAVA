/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoplightlifecycle;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class StopLightLifeCycle {

    static Scanner sc = new Scanner(System.in);
    public String colorLight;
    public int colorLightCode;

    /**
     * @param args the command line arguments
     */
    // with if else chaining constuc
    public void getTheNextLight(int colorLightCode) {
        if (colorLightCode == 1) {
            this.colorLight = "Green";
            System.out.println("the next light is " + this.colorLight);
        } else if (colorLightCode == 2) {
            this.colorLight = "Yellow";
            System.out.println("the next light is " + this.colorLight);
        } else if (colorLightCode == 3) {
            this.colorLight = "Red";
            System.out.println("the next light is " + this.colorLight);
        } else {
            System.out.println("invalid color");
        }
    }

    //with switch cunstruc
    public void getTheNextLightSwitch(int colorLightCode) {
        switch (colorLightCode) {
            case 1:
                this.colorLight = "Green";
                System.out.println("the next light is " + this.colorLight);
                break;
            case 2:
                this.colorLight = "Yellow";
                System.out.println("the next light is " + this.colorLight);
                break;
            case 3:
                this.colorLight = "Red";
                System.out.println("the next light is " + this.colorLight);
                break;
            default:
                System.out.println("invalid number");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        StopLightLifeCycle stopLightLifeCycle = new StopLightLifeCycle();
        System.out.println("input the color code");
        stopLightLifeCycle.colorLightCode = sc.nextInt();
        //pemanggilan method get next light dengan if statement
        stopLightLifeCycle.getTheNextLight(stopLightLifeCycle.colorLightCode);
        //pemanggilan method get next light dengan switch statement
        stopLightLifeCycle.getTheNextLightSwitch(stopLightLifeCycle.colorLightCode);
    }

}
