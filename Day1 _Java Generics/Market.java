package day1;

import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

// Category interface
interface iCategory {
    String getCategoryName();
}

// Category implementations
class BookCategory implements iCategory {
    private String name;

    public BookCategory(String name) {
        this.name = name;
    }

    @Override
    public String getCategoryName() {
        return name;
    }
}

class ClothingCategory implements iCategory {
    private String name;

    public ClothingCategory(String name) {
        this.name = name;
    }

    @Override
    public String getCategoryName() {
        return name;
    }
}

class GadgetCategory implements iCategory {
    private String name;

    public GadgetCategory(String name) {
        this.name = name;
    }

    @Override
    public String getCategoryName() {
        return name;
    }
}

// Generic Product class
class Product<T extends iCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " [" + category.getCategoryName() + "]";
    }
}

// Discount Manager with generic method
class DiscountManager {
    public static <T extends iCategory> void applyDiscount(Product<T> product, double percentage) {
        double originalPrice = product.getPrice();
        double discountedPrice = originalPrice - (originalPrice * percentage / 100);
        product.setPrice(discountedPrice);
    }
}

// Catalog to store products of any category
class Catalog {
    private List<Product<? extends iCategory>> products = new ArrayList<>();

    public void addProduct(Product<? extends iCategory> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<? extends iCategory> p : products) {
            System.out.println(p);
        }
    }
}

// Main class
public class Market {
    public static void main(String[] args) {
        // Create categories
        BookCategory sciFi = new BookCategory("Science Fiction");
        ClothingCategory mensWear = new ClothingCategory("Men's Wear");
        GadgetCategory accessories = new GadgetCategory("Tech Accessories");

        // Create products
        Product<BookCategory> book = new Product<>("Journey to Mars", 35.00, sciFi);
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 25.00, mensWear);
        Product<GadgetCategory> mouse = new Product<>("Bluetooth Mouse", 40.00, accessories);

        // Apply discounts
        DiscountManager.applyDiscount(book, 10);   // 10% off
        DiscountManager.applyDiscount(shirt, 15);  // 15% off

        // Add to catalog
        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(mouse);

        // Show catalog
        catalog.showCatalog();
    }
}
