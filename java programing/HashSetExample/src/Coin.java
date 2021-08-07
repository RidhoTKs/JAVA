/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class Coin {
    //define field
    private int denomination;
    
    //define constructor that set the denomination value
    public Coin(int denomination){
        this.denomination = denomination;
    }
    
    // define get method to pick the value of field
    public int getDenomination(){
        return denomination;
    }
}
