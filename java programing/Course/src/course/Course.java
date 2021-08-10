/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author RTKS
 */
public class Course implements java.io.Serializable {

    /**
     * @param args the command line arguments
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private String type;
    private String courseCode;
    private int passingScore;

    public Course(String name, String type, String courseCode,
            int passingScore) {
        this.name = name;
        this.type = type;
        this.courseCode = courseCode;
        this.passingScore = passingScore;
    }//end constructor

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * @return the passingScore
     */
    public int getPassingScore() {
        return passingScore;
    }

    /**
     * @param passingScore the passingScore to set
     */
    public void setPassingScore(int passingScore) {
        this.passingScore = passingScore;
    }

    public String toString() {
        return "Name : " + this.name
                + "\nType : " + this.type
                + "\nCode : " + this.courseCode
                + "\nPass Score: " + this.passingScore;
    }//

}
