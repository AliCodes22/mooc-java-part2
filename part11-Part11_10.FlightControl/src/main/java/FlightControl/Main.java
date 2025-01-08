package FlightControl;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;

public class Main {
    static ArrayList<Airplane> planes = new ArrayList<>();
    static ArrayList<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI textUI = new TextUI(flightControl, scanner);

        textUI.start();


        // System.out.println("Choose an action:");
        // System.out.println("[1] Add an airplane");
        // System.out.println("[2] Add a flight");
        // System.out.println("[x] Exit Airport Asset Control");
        // System.out.println(">");

        // String input = scanner.nextLine();
        
        // if(input.equals("1")) {
        //     System.out.println("Give the airplane id:");
        //     String planeID = scanner.nextLine();
        //     System.out.println("Give the airplane capacity:");
        //     Integer capacity = Integer.valueOf(scanner.nextLine());

        //     Airplane plane = new Airplane(planeID, capacity);
        //     planes.add(plane);
        // } else if(input.equals("2")) {
        //     System.out.println("Give the airplane id");
        //     String planeID = scanner.nextLine();
        //     System.out.println("Give the departure airport id:");
        //     String departureID = scanner.nextLine();

        //     Place departureAirport = new Place(departureID);

        //     System.out.println("Give the target airport:");
        //     String targetAirportID = scanner.nextLine();

        //     Place arrivalAirport = new Place(targetAirportID);
            
        //     Airplane plane = null;
        //     for(Airplane p: planes) {
        //         if(p.getID().equals(planeID)){
        //             plane = p;
        //         }
        //     }

        //     Flight flight = new Flight(plane, departureAirport, arrivalAirport);
        //     flights.add(flight);
        // } else if(input.equals("x")) {
        //     return;
        // } else {
        //     return;
        // }



    }
}
