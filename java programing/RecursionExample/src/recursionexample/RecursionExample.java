/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexample;

/**
 *
 * @author RTKS
 */
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        recurseMethod(4);
    }
    
    static void recurseMethod(int num){
        if (num == 0) {
            return;
        } else {
            System.out.println("hello " + num);
            recurseMethod(--num);
            System.out.println(""+num);
            return;
        }
    }
    
    public static double factorial(double d){
        if (d <= 1) {
            return 1;
        } else {
            return d * factorial(d-1);
        }
    }
    
}
