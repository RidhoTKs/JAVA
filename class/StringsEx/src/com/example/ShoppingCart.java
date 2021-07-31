/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        int spaceIdx = custName.indexOf(" ");
        String firstName = custName.substring(spaceIdx);
        // Get the index of the space character (" ") in custName. 
        System.out.println(spaceIdx);
        System.out.println(firstName);
        // Use the substring method parse out the first name and print it.


    }

    
}
