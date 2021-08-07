
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RTKS
 */
public class StudentDriver {

    public static void main(String[] args) {
        ArrayList<Student> studentNames = new ArrayList();
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    static void displayStudents(ArrayList<Student> studentNames) {
        for (Student student : studentNames) {
            System.out.println(student);
        }
        //endfor
    }//

    static void addStudents(ArrayList<Student> studentsNames) {
        //Add the following student objects
        studentsNames.add(new Student("Mark", "Mywords", 95));
        studentsNames.add(new Student("Andrew", "Apic", 45));
        studentsNames.add(new Student("Beth", "Tween", 78));
    }

}
