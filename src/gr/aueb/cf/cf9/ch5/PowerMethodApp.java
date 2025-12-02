package gr.aueb.cf.cf9.ch5;

/**
 * Υπολογιζει την δυναμη α^β με μεθοδο.
 */

import java.util.Scanner;

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter a base and a power :");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = basePower(base,power);

        System.out.printf("The power of %d ^ %d is %d\n",base, power, result);

    }

    public static int basePower (int base, int power) {

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return  result;



    }
}
