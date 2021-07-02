package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {

    private final Set<Country> countries;

    public Continent(final Set<Country> countries) {
        this.countries = countries;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return getCountries().equals(continent.getCountries());
    }

    @Override
    public int hashCode() {
        return getCountries().hashCode();
    }
}
