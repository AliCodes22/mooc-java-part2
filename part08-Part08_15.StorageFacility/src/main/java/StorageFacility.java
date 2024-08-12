import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility{
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if(!this.storage.containsKey(unit)) {
            this.storage.put(unit, new ArrayList<>());
        }

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(!this.storage.containsKey(storageUnit)) {
            this.storage.put(storageUnit, new ArrayList<>());
        } 

        return this.storage.get(storageUnit);

        
    }

}