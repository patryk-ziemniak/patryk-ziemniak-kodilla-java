package com.kodilla.good.patterns.challenges.flight.system;

import com.kodilla.good.patterns.challenges.flight.system.display.FlightDisplay;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.Airport;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.Flight;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.FlightDatabase;
import com.kodilla.good.patterns.challenges.flight.system.searcher.FlightSearcher;

import java.util.Set;

public class FlightSystem {

    public static void main(String[] args) {
        Set<Flight> flightSet = new FlightDatabase().getFlightSet();

        Set<Flight> flightsFromWarsaw = FlightSearcher.searchFlightsFrom(flightSet, Airport.WARSAW);
        System.out.println("Flights from Warsaw:");
        FlightDisplay.display(flightsFromWarsaw);

        Set<Flight> flightsToWarsaw = FlightSearcher.searchFlightsTo(flightSet, Airport.WARSAW);
        System.out.println("Flights to Warsaw:");
        FlightDisplay.display(flightsToWarsaw);

        Set<Flight> flightsFromGdanskToWroclaw = FlightSearcher.searchConnectingFlightFromTo(flightSet, Airport.GDANSK, Airport.WROCLAW);
        System.out.println("Connecting flights from Gdansk to Wroclaw:");
        FlightDisplay.display(flightsFromGdanskToWroclaw);
    }
}
