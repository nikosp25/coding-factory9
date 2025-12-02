package gr.aueb.cf.cf9.ch5;

/**
 * Demo of floating point expressions.
 */
public class FloatingExpressionsApp {

    public static void main(String[] args) {

        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = 0.0;

        result = intNum + floatNum + doubleNum; //Ολα μετατρεπονται στον μεγαλυτερο τυπο - auto-widening (εδω ειναι το double 64 bit)

        System.out.println("Result is: " + result);
        System.out.printf("Result is: %.2f\n",result);


    }
}
