package com.kodilla.good.patterns.challenges.flight.system.flightbase;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {

    private final Set<Flight> flightSet;

    public FlightDatabase() {
        flightSet = new HashSet<>();

        flightSet.add(new Flight(Airport.WARSAW, Airport.GDANSK));
        flightSet.add(new Flight(Airport.GDANSK, Airport.KRAKOW));
        flightSet.add(new Flight(Airport.KRAKOW, Airport.WROCLAW));
        flightSet.add(new Flight(Airport.WROCLAW, Airport.WARSAW));
        flightSet.add(new Flight(Airport.WARSAW, Airport.ROME));
        flightSet.add(new Flight(Airport.WARSAW, Airport.BERLIN));
        flightSet.add(new Flight(Airport.WARSAW, Airport.PARIS));
        flightSet.add(new Flight(Airport.BERLIN, Airport.WARSAW));
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }
}
