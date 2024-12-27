import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight; // Maximum weight allowed for the box
    private ArrayList<Item> items; // List to hold the items

    // Constructor to initialize the box with a max weight
    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;  // Set the max weight for the box
        this.items = new ArrayList<>();  // Initialize the list to store items
    }

    // Method to add an item to the box, checking if the weight limit is exceeded
    @Override
    public void add(Item item) {
        int currentWeight = currentWeight();  // Get the current total weight of items in the box
        
        // Check if adding the item exceeds the box's weight limit
        if (currentWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);  // Add the item to the box
        } else {
            System.out.println("Cannot add item, exceeds max weight.");
        }
    }

    // Helper method to calculate the current weight of the items in the box
    private int currentWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();  // Add the weight of each item
        }
        return totalWeight;  // Return the total weight
    }

    // Method to check if a specific item is in the box
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);  // Check if the item is in the list
    }
}
