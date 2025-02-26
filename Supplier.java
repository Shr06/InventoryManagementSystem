package models;

public class Supplier {
    private String name;
    private String contact;
    private String productSupplied;

    public Supplier(String name, String contact, String productSupplied) {
        this.name = name;
        this.contact = contact;
        this.productSupplied = productSupplied;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getProductSupplied() { return productSupplied; }

    @Override
    public String toString() {
        return "Supplier: " + name + " | Contact: " + contact + " | Supplies: " + productSupplied;
    }
}
