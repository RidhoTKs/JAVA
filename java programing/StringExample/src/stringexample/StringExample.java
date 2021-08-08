/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexample;

/**
 *
 * @author RTKS
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Sample String";
        
        displayString(str);
        
        System.out.println("========================");
        
        displayStringBackward(str);
        
        System.out.println("========================");
        
        searchString(str, 'S');
    }
    
    
    static void searchString(String str, char c){
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        
        System.out.println("The character " + c 
                            + " appears in the text "
                            + count + " times");
    }
    
    static void displayStringBackward(String str){
        System.out.println(str);
        String strBackward="";
        
        
        for (int i = str.length()-1; i >=0; i--) {
//            System.out.println(str.charAt(i));
        strBackward += str.substring(i, i+1);
        }
        
        System.out.println(strBackward);
    }
    
    static void displayString(String str){
        System.out.println(str);
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    
}
