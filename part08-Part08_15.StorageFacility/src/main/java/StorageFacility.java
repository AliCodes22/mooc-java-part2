import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<String>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        // get the list items using the key value
        ArrayList<String> items = this.storage.get(storageUnit);

        // if the HashMap doesn't contain the provided key
        // or if the list is empty, return an empty list
        if(items == null) {
            return new ArrayList<>();
        }

        // if all is good return items
        return items;
    }

    public void remove(String storageUnit, String item) {
       ArrayList<String> items = this.storage.get(storageUnit);

        if(items != null) {
            items.remove(item);

            if(items.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for(String key: this.storage.keySet()) {
            ArrayList<String> items = this.storage.get(key);

            if(!items.isEmpty()) {
                units.add(key);
            }
        }

        return units;
    }
}
