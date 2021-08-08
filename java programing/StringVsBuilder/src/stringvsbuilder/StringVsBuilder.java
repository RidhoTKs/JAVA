/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringvsbuilder;

/**
 *
 * @author RTKS
 */
public class StringVsBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder str = new StringBuilder("Test immtability");
        
        String str2 = "Test immutability";
        String str3 = "Test immutability";
        
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
        System.out.println("String3: " + str3.hashCode());
        
        str.replace(0, str.length(), "HelloWorld");
        str2 = "HelloWorld";
        
        System.out.println("StringBuilder: " + str.hashCode());
        System.out.println("String: " + str2.hashCode());
    }
    
}
