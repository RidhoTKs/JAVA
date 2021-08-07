/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionwithgeneric;

/**
 *
 * @author RTKS
 * @param <T>
 */
public class CellsGenericCollection<T> {
    //define generic array object refrence
    T[] cells;
    
    //define field 
    int index;
    
    //define constructor that initilize the size of array
    public CellsGenericCollection(int size){
        cells = (T[]) new Object[size]; //not safe solution
    }
    
    //define method to add array object
    public void add(T c){
        cells[index] = c;
        index++;
    }
    
    //define method to get array element
    public T get(int i){
        return cells[i];
    }
}