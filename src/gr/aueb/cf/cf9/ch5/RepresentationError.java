package gr.aueb.cf.cf9.ch5;

/**
 * Representation error demo.
 * Θα βγει το αποτελεσμα not equal, διοτι
 * λογο του πως δουλευει το δυαδικο συστημα
 * δεν μπορει να αποθηκευσει σωστα τους δεκαδικους αριθμους
 * οποτε καλο ειναι να μη κανουμε συγκρισεις μεταξυ τους τυπου (if (x == y))
 * γιατι ειναι πολυ πιθανο να μην βγει σωστο.
 */
public class RepresentationError {

    public static void main(String[] args) {

        double actual = 0.0;
        double expected = 1.0;

        for (int i =1; i <=10; i++) {
            actual = actual + 0.1; //actual += 0.1;
        }
        System.out.println("Actual: " + actual);

        if (actual == expected) {
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }


    }
}
