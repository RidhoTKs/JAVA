/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterntest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RTKS
 */
public class PatternTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern p = Pattern.compile("[A-F]{5,}.*");
        String str = "ABCDEF";
        System.out.println(isMatch(str, p));
    }

    private static boolean isMatch(String str, Pattern p) {
        Matcher match = p.matcher(str);
        return match.matches();
    }//

}
