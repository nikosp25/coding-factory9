package gr.aueb.cf.cf9.ch7;

/**
 * traverses a string one-by-one character by character.
 * oxi με enhanced for, αλλα με την κλασσικη for.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }

        System.out.println();//για να αφησει κενο μια γραμμη μεταξυ των 2 print.

        //prints the reversed string
        for (int i = str.length() -1; i > 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }


    }
}
