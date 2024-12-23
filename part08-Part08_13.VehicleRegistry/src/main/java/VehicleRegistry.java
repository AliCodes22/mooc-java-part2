import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate) || this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if(this.registry.containsKey(licensePlate)){
            this.registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate licensePlate: this.registry.keySet()) {
            System.out.println(licensePlate.toString());
        }
    }

    public void printOwners() {
      HashSet<String> owners = new HashSet<>(this.registry.values());

      for(String owner: owners) {
        System.out.println(owner);
      }
    }
}
