/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author RTKS
 */
public class CellCollection {
    //object reference as a field
    Cell[] cell;
    
    //define field
    int index= 0;
    
    //define constructur
    public CellCollection(int size){
        cell = new Cell[size]; //inisilisation the size of object refrence
    }
    
//    define method to add the element to object array
    public void add(Cell c){
        cell[index] = c;
        index++;
    }
    
    //define method to get element from object array
    public Cell get(int i){
        return cell[i];
    }
}