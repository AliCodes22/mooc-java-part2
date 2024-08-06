import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        boolean isFound = false;

        if(this.list.get(toWhom) != null) {
             isFound = true;
            return this.list.get(toWhom);
        }

       
        return 0.0;
    }

}
