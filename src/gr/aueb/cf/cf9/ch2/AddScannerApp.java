package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * diavazei duo akeraious apo to stdin (keyboard)
 * kai ypologizei to apotelesma.
 */

public class AddScannerApp {

    public static void main(String[] args) {

        //Dhlwsh kai arxikopoihsh metablhtwn
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Entoles
        System.out.println("Parakalw eisagete duo akeraious :");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        //ektupwsh apotelesmatwn
        System.out.printf("To athroisma twn %d kai %d einai iso me %d%n", num1, num2,sum);

    }
}
