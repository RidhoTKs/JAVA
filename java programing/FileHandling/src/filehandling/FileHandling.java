/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author RTKS
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }

    static void displayEmployees(ArrayList<String> employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void writeFile(ArrayList<String> employees) {
        Path path = Paths.get("D:/dgtls/employee.txt");
        try {
            BufferedWriter bw = Files.newBufferedWriter(path,
                    Charset.forName("ISO-8859-1"),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            for (String employee : employees) {
                bw.write(employee);
                bw.newLine();
            }//endfor
            bw.close();
        }//
        catch (IOException ioe) {
            System.out.println("Error reading file.");
            System.exit(0);
        }//
    }//

    static void readFile(ArrayList<String> employees) {
        String line = "";
        Path path = Paths.get("D:/dgtls/employee.txt");
        try {
            BufferedReader fileInput
                    = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }//endwhile
            fileInput.close();
        }//
        catch (IOException ioe) {
            System.out.println("Error reading file.");
            System.exit(0);
        }//

    }

}
