import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Map<String,Integer>> products;

    public Warehouse() {
        this.products = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        Map<String,Integer> details = new HashMap<>();

        details.put("price", price);
        details.put("stock", stock);

        this.products.put(product,details);

    }

    public int price(String product) {
        if(!this.products.containsKey(product)) {
            return -99;
        }

        return this.products.get(product).get("price");
    }

    public int stock(String product) {
        if(!this.products.containsKey(product)) {
            return 0;
        }

        return this.products.get(product).get("stock");
    }

    public boolean take(String product) {
        if(!this.products.containsKey(product)) {
            return false;
        }

        int stock = this.products.get(product).get("stock");
        stock--;

        if(stock < 0) {
            stock = 0;
        } 

        return stock > 0;
    }

    public Set<String> products() {
        return this.products.keySet();
    }


}
