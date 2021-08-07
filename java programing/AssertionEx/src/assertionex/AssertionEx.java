/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertionex;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class AssertionEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number : ");
        double number = input.nextDouble();
        input.close();

        assert number < 2_147_483_647.0 : "Number too large to convert to integer";
        /*assert evaluates the Boolean expression
          If the expression evaluates to true the normal code continues,
          If the expression evaluates to false it will throw an
          AssertionsError exception
          The assertion must be enable first*/

        System.out.println("Value of number : " + number);
        int y = (int) number;
        System.out.println(y);

    }

}
