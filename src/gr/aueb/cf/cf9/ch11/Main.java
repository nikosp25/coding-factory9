package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {

        Product milk = new Product(1L,"Milk A","Light Milk",1.5,2,true);
        Product juice = new Product(2L,"Juice A", "Orange Juice", 2.5, 1, false);

        Customer customer = new Customer(1L,"Nick","Dlas","568734","2104747444","Αττική",
                "Aθηνών","Αμαρουσίου","Μαρούσι","baker street","23","19867","blabla@yahoo.com");









        User user = new User();
        User andreas = new User(1L,"Andreas", "Papadopoulos", "andrew", "12345", true);

        System.out.println(andreas.getUsername());
        System.out.println(andreas.isActive());

        //δηλωσεις με τον default constructor
        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        //δηλωσεις με overloaded constructor
        Student student2 = new Student(4,"Makis","Kapetis");
        student2.setFirstname("Xrisostomos");
        Student student3 = new Student(5, "Lampros", "Ioannou");
//
//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1); //setter
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");



        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");

        // getters
        System.out.println(alice.getId()); //getter
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname : %s, Lastname :%s\n",
                alice.getId(),alice.getFirstname(), alice.getLastname());

        System.out.println(Student.getStudentsCount()); // καλειτε με το ονομα της κλασης οχι του object.
    }



}
