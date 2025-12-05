package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class που εχει
 *  - private πεδια
 *  - default constructor
 *  - getters & setters με συμβασεις.
 */
public class Student {
    private static int studentsCount = 0; //to static πεδιο ανηκει στην κλαση.

    //static block
    static {
        studentsCount = 0;
    }

    private int id;
    private String firstname;
    private String lastname;

  //  default constructor
    public Student() {
        studentsCount++;
    }

    //overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
        //id = 0; απο static καλουμε μονο static, οχι  instance.

    }
}




