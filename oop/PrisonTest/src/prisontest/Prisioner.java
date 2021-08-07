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
    public double old;
    public Cell cell;

    public Prisioner(String name, double height, double yearSentenced) {
        this.height = height;
        this.name = name;
        this.yearSentenced = yearSentenced;
        this.cell = new Cell("this is your cell", true);
    }//end constructor
    
    public Prisioner(String name, double height, double yearSentenced, int old) {
        this.height = height;
        this.name = name;
        this.yearSentenced = yearSentenced;
        this.old = old;
        this.cell = new Cell("this is your cell", true);
    }//end constructor
     
    public void printField(){
        System.out.println(this.name + " " 
            + this.height + " "
            + this.old + " "
            + this.yearSentenced);
        System.out.println(cell.name);
    }
    private void getTheBadThink() {
        System.out.println("they are thiev");
    }
}
