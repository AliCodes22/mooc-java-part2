public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
        
    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double removed = super.takeFromWarehouse(amount); // Take from the warehouse (updates balance)
        this.changeHistory.add(this.getBalance()); // Record the new balance in the history
        return removed; 
    }

    public void printAnalysis() {
        System.out.println(
             "Product: " + this.getName() + "\n" + 
             "History: " + this.changeHistory.toString() + "\n" + 
             "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
             "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +
             "Average: " + this.changeHistory.average()
        );
    }


}
