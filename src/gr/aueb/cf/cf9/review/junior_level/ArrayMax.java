package gr.aueb.cf.cf9.review.junior_level;

import java.util.Arrays;

/**
 * Οι μεταβλητες (α και μ) απο το βιντεο δεν ειναι καλα ονοματα (εγω τα αλλαξα σε arr και max)
 * ο κωδικας θα μπορουσε να ειναι μεθοδος
 * δεν εχει documentation
 * δεν εχει δομη
 * δεν εχει SoC
 * δεν υπαρχει ελεγχος για κενο array.
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);


    }




}
