package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38265000"));
        Country germany = new Country(new BigDecimal("83200000"));
        Country italy = new Country(new BigDecimal("60360000"));
        Set<Country> europeSet = new HashSet<>();
        europeSet.add(poland);
        europeSet.add(germany);
        europeSet.add(italy);
        Continent europe = new Continent(europeSet);

        Country india = new Country(new BigDecimal("1366000000"));
        Country china = new Country(new BigDecimal("1398000000"));
        Country japan = new Country(new BigDecimal("126300000"));
        Set<Country> asiaSet = new HashSet<>();
        asiaSet.add(india);
        asiaSet.add(china);
        asiaSet.add(japan);
        Continent asia = new Continent(asiaSet);

        Country usa = new Country(new BigDecimal("328200000"));
        Country canada = new Country(new BigDecimal("37590000"));
        Country argentina = new Country(new BigDecimal("44940000"));
        Set<Country> americaSet = new HashSet<>();
        americaSet.add(usa);
        americaSet.add(canada);
        americaSet.add(argentina);
        Continent america = new Continent(americaSet);

        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(america);
        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("3482855000");

        //Then
        assertEquals(expected, result);
    }
}
