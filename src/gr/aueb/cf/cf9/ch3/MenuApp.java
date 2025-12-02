package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * εμφανιζει ενα μενου μεχρι ο χρηστης να επιλεξει ''exit''
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please choose on of the following:");
            System.out.println("1. Εισαγωγη αιτησης");
            System.out.println("2. Διαγραφη Αιτησης");
            System.out.println("3. Eξοδος");
            choice = scanner.nextInt();
        }  while (choice != 3);

        System.out.println("Thanks for using the program");

    }
}
