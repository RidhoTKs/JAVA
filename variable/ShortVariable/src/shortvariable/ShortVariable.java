/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortvariable;

/**
 *
 * @author RTKS
 */
public class ShortVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short myShortVariable = 1;
        myShortVariable = 32767;
        myShortVariable = -32768;
        myShortVariable = (short)32768; //karena nilai yang di berikan lebih dari nilai maksimum yg bisa di tampung maka harus di casting
        System.out.println("nilai dari myShortVariable setelah di casting dengan nilai yg kebih dari maksimum : " + myShortVariable);
        
        //memberikan nilai dari variable bertipe data byte, integer, long ouble dan float;
        byte myByte = 1;
        myShortVariable = myByte; //bisa  memberikan nilai dari variable bertipe byte
        int myInt = 2;
        long myLong = 10L;
        myShortVariable = (short) myInt; // harus di casting terlebih dahulu
        System.out.println("int ke short : " + myShortVariable);
        myShortVariable = (short) myLong;
        System.out.println("long ke short : " + myShortVariable);
        float myFLoat = 2.6F;
        myShortVariable = (short) myFLoat;
        System.out.println("float ke short : " + myShortVariable);
        double myDouble = 2.6;
        myShortVariable = (short) myFLoat;
        System.out.println("double ke short : " + myShortVariable);
        
        //melakukan operasi terhadap variable bertipe data short
        short myShotVariable2 = 4;
        short totalShortVariable = (short) (myShortVariable + myShotVariable2);
        totalShortVariable = myShortVariable++;
    }
    
}
