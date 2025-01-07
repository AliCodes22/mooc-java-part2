package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place arrivalAirport;

    public Flight(Airplane airplane, Place departureAirport, Place arrivalAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDepartureAirport() {
        return this.departureAirport;
    }

    public Place getArrivalAirport() {
        return this.arrivalAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.arrivalAirport + ")";
    }

}
