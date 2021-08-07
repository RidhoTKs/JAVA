
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class HashMapExample {
    public static void main(String[] args) {
        //initialize hashmap    
        HashMap<String, String> fruitBowl = new HashMap<String,String>();
        
        //invoke add element method
        addElements(fruitBowl);
        
        //invoke display element method
        displayElements(fruitBowl);
        
        //invoke find element method
        findElement(fruitBowl, "pear");
    }
    
    //define mrthod that will give us the value if a key is exist
    static void findElement(HashMap<String, String> fruitBowl, String fruit){
        if (fruitBowl.containsKey(fruit)) {
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        } else{
            System.out.println("There is no " + fruit + " in the bowl");
        }
    }
    
    //define method for display hashmap value
    static void displayElements(HashMap<String, String> fruitBowl){
        System.out.println(fruitBowl); //this will be print the key and the value
        
        //to format the output we can use for each
        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet()) {
            System.out.println("fruit: " + fruit.getKey()
                            + " - color: " + fruit.getValue());
        }
        
//        System.out.println(fruitBowl.get("Banana")); //key is case sensitive
    }
    
    //define method add element for adding element to hashmap
    static void addElements(HashMap<String, String> fruitsBowl){
        fruitsBowl.put("apple", "green");
        fruitsBowl.put("chery", "red");
        fruitsBowl.put("orange", "orange");
        fruitsBowl.put("banana", "yellow");
        fruitsBowl.put("apple", "red");//this will be override the old value of apple
    }
}
