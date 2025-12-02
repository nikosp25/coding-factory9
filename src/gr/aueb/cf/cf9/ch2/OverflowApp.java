package gr.aueb.cf.cf9.ch2;
/**
 * prosthetei 2 akeraious kai to apotelesma dhmhourgei yperxeilish (overflow)
 */
public class OverflowApp {
    public static void main(String[] args) {

        //djlwsh kai arxikopoihsh metavlhtwn
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        //entoles
        result = num1 +num2;

        //ektupwsh apotelesmatos
        System.out.printf("The result is: " + result);

    }
}
