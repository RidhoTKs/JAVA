
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class LettersQueue {
    
    public static void main(String[] args) {
        //initialize linkedlist, dont forget to import the linkedlist class
        LinkedList<String> lettersQ = new LinkedList<String>();
        
        //adding elements to the end of the queue
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        
        //display the content of the linkedlist
        System.out.println("Linked list: " + lettersQ);
        
        //display the size of the linked list
        System.out.println("Queue size: " + lettersQ.size());
        
        //while the queue is not empty emoove each element
        while(!lettersQ.isEmpty()){
            System.out.println(lettersQ.removeFirst());
        }
        System.out.println("Linked list : " + lettersQ);
    }
}
