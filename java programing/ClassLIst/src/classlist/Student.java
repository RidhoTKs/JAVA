/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classlist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author RTKS
 */
public class Student {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> studentNames = new ArrayList<String>();
        addStudents(studentNames);
        Collections.sort(studentNames);//sort the array by lexicography
        displayStudentNames(studentNames);
    }
    
    static void addStudents(ArrayList<String> studentsNames){
        studentsNames.add("Ridho");
        studentsNames.add("Ari");
        studentsNames.add("Sandi");
    }
    
    static void displayStudentNames(ArrayList<String> studentsNames){
        for (String name : studentsNames) {
            System.out.println("the name is " + name);
        }
    }
}
