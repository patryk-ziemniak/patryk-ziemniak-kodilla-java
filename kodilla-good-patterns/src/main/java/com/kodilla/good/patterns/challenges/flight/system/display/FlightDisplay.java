package com.kodilla.good.patterns.challenges.flight.system.display;

import com.kodilla.good.patterns.challenges.flight.system.flightbase.Flight;

import java.util.Set;

public class FlightDisplay {

    public static void display(Set<Flight> flightSet) {
        if(flightSet.isEmpty()) {
            System.out.println("No flights found...");
        } else {
            flightSet.forEach(System.out::println);
        }
        System.out.println();
    }
}
