package input01;

import javax.swing.JOptionPane;

public class Input01 {

    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        JOptionPane.showInputDialog("type something");//bisa dipanggil tanpa ditampung nilainya
        String input = JOptionPane.showInputDialog("ketikan masukan");//nilai yang di inputkan dapat ditampung ke sebuah variabel
        //joption pane mengembalikan nilai string dari inputan
        System.out.println(input);
        String input2 = (String) JOptionPane.showInputDialog(null,
                "is this is a quation",
                "dialog title",
                2,
                null,
                null,
                "type something here");//method ini mengembalikan nilai object oleh karena itu perlu di casting ke string

        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"}; // dengan array kita bisa menentukan inputan yang diperbolehkan
        String input3 = (String) JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
//        int inputAngka = Integer.parseInt(input);
//        System.out.println(inputAngka);
        
        JOptionPane.showMessageDialog(null, input, "my messaga", 0);//menampilkan inputan dalam box gui
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
    }
}
