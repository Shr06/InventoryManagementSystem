package main;
import models.*;
import java.util.*;

public class InventoryApp {
    private static Inventory inventory = new Inventory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Product | 2. Update Stock | 3. Delete Product | 4. View Inventory | 5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateStock();
                case 3 -> deleteProduct();
                case 4 -> inventory.listProducts();
                case 5 -> { scanner.close(); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Reorder Level: ");
        int reorderLevel = scanner.nextInt();
        scanner.nextLine();

        inventory.addProduct(new Product(id, name, qty, price, reorderLevel));
    }

    private static void updateStock() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Quantity to Add/Remove: ");
        int qty = scanner.nextInt();
        inventory.updateProduct(id, qty);
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        inventory.deleteProduct(id);
    }
}
