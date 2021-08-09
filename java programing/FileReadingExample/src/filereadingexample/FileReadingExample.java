/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingexample;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author RTKS
 */
public class FileReadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> employees = new ArrayList<String>();
        readFile(employees);
        displayEmployees(employees);

    }

    //define method for  display the text in the file
    static void displayEmployees(ArrayList<String> employees) {
        //use for each to display array list
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    //define method for read the file
    static void readFile(ArrayList<String> employees) {
        String line = ""; // this variable use for store each line from text
        BufferedReader fileInput; // file input is a object will be use for read the file

        // read file process must be within in try exception
        try {
            // this is the proces read file with io package
            // read file text with bufferreader class with file reader and new file class as parameter
            fileInput = new BufferedReader(
                    new FileReader(
                            new File("D:/dgtls/employee.txt")));
            line = fileInput.readLine();

            // use while to extract text from file
            while (line != null) {
                employees.add(line); // add line to array list
                line = fileInput.readLine();
            }
            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fiel not found");
        } catch (EOFException eofe) {
            System.out.println("No more lines to read");
        } catch (IOException e) {
        }

    }

}
