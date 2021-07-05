package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Berlin", true);
        flightMap.put("Madrid", false);
        flightMap.put("Tokyo", false);
        flightMap.put("New York", true);
        flightMap.put("Paris", true);
        flightMap.put("London", false);

        if (!flightMap.containsKey(flight.arrivalAirport)) {
            throw new RouteNotFoundException();
        } else if (flightMap.get(flight.arrivalAirport)) {
            System.out.println("Flight to " + flight.arrivalAirport + " is possible");
        } else {
            System.out.println("Flight to " + flight.arrivalAirport + " is not possible");
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Oslo");
        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("No such directory in database");
        }
    }
}
