/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssncheck;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class SsnCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String ssn;
        ssn = getSsn(in);
        if (validSsn(ssn)) {
            System.out.println(ssn + " is a valid Social Security Number!");
        } else {
            System.out.println("This ssn is not valid! must be in the format of(999 - 99 - 9999)");
        }
        in.close();
    }

    private static String getSsn(Scanner in) {
        System.out.print("Please enter your Social Security Number: ");
        return in.next();
    }//

    static boolean validSsn(String ssn) {
        return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }//

}
