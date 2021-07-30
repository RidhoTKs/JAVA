/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tip01;

/**
 *
 * @author RTKS
 */
public class calculatorTest {
    public static void main(String args[]){
        Tip01 calc = new Tip01();
        calc.originalPrice = 13;
        calc.findTotal();
        
        calc.originalPrice = 15;
        calc.findTotal();
    }
}
