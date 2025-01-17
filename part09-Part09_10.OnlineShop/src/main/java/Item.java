public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String getName() {
        return this.product;
    }

    public int getQuantity() {
        return this.qty;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getQuantity();
    }
}
