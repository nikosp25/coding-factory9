package gr.aueb.cf.cf9.ch7;

/**
 * Aντιγραφη Strings γινεται με
 * αντιγραφη δεικτων γιατι τα strings
 * ειναι immutable.
 */
public class StrCopyAndSubString {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = s1; // copy

        s2 = "Factory";
        System.out.println(s1);
        System.out.println(s2);

        //substring
        String s3 = s1.substring(1); //oding
        String s4 = s1.substring(1,3);  //od
    }

        //traverse char by char with substring
        public static void  traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i,i+1) + " ");
        }


    }




}
