package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfO = cf.indexOf("o"); // 1
        System.out.println(positionOfO);

        int positionOfNextO = cf.indexOf("o", 2); // 11 το κενο μεταξυ των λεξεων μετριεται κανονικα.
        System.out.println(positionOfNextO);

        int positionOfLastO = cf.lastIndexOf("o"); // 11
        System.out.println(positionOfLastO);
    }

    //Μεθοδος που να επιστρεφη την καταληξη του ονοματος ενος αρχειου.
    //coding.txt

    public static String getExtension(String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1 );

    }
}
