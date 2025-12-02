package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Takes an amount (int) from user and converts it to
 * USD based on the given exchange rate.For example
 * If the user input 100 euro and the exchange rate is 1 euro = 99 USA cents,
 * the USA cents would equal to 9900 and that's 99 USA dollars and 0 USA cents
 *
 */

public class EuroToUsdConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       final int EURO_TO_USD_CONVERSION_RATE = 99;
       int inputEuros = 0;
       int totalUsaCents = 0;
       int usaDollars = 0;
       int usaCents = 0;




        //take user's amount in euro
        System.out.println("Please enter the amount of euro you would like to convert :");
        inputEuros = scanner.nextInt();

        //convert currency
       totalUsaCents = inputEuros * EURO_TO_USD_CONVERSION_RATE;
       usaDollars = totalUsaCents / 100 ;
       usaCents = totalUsaCents % 100 ;

       // Show user the currency conversion
        System.out.printf(" %,d Euro = %,d US Dollars and %,d US cents%n",inputEuros,usaDollars,usaCents);


    }


}
