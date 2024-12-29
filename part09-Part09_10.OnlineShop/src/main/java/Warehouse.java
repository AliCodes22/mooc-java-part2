import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;   // Stores product prices
    private Map<String, Integer> quantities; // Stores product stock quantities

    public Warehouse() {
        this.prices = new HashMap<>();
        this.quantities = new HashMap<>();
    }

    // Add a product to the warehouse
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price); // Store product price
        this.quantities.put(product, stock); // Store product stock
    }

    // Get the price of a product
    public int price(String product) {
        return this.prices.getOrDefault(product, -99); // Return -99 if product not found
    }

    // Get the stock of a product
    public int stock(String product) {
        return this.quantities.getOrDefault(product, 0); // Return 0 if product not found
    }

    // Take one item of a product from the stock
    public boolean take(String product) {
        int currentStock = this.quantities.getOrDefault(product, 0);

        if (currentStock > 0) {
            this.quantities.put(product, currentStock - 1); // Decrease stock by 1
            return true;
        }
        return false; // Return false if product is out of stock
    }

    // Get all product names
    public Set<String> products() {
        return this.prices.keySet(); // Return the set of product names
    }
}
