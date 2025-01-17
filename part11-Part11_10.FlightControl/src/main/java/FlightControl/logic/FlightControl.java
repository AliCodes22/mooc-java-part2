package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;


import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String,Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }

    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        this.places.putIfAbsent(departureID, new Place(departureID));

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));

        this.flights.put(flight.toString(), flight);
    }
    

    public Collection<Airplane> planes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Collection<Place> getPlaces() {
        return this.places.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }

}
