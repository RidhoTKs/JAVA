/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makegamedate;

import javax.swing.JOptionPane;

/**
 *
 * @author RTKS
 */
public class MakeGameDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int yes = JOptionPane.YES_NO_OPTION;
        int confirm = JOptionPane.showConfirmDialog(null, "are you sure to continue", "this is message", yes);
        String name = JOptionPane.showInputDialog(null, "What Is Your Name :", "Question 1", 3);
        int timeDate = Integer.parseInt(JOptionPane.showInputDialog(null, "Best date action do you like", "Question 2", 3));
        String food = JOptionPane.showInputDialog(null, "What food do you like", "Question 3", 3);
        String animalName = JOptionPane.showInputDialog(null, "Name an animal", "Question 4", 3);
        String animalDesc = JOptionPane.showInputDialog(null, "What world would you use to describe a" + animalName, "Question 5", 3);
        String bodyPartName = JOptionPane.showInputDialog(null, "Name a body part", "Question 6", 3);
        String bodyPartDesc = JOptionPane.showInputDialog(null, "describe that " + bodyPartName, "Question 7", 3);
        String pastenseWord = JOptionPane.showInputDialog(null, "choose a word in pastense word", "Question 8", 3);
        double spenMoney = Double.parseDouble(JOptionPane.showInputDialog(null, "how much would you spend inn dinner time", "Question 8", 3));
        
    }
    
}
