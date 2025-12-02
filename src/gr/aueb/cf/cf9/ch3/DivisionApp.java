package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * o xρηστης εισαγει δυο τιμεσ, αριθμητη και παρανομαστη
 * και το προγραμμα υπλογιζει το πηλικο, επαναληπτικα.
 *
 * Αν ο αριθμητης ειναι 0 τοτε το προγραμμα διακοπτεται.
 * Αν ο παρανομαστης ειναι 0, τοτε η διαδικασια επαναλαμβανεται
 */
public class DivisionApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator:");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0. Quiting....");
                break;
            }

            System.out.println("Please enter a denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Cannot be divided by zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result : " + result);
        }



    }
}
