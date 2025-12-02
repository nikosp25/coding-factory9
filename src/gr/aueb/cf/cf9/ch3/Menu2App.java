package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * εμφανιζει ενα μενου επιλογων μεχρι ο χρηστης να
 * επιλεξει 'exit' (τον αριθμο 3)
 */
public class Menu2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("παρακαλω επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. εισαγωγη αιτησης");
            System.out.println("2. διαγραφη αιτησης");
            System.out.println("3. Eξοδος");
            choice = scanner.nextInt();
            if (choice == 3){
                break;
            }

        }
        System.out.println("Thanks for using the program.\n");
    }
}
