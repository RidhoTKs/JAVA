/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdemo;

/**
 *
 * @author RTKS
 */
public class StringBuilderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder str = new StringBuilder("Learning Java with Oracle");
        
        System.out.println("stirng = " + str);
        System.out.println("The length of the text is : " + str.length());
        System.out.println("The character at the begining is : " + str.charAt(0));
        System.out.println("The secod character of the start of the text \"acl\" is : " + str.indexOf("acl"));
        System.out.println("The following text is iinluded within the string " + str.substring(1, 4));
        System.out.println("reverse = " + str.reverse());
        System.out.println("reverse = " + str.reverse());
        str.append(" is fun");
        System.out.println("Append string = " + str);
        str.delete(8, 13);
        System.out.println("Deleted string = " + str);
        str.insert(8, " Java Programming");
        System.out.println("Inserted string = " + str);
    }
    
}
