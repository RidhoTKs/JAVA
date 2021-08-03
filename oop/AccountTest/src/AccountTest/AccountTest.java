/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountTest;

/**
 *
 * @author RTKS
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.name = "Ridho Tri Kurniasandi";
        checkingAccount.balance = 2;
        System.out.println(checkingAccount.name + " " + checkingAccount.balance);
    }
    
}
