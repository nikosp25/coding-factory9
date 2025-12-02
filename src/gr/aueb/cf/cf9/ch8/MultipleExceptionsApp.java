package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("test.txt");
        char ch = ' ';

        try (Scanner scanner = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("char read error");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

// Οταν ενα exception ειναι υποκλασση καποιου αλλου, τοτε βαζουμε πρωτα το ειδικοτερο και μετα το γενικοτερο, πχ στο
// πανω παραδειγμα, η κλασση  exception περιεχει και το ΙΟ  και το filenotfound, και η ΙΟ περιεχει το filenotfound
//οποτε αν θελουμε να δωσουμε διαφορετικα μηνυματα αναλογα το exception τα βαζομε με αυτη τη σειρα.
