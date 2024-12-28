import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;

        for(Packable item: this.items) {
            if(item.weight() > this.maxWeight) {
                continue;
            } else {
                weight += item.weight();
            }
        }
       return weight;
    }

  public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.items.add(item);
        }
    }


    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, " + "total weight " + this.weight() + " kg";
    }

}
