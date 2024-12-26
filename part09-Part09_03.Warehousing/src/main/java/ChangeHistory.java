import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }

        double largest = Collections.max(this.changeHistory);

        return largest;
    }

    public double minValue() {
        if(this.changeHistory.isEmpty()) {
            return 0.0;
        }

        return Collections.min(this.changeHistory);
    }

    public double average() {
        int length = this.changeHistory.size();
        double sum = 0.0;

        if(length == 0) {
            return 0.0;
        } 

        for(double item: this.changeHistory) {
            sum += item;
        }

        return (double) sum / length;


    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }

}
