package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Τhis program takes an int from the user and the calculates if its an even number or not.
 *
 * @author Nikos P.
 */
public class evenApp {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Εισοδος δεδομενων, validation και data binding.
        System.out.println("Please enter a number :");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number :");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //επιχειρησιακη λογικη - παραστασεις
        result = isEven(num);

        //εκτυπωση αποτελεσματος.
        System.out.println("the number is even " + result);

    }

    /**
     * checks if a number is even.
     * @param num the number to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
