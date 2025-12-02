package gr.aueb.cf.cf9.ch6;

/**
 * ελεγχει αν ενας πινακας ακεραιων
 * ειναι συμμετρικος η οχι. Συμμετρικος
 * ειναι ενας πινακας αν διαβαζεται το ιδιο
 * απο την αρχη  και το τελος.
 * Για παραδειγμα,
 * [1, 2, 3, 3, 2, 1] η [ 1, 2, 3, 2, 1]
 */
public class ArraySymmetricApp {
    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        // boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
        // return isSymmetric;
        return true;
    }

}
