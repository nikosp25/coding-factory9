package gr.aueb.cf.cf9.ch9;

/**
 * Asks the user to name the file they want to copy from and then using
 * java Nio. copies it to a new folder with a random name.
 */

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.UUID;
import java.io.IOException;

public class JavaNioExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fileName;

        System.out.println("Please enter your file name :");
        fileName = scanner.nextLine();

        //το αρχικο αρχειο
        Path source = Paths.get("C:/tmp/" + fileName);

        // Check αν υπαρχει αυτο το path.
        if (!Files.exists(source)) {
            System.out.println("The file does not exist " + source);
            return; //σταματαει εδω το process.
        }

        // το ονομα για το καινουργιο αρχειο
        String newFileName = UUID.randomUUID().toString().replace(":","_")
                + "_" + fileName;

        //Το path του καινουργιου αρχειου που θα δημιουργησουμε
        Path newFileLocation = Paths.get("C:/tmp/" + newFileName);

        try {
            Files.copy(source,newFileLocation);
            System.out.println("Done. The new file is " + newFileLocation);
        } catch (IOException e ) {
            System.err.println("Error: " + e.getMessage());
        }

        //εμφανιση MetaData
        System.out.println("Original file absolute path : " + source.toAbsolutePath());
        System.out.println("Copied file absolute path :" + newFileLocation.toAbsolutePath());



    }
}
