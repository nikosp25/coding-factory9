package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature, and the boolean status of IsRaining
 * variable and calculates if it is snowing or not. If it is raining and
 * the temperature is below 0, it is snowing.
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please enter if its raining (true/false):");
        isRaining = scanner.nextBoolean();
        System.out.println("Please enter the temperature:");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature <0);

        System.out.printf("Is snowing : %b",isSnowing);
    }
}
