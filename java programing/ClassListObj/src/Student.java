/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int mark;

    //define the constructor that initilize the field
    public Student(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the mark
     */
    public int getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Student Details: " + firstName
                + " " + lastName + " " + mark;
    }//

    public int compareTo(Student stud2) {
        if (lastName.compareTo(stud2.getLastName()) < 0) {
            return -1;
        }
        if (lastName.compareTo(stud2.getLastName()) == 0) {
            return 0;
        }
        return 1;
    }//
}
