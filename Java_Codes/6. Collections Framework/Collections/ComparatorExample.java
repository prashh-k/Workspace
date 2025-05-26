package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

public class ComparatorExample {

    // Function to simulate sorting products by price
    public static void sortProductsByPrice() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 499.99));
        products.add(new Product("Tablet", 299.99));

        // Display the products before sorting
        System.out.println("Products before sorting: " + products);

        // Sort the products by price
        Collections.sort(products, new PriceComparator());

        // Display the products after sorting
        System.out.println("Products after sorting by price: " + products);
    }

    public static void main(String[] args) {
        // Call the function to sort products by price
        sortProductsByPrice();
    }
}
