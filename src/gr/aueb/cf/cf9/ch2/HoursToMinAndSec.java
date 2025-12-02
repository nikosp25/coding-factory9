package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * calculates hours to minutes and seconds for a given number of hours.
 */
public class HoursToMinAndSec {

    public static void main(String[] args) {
        // Δήλωσει και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;

        // Εντολές
        System.out.println("Please insert the number of hours:");
        hours = scanner.nextInt();
        minutes = hours * HOURS_TO_MINUTES;
        seconds = hours * HOURS_TO_SECONDS;


        System.out.printf(Locale.US, "%,d hours equal to %,d minutes and %,d seconds.%n", hours, minutes,seconds);
        System.out.printf(Locale.forLanguageTag("el"), "%,d hours equal to %,d minutes and %,d seconds.", hours, minutes,seconds);

    }
}
