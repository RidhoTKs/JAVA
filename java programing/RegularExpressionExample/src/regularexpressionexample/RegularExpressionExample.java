/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpressionexample;

/**
 *
 * @author RTKS
 */
public class RegularExpressionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (getAnimal("Cat")) {
            System.out.println("This is a Valid Animal");
        } else {
            System.out.println("This is not a Valid Animal");
        }
    }
    
    public static boolean getAnimal(String animal){
        return animal.matches("[Cc]at|[Dd]og"); //square bracket allow char variation to validate
    }
    
}
