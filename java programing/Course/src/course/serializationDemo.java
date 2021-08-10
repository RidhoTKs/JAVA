/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author RTKS
 */
public class serializationDemo {

    public static void main(String[] args) {
        Course course = new Course("Java Programming", "Oracle",
                "JP", 60);

        Path path = Paths.get("C:/JavaProgramming/details.ser");
        serializeData(course, path);
        Course savedCourse = deSerializeData(path);
        if (course != null) {
            displayData(savedCourse);
        }
    }

    static void serializeData(Course course, Path path) {
        try (FileOutputStream fileOut = new FileOutputStream(path.toString());
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {//try writing to the file
            objOut.writeObject(course);
            System.out.println("Serialized data is saved in " + path.toString());
        }//end try
        catch (IOException e) {
            e.printStackTrace();
        }//end catch
    }//end method serializeData

    static Course deSerializeData(Path path) {
        try (FileInputStream fileIn = new FileInputStream(path.toString());
                ObjectInputStream objIn = new ObjectInputStream(fileIn)) {//try reading the file
            Course course = (Course) objIn.readObject();
            return course;
        }//end try
        catch (ClassNotFoundException e) {//catch any error where the class is not found
            System.out.println("Course class not found");
            return null;
        }//end catch
        catch (IOException i) {//catch any IO exception error that is thrown
            i.printStackTrace();
            return null;
        }//end method deSerializeData
    }

    public static void displayData(Course course) {
        System.out.println("Deserialized Course Details...");
        System.out.println("Name : " + course.getName());
        System.out.println("Type : " + course.getType());
        System.out.println("Code : " + course.getCourseCode());
        System.out.println("Pass Score: " + course.getPassingScore());
        System.out.println(course);
    }//end method displayData
}
