/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double price = sc.nextDouble();
        int rating = 5;
        if (price >= 12 && rating == 5) {
            System.out.println("i want watch this movie");
        }
        else {
            System.out.println("i dont want watch this movie");
        }
            
        

    }
}
