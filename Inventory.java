package models;
import java.util.*;

public class Inventory {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("Product added: " + product);
    }

    public void updateProduct(int id, int quantity) {
        if (products.containsKey(id)) {
            products.get(id).updateStock(quantity);
            System.out.println("Updated stock for: " + products.get(id));
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (products.remove(id) != null) {
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void listProducts() {
        System.out.println("\nInventory List:");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
