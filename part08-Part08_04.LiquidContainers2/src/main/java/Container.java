public class Container {

    private int totalLiquid;
    private final int MAX_CAPACITY = 100; // Define a maximum capacity

    public Container() {
        this.totalLiquid = 0;
    }

    public int contains() {
        return this.totalLiquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.totalLiquid += amount;
            if (this.totalLiquid > MAX_CAPACITY) { // Ensure it doesn't exceed maximum capacity
                this.totalLiquid = MAX_CAPACITY;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.totalLiquid -= amount;
            if (this.totalLiquid < 0) { // Ensure it doesn't go below zero
                this.totalLiquid = 0;
            }
        }
    }

    @Override
    public String toString() {
        return + this.totalLiquid + "/" + MAX_CAPACITY; // Fixed formatting
    }
}

