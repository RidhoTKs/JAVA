
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class CointTestDriver {
    public static void main(String[] args) {
        //create the hashset
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        
        //create coin object
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);
        
        //add the coin object to hashset
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);
        
        //search the elemet from hashset
        System.out.println(bagOfCoins.contains(coin5));
        
        //check coin
        findCoin(bagOfCoins,coin10);
        findCoin(bagOfCoins, coin100);
        
        //display coin
        displayBagContents(bagOfCoins);
        
        bagOfCoins.remove(coin5);
        
        //display coin after remove
        displayBagContents(bagOfCoins);
        
    }
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if (bagOfCoins.contains(coin)) {
            System.out.println("there is a coin " 
                    + coin.getDenomination() + " in the bag");
        } else {
            System.out.println("the is no coin " 
                    + coin.getDenomination() + " in the bag" );
        }    
    }
    
    static void displayBagContents(HashSet<Coin> bagOfCoins){
        for(Coin coin: bagOfCoins){
            System.out.println(coin.getDenomination());
        }
}
}
