/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputname;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class InputName {

    /**
     * @param args the command line arguments
     */
    public String firstName, lastName;
    
    public InputName(String firstName, String lastName){
       this.firstName= firstName;
       this.lastName= lastName;
    }
    
    public void returnName(){
        System.out.println("Your name is : " + lastName+", " + firstName.charAt(0));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name : ");
        String firstName = sc.next();
        String lastName = sc.next();
        InputName input = new InputName(firstName, lastName);
        input.returnName();
    }
    
}
