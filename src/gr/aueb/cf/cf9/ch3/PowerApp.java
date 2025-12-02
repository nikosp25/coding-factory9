package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates the power of a number, base^power.
 * base^power = base * base *base *.... *base
 * (power φορες)
 */
public class PowerApp {

    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        // Εισοδος δεδομενων και αντιστοιχιση σε μεταβλητες
        System.out.println("Please enter a base and a power :");
        base = scanner.nextInt();
        power = scanner.nextInt();

        //επεξεργασια δεδομενων - while -do

        while (i <= power){
            result *= base; //result = result * base
            i++;
        }

        //εκτυπωση αποτελεσματων
        System.out.printf("%,d ^ %d = %d%n",base,power,result);


    }
}
