package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println(Integer.parseInt(input.next()));
        System.out.println(Integer.parseInt(input.next()));
        System.out.println(Integer.parseInt(input.next()));
        System.out.println(input.nextInt());
        
        
        //Remember to close the Scanner
        input.close();
    }
}
