package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * αναζητα ενα στοιχειο σε ενα πινακα.
 */
public class ArraySearchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12, 23, 31, 40, 50, 61, 61, 73, 87, 98, 140};
        int [] arr2 = null;
        int value = 0;
        int position = 0;

        System.out.println("Please enter a value to search for :");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        }else {
            System.out.println("Value: " + value + " found at position: " + (position+ 1));
        }
    }

    /**
     * επιστρεφει τη θεση του 1ου στοιχειου του πινακα που
     * ισουται με την τιμη αναζητησης(value). Αν δεν υπαρχει
     * το στοιχειο επιστρεφει -1.
     * @param arr o input πινακας.
     * @param value η τιμη αναζητης
     * @return το position του πινακα που βρεθηκε
     * το στοιχειο, αλλιως -1
     */
    public static int getPosition (int[]arr, int value) {

        if (arr == null) return -1;
        int positionToReturn = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;



    }

    public static int getPosition2 (int[]arr, int value) {

        if (arr == null) return -1;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
            }
        return -1;


        }









}
