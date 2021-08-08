/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexgroups;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RTKS
 */
public class RegexGroups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String date;
        Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");

        date = getDate(in, dateP);
        System.out.println("US style date - " + date);

        in.close();
    }

    static String getDate(Scanner in, Pattern dateP) {
        String date;
        Matcher dateM;
        do {
            System.out.print("Enter a Date (dd/mm/yyyy): ");
            date = in.nextLine();
            dateM = dateP.matcher(date);
            if (dateM.matches()) {
                String day = dateM.group(1);
                String month = dateM.group(2);
                String year = dateM.group(3);
                date = month + "/" + day + "/" + year;
                boolean validDate = validateDate(date);
                if (dateM.matches() && validDate) {
                    date = month + "/" + day + "/" + year;
                } else {
                    System.out.println("Incorrect date entered");
                }
            }//endif
        } while (!dateM.matches());
        return date;
    }

    static boolean validateDate(String newDate) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//Date must match the SimpleDate pattern exactly
        format.setLenient(false);
        String date = newDate;
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            System.out.println(date + " is not valid according to "
                    + ((SimpleDateFormat) format).toPattern() + " pattern.");
            return false;
        }//end try/catch
    }//

}
