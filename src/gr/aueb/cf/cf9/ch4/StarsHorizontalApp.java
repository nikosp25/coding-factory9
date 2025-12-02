package gr.aueb.cf.cf9.ch4;

/**
 * prints 10 horizontal stars with a For loop
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {
        char star = '*';
        final int MAX = 10;

        // 1️⃣ Horizontal Stars
        System.out.println("Horizontal Stars:");
        for (int i = 1; i <= MAX; i++) {
            System.out.print(star);
        }
        System.out.println("\n"); // Move to next line

        // 2️⃣ Vertical Stars
        System.out.println("Vertical Stars:");
        for (int i = 1; i <= MAX; i++) {
            System.out.println(star);
        }
        System.out.println(); // Blank line

        // 3️⃣ Grid 10 x 10
        System.out.println("10x10 Grid of Stars:");
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println(); // Blank line

        // 4️⃣ Increasing Triangle
        System.out.println("Increasing Triangle:");
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println(); // Blank line

        // 5️⃣ Decreasing Triangle
        System.out.println("Decreasing Triangle:");
        for (int i = MAX; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }




        }

    }

