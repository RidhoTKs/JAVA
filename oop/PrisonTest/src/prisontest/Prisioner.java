/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisontest;

/**
 *
 * @author RTKS
 */
public class Prisioner {

    public double height;
    public double yearSentenced;
    public String name;

    public Prisioner(String name, double height, double yearSentenced) {
        this.height = height;
        this.name = name;
        this.yearSentenced = yearSentenced;
    }//end constructor

    public void getTheBadThink() {
        System.out.println("they are thiev");
    }
}
