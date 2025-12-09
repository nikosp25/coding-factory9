package gr.aueb.cf.cf9.ch13;

public class HelloUtil {

    /**
     * utility classes are not - instantiable
     * they provide only public static methods.
     */


    private HelloUtil() { //παντα private ο constructor σε utility classes.
        /**
         * No instances of this class should be avalaible
         */
    }

    public static void sayHello() {
        System.out.println("Hello Coding!!");
    }
}
