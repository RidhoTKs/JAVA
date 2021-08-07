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
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //testing cellCollection class
        //instance cell collection 
        CellCollection cells = new CellCollection(5);
        
        //testing the method that instance from cell collection
        cells.add(new Cell());  //object ini akan disimpan pada index 0
        cells.add(new Cell());  //object  ini akan disimpan pada index 1
        //instance two object for storing into cell array in cell collection
        // the parameter was  use for instance object for add to the array
        
        // print  the addres memory from the object
        System.out.println(cells.get(0));
        System.out.println(cells.get(1));
        //System.out.println(cells.get(2));
        
        // from method get we can initial the value to the object
        cells.get(0).setData("first data");
        cells.get(1).setData("second data");
//        cells.get(2).setData("third  object"); //tidak bisa mengisikan value karena objectnya belum di buat
        
        System.out.println(cells.get(0).getData());
        System.out.println(cells.get(1).getData());
//        System.out.println(cells.get(2));

    }
    
}
