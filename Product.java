package models;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private int reorderLevel;

    public Product(int id, String name, int quantity, double price, int reorderLevel) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.reorderLevel = reorderLevel;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public int getReorderLevel() { return reorderLevel; }

    public void updateStock(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Qty: " + quantity + " | Price: ₹" + price;
    }
}
