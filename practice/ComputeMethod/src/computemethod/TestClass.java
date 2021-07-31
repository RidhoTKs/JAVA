/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computemethod;

/**
 *
 * @author RTKS
 */
public class TestClass {
    public static void main(String [] args){
        ComputeMethod compute = new ComputeMethod();
        System.out.println(compute.fToC(200));
        System.out.println(compute.hypotenuse(5, 3));
        System.out.println(compute.roll());
    }
}
