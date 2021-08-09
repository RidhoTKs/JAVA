/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingexception;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author RTKS
 */
public class FileHandlingException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> employeees = new ArrayList<>();
        readFileEmployees(employeees);
        displayEmployees(employeees);
    }
    
    //define method for display text
    static void displayEmployees(ArrayList<String> employees){
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
    
    //define method for read the text
    static void readFileEmployees(ArrayList<String> employees){
        //make a variable to store the string in file
        String line = ""; //this variable will store a text whic read line by line
        
        //define the path that will be store the absolute path
        Path path = Paths.get("D:/dgtls/employee.txt");
        
        //all proces for manipulate file must be within try catch
        try {
            //use bufferedreader from nio.file package that more simply from the io package
            BufferedReader fileInput = 
                    Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
            line = fileInput.readLine();
            while(line != null){
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch (EOFException eof) {
            System.out.println(eof);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    
}
