/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytevariable;

/**
 *
 * @author RTKS
 */
public class ByteVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte myByteVariable = 2;
        myByteVariable = 5; // nilai dari variable bisa di rubah 
        myByteVariable = 127; // nilai maksimum dari type data byte
        myByteVariable = -128; // nilai minimum dari type data byte
        // type data byte dapat disi dengan nilai integer dari -128 sampai 1277
        
        short shortVariable = 128;
        //myByteVariable = shortVariable; // tidak bisa memasukan nilai dari type data short meskipun masih dalam jangkauan byte
        myByteVariable =  (byte) shortVariable; // dengann meng-casting short ke byte baru bisa ditambahkan ke  variable byte
        System.out.println(myByteVariable); // jika memberikan nilai diluar dari jangkauannya byte akan mengoprasikannya secara biner
        // karena short merupakan type data paling kecil untuk integer literal
        // maka ketika kita mencoba menampung nilai dari variable selain byte 
        // harus dilakukan casting
        
        //OPERASI MATEMATIKA TIPE DATA BYTE
        byte totalByteVariable;
        byte myByteVariable2 = 5;
        //totalByteVariable = myByteVariable + myByteVariable2;
        // meskipun kedua variable yang di-operasikan merupakan type data byte
        // namun hasil dari operasi tersebut adalah integer literal
        // dimana sistem membaca nilai tersebut seabagai type data int
        // sehingga hasil dari operasi tersebut harus di-casting ke byte bukan variable totalByteVariable yang di-casting
        totalByteVariable = (byte) (myByteVariable + myByteVariable2);
        System.out.println("totalByteVaribale : " + totalByteVariable);
        myByteVariable++; //nilai myByteVariable masih 127
        System.out.println("myByteVariable setelah di post decrement : " + myByteVariable); //nilai dari myByteVariable sudah menjadi 128 karena byte dikonveresi menjadi minus 128
        ++myByteVariable; //nilai myByteVariable disini -127
        System.out.println("myByteVariable setelah di pre decrement : " + myByteVariable);
        totalByteVariable = myByteVariable++;
        totalByteVariable = (byte) (myByteVariable + shortVariable);
        boolean byteBoolean = myByteVariable == 127; // bisa dibandingkan dengan sesama integer literal atau angka 
        System.out.println(byteBoolean);
    }
    
}
