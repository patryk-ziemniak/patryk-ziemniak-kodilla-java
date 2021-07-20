package com.kodilla.good.patterns.challenges.flight.system.searcher;

import com.kodilla.good.patterns.challenges.flight.system.flightbase.Airport;
import com.kodilla.good.patterns.challenges.flight.system.flightbase.Flight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearcher {

    public static Set<Flight> searchFlightsFrom(Set<Flight> flightSet, Airport departure) {
        return flightSet.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toSet());
    }

    public static Set<Flight> searchFlightsTo(Set<Flight> flightSet, Airport arrival) {
        return flightSet.stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toSet());
    }

    public static Set<Flight> searchConnectingFlightFromTo(Set<Flight> flightSet, Airport departure, Airport arrival) {
        Set<Flight> result = new HashSet<>();

        Set<Flight> flightsTo = flightSet.stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        flightSet.stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .filter(flight -> flightsTo.contains(new Flight(flight.getArrival(), arrival)))
                .forEach(result::add);

        flightsTo.stream()
                .filter(flight -> result.contains(new Flight(departure, flight.getDeparture())))
                .forEach(result::add);

        return result;
    }
}
