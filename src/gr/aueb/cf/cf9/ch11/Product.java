package gr.aueb.cf.cf9.ch11;

public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private boolean stock;

    //default constructor
    public Product() {

    }

    //Overloaded constructor
    public Product(long id, String name, String description, double price, int quantity, boolean stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isStock() {
        return stock;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }


}
