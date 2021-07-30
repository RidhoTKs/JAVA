/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integervariable;

/**
 *
 * @author RTKS
 */
public class IntegerVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myInt = 1;
        myInt = 2147483647;
        myInt = -2147483648;
        //myInt = 2147483648 ; //error karena nilai melebihi kapasitas memori integer, tidak bisa di casting
        
        //memberikan nilai dari variable lain ke integer
        byte myByte = 1;
        myInt = myByte;
        System.out.println("byte ke integer : " + myInt);
        short myShort = 10;
        myInt = myShort;
        System.out.println("short ke integer : " + myInt);
        long myLong = 2147483648L;
        myInt = (int)myLong;
        System.out.println("Long ke integer : " + myInt);
        float myFloat = 2.6F;
        myInt = (int)myFloat;
        System.out.println("float ke integer : " + myInt);
        double myDouble = 2.6;
        myInt = (int)myDouble;
        System.out.println("double ke integer : " + myInt);
    
        int totalInt;
        totalInt = myInt + myByte;
        System.out.println("byte + integer : " + totalInt);
        totalInt = myInt + myShort;
        System.out.println("short + integer : " + totalInt);
        totalInt = myInt + (int)myLong;
        System.out.println("double + integer : " + totalInt);
        totalInt = (int) (myInt + myFloat);
        System.out.println("float + integer : " + totalInt);
    }
    
}
