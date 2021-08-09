/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefileexample;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RTKS
 */
public class WriteFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        writeFile(input);
        
    }
    
    public static void writeFile(Scanner input){
        //define the path and the file name which one to write
        Path path = Paths.get("D:/dgtls/write file name.txt");
        try {
            //define bufferwriter object 
            BufferedWriter bw = Files.newBufferedWriter(path, 
                    Charset.forName("ISO-8859-1"), 
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Type the name what you want to input into the file");
                bw.write(input.next()); //input what user type to file
                bw.newLine(); // make the next input in the new line
            }
            
            bw.close(); //close the all proses for wrting file
        } catch(FileNotFoundException e){
            System.out.println(e);
        } catch(EOFException eof){
            System.out.println(eof);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
