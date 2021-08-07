/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RTKS
 */
public class SortExample {

    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};

        displayValues(numbers);
        selectionSort(numbers);
        displayValues(numbers);

    }

    static void selectionSort(int[] numbers) {
        int indexMin = 0; //the index of the smallest number
        for (int i = 0; i < numbers.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {//if we find a smaller int,
                    indexMin = j; //set it as the min
                }//endif
            }//endfor
//we have the index of the smallest int and can swap the values
            int temp = numbers[i]; //use temp to store the value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
            System.out.println("index ke " + i + " bernilai " + numbers[i]
                    + " dan nilai awal pada index ke " + i
                    + " yaitu " + temp + " sekarang berada pada index " + indexMin);
        }//endfor
    }//end method

    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
//if the numbers are not in order
                if (numbers[j] > numbers[j + 1]) {
//swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }//endif
            }//endfor
        }//endfor
    }//

    static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
