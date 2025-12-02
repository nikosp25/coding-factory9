package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

/**
 * BigInteger Class Demo.
 */

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger( "8398393080");
        BigInteger bigNum2 = new BigInteger("4937403788");
        BigInteger bigResult;

        bigResult =  bigNum1.add(bigNum2);

        System.out.printf("The result is: %,d%n", bigResult);

    }
}
