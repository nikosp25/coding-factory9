package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * the user inputs an int number that represents a temperature.
 * The app calculates if the temperature is < 0 then decides if
 * the result is true or false.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Εισαγωγη δεδομενων
        System.out.println("Please enter a temperature:");
        temperature = scanner.nextInt();

        //Επεξεργασια των δεδομενων
        isTempBelowZero = temperature < 0;

        //εκτυπωση των αποτελεσματων
        System.out.printf("Temperature is lower than 0 : %b",isTempBelowZero);


    }
}
