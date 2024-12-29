import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
    ShoppingCart cart = new ShoppingCart();
    System.out.println("Welcome to the store " + customer);
    System.out.println("our selection:");

    for (String product : this.warehouse.products()) {
        System.out.println(product);
    }

    while (true) {
        System.out.print("What to put in the cart (press enter to go to the register): ");
        String product = scanner.nextLine();
        if (product.isEmpty()) {
            break;
        }

        // Check if the product exists in the warehouse and is in stock
        if (this.warehouse.stock(product) > 0) {
            // Add the product to the cart
            cart.add(product, this.warehouse.price(product));
            // Reduce the stock in the warehouse
            this.warehouse.take(product);
        } else {
            System.out.println("The product is out of stock.");
        }
    }

    System.out.println("your shoppingcart contents:");
    cart.print();
    System.out.println("total: " + cart.price());
}


    
}