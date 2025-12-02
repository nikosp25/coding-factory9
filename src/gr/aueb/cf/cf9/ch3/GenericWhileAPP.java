package gr.aueb.cf.cf9.ch3;

/**
 * Δινουμε αρχικη τιμη, τελικη τιμη και βημα αυξησης
 * και υπολογιζει το πληθος των επαναληψεων
 */
public class GenericWhileAPP {

    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;

        while (i <= endVal) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("επαναληψεις/loops/iterations : " + (i  - 1)) ;
        System.out.println(i);




    }
}
