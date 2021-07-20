package com.kodilla.good.patterns.challenges.flight.system;

import com.kodilla.good.patterns.challenges.flight.system.flightbase.Airport;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.Flight;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.FlightDatabase;

import java.util.Set;

import static com.kodilla.good.patterns.challenges.flight.system.display.FlightDisplay.display;
import static com.kodilla.good.patterns.challenges.flight.system.searcher.FlightSearcher.*;

public class FlightSystem {

    public static void main(String[] args) {
        Set<Flight> flightSet = new FlightDatabase().getFlightSet();

        Set<Flight> flightsFromWarsaw = searchFlightsFrom(flightSet, Airport.WARSAW);
        System.out.println("Flights from Warsaw:");
        display(flightsFromWarsaw);

        Set<Flight> flightsToWarsaw = searchFlightsTo(flightSet, Airport.WARSAW);
        System.out.println("Flights to Warsaw:");
        display(flightsToWarsaw);

        Set<Flight> flightsFromGdanskToWroclaw = searchConnectingFlightFromTo(flightSet, Airport.GDANSK, Airport.WROCLAW);
        System.out.println("Connecting flights from Gdansk to Wroclaw:");
        display(flightsFromGdanskToWroclaw);
    }
}
