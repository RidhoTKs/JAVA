/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisontest;

/**
 *
 * @author RTKS
 */
public class PrisonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prisioner buba = new Prisioner();
        buba.name = "Buba";
        buba.height = 6.10;
        buba.yearSentenced = 4;
        Prisioner twitch = new Prisioner();
        twitch.name = new String("Buba");
        twitch.height = 6.10;
        twitch.yearSentenced = 4;
//        buba = twitch;
        twitch.name= buba.name;
        System.out.println("is this the same " + (buba.name == twitch.name));
    }
    
}
