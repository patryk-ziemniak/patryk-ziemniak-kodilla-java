package com.kodilla.good.patterns.challenges.flight.system.flightbase;

public class Flight {

    private final Airport departure;
    private final Airport arrival;

    public Flight(Airport departure, Airport arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight from " + departure + ", to " + arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (getDeparture() != flight.getDeparture()) return false;
        return getArrival() == flight.getArrival();
    }

    @Override
    public int hashCode() {
        return getDeparture().hashCode();
    }
}
