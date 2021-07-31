/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computemethod;

import java.util.Random;

/**
 *
 * @author RTKS
 */
public class ComputeMethod {

    /**
     * @param args the command line arguments
     */
    public double fToC(double degreeF) {
        double celcius ;
        celcius = (5*(degreeF - 32)/9);
        return celcius;
    }
    
    public double hypotenuse(int a, int b) {
        double c = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
        return c;
    }
    
    public int roll() {
        Random rnd = new Random();
        int rollOne = rnd.nextInt(6)+1;
        int rollTwo = rnd.nextInt(6)+1;
        int totalRoll = rollOne + rollTwo;
        return totalRoll;
    }
    
}
