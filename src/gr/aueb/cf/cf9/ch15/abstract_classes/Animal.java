package gr.aueb.cf.cf9.ch15.abstract_classes;

public abstract class Animal {
    private String name;
    private long id;

    Animal() {

    }

    public Animal(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void speak();

    public void eat() {
        System.out.println("Eating...");
    }
}
