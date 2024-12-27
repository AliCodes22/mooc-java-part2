import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if(!(obj instanceof Item)) {
            return true;
        }
        
        Item comparedObject = (Item) obj;

        if(comparedObject.getName().equals(this.getName())) {
            return true;
        }

        return false;

    }

    public int hashCode() {
        return Objects.hash(name);  // Use name to calculate hashCode, ignoring weight
    }

}
