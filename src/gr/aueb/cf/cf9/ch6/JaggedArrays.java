package gr.aueb.cf.cf9.ch6;

/**
 * πινακες με διαφορετικο μεγεθος σε καθε γραμμη.
 */
public class JaggedArrays {

    public static void main(String[] args) {
        int[][] arr = new int[3][]; //φτιαχνουμε ενα πινακα που εχει 3 γραμμες.

        arr[0] = new int[5];// σε καθε γραμμη βαζουμε διαφορετικο αριθμο στηλων. Εδω π.χ. η 1η γραμμη θα εχει 5 στηλες.
        arr[1] = new int[3];// εδω η 2η γραμμη θα εχει 3 στηλες.
        arr[2] = new int[10];// εδω η 3 γραμμη θα εχει 10 στηλες.

        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el+ " ");
            }
            System.out.println();
        }

        //κλασσικη for
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
