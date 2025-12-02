package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * εμφανιζουμε μενου στον χρηστη.
 * Ο χρηστης δινει το choice.
 * Aναλογσ με το choice να δωσουμε feedback
 * στον χρηστη.
 */
public class SwitchApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do {
            System.out.println("Please choose one of the following\n");
            System.out.println("1.One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3.Team game");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game\n");
                    break;
                case 2:
                    System.out.println("Start Two - player game\n");
                    break;
                case 3:
                    System.out.println("Start Team game\n");
                    break;
                case 4:
                    System.out.println("Exit game\n");
                    break;
                default:
                    System.out.println("Error in choice\n");
                    break;
            }



        } while ( choice != EXIT);

        System.out.println("Goodbye");
    }
}
