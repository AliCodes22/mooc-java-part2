package FlightControl.domain;

public class Place {
    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return this.ID;
    }

    @Override
    public String toString() {
        return this.ID;
    }
}
