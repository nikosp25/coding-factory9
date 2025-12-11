package gr.aueb.cf.cf9.ch15.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book("Book A", 1);
        Item cd = new CompactDisc("CD A", 2);
        Product product = new Product();


        deliver(book);
        deliver(cd);
       // deliver(product); //compile - time safety

    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Delivering Book");
        } else if (item instanceof CompactDisc) {
            System.out.println("delivering Cd");
        }else {
            throw new AssertionError("Unknown item type");
        }

    }
}
