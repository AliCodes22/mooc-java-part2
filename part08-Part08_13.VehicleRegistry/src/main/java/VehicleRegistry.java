import java.util.HashMap;

public class VehicleRegistry{
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(!(licensePlate.getOwner().equals(null))) {
            return true;
        } else {
            return false;
        }
    }


}