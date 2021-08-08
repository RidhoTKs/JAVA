/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhyminggame;

import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class RhymingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String animal;
        animal = getAnimal(in);
        if (rhymningAnimal(animal)) {
            System.out.println("This is animal rhymes with cat");
        } else {
            System.out.println("This animal doesn'nt rhyme");
        }
        in.close();
    }
    
    private static boolean rhymningAnimal(String animal){
        return animal.matches("[a-zA-Z]{1,2}(at|AT)");
    }
    
    private static String getAnimal(Scanner in){
        System.out.println("Please enter the name of the animal: ");
        return in.next();
    }
    
}
