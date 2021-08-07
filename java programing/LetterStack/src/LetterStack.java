
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
public class LetterStack {
    public static void main(String[] args) {
        //initilize linked list as stack
        LinkedList<String> letterS = new LinkedList<String>();
        letterS.push("A"); //push method is one of method from stack to add element
        letterS.push("B");
        letterS.push("C");
        letterS.push("D");
        
        //display the cintents of the linked list
        System.out.println("Linked list : " + letterS);
        
        //diplay the size of the linked list
        System.out.println("Linked list size : " + letterS.size());
        
        //while the stack is empty remove each element 
        while(!letterS.isEmpty()){
            System.out.println(letterS.pop()); // pop is method for remove last element in linked list
        }
        System.out.println("Linked list : " + letterS);
    }
}
