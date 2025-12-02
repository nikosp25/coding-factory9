package gr.aueb.cf.cf9.ch1;

/**
 * Προσθετει 2 ακεραιους και εμφανιζει το αποτελεσμα στην κονσολα.
 */
public class AddApp {
    public static void main(String[] args) {
        // dhlwsh kai arxikopoihsh
        int num1 = 500_000;
        int num2 = 100_000;
        int result = 0;


        //entoles
         result = num1 + num2 ;

        // ektupwsh apotelesmatos
        System.out.println("the result is : " + result);
        System.out.println("to athrisma twn : " + num1 + " + " + num2 + " einai : " + result );
        System.out.printf("to athroisma twn : %d kai %,d einai : %,d", num1, num2, result);


    }

}