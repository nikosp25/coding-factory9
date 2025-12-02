package gr.aueb.cf.cf9.ch2;


import java.util.Scanner;

/**
 * User inserts their weight in Kilograms and the program
 * calculates them in grams.
 *
 */
public class KiloToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int weightInKilos = 0;
        int weightInGrams = 0;
        final int KILOGRAMS_TO_GRAMS = 1000;

        System.out.println("Please enter your weight in Kilos : ");

        weightInKilos = scanner.nextInt();
        weightInGrams = weightInKilos * KILOGRAMS_TO_GRAMS;

        System.out.printf("Your weight in kilograms is :  %,d, your weight in Grams is : %,d" , weightInKilos , weightInGrams);
    }
}
