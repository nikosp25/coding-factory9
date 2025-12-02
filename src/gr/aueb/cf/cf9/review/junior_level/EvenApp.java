package gr.aueb.cf.cf9.review.junior_level;

import java.util.Scanner;

public class EvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please enter a number :");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        }else {
            System.out.println("the number" + num + " is odd.");
        }
    }




}
