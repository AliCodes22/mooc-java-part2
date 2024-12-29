import java.util.HashMap;
import java.util.Map;
import java.util.Collection;;

public class ShoppingCart {
    private Map<String,Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if(this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();;
        } else {
             this.items.put(product, new Item(product,1, price));
        }

       
    }

    public int price() {
        Collection<Item> items = this.items.values();
        int sum = 0;

        for(Item item: items) {
            sum += item.price();
        }

        return sum;
        
    }

    public void print() {
        Collection<Item> items = this.items.values();

        for(Item item: items) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }


    
}
