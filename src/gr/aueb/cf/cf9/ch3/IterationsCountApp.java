package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations
 * When the user inserts -1 the program will stop
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        //εισοδος δεδομενων
        System.out.println("Please enter a number:");
        num = scanner.nextInt();

        //επεξεργασια και while-do μεχρι να βρει -1
        while (num != -1){
            iterations++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();

            //Εκτυπωση αποτελεσματων
            System.out.printf("The count of iterations is: %d",iterations);
        }

    }



}
