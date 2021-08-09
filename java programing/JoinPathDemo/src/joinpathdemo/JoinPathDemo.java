/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joinpathdemo;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author RTKS
 */
public class JoinPathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path basicPath = Paths.get("C:/JavaProgramming");
        Path newPath = Paths.get("IO/Logs");
//display the paths to the console.
        System.out.println(basicPath.toString());
        System.out.println(newPath.toString());
//Add a path not found in it(adds newPath to basicPath).
        Path basicPath2 = basicPath.resolve(newPath.toString());
//Returns the absolute portion(basicPath).
        Path newPath2 = newPath.resolve(basicPath.toString());
//display the resulting paths to the console.
        System.out.println(basicPath2.toString());
        System.out.println(newPath2.toString());
    }

}
