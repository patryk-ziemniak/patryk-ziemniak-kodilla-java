package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void bigMacBuilderTest() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient(BigMac.BACON)
                .sauce(BigMac.STANDARD)
                .ingredient(BigMac.ONION)
                .burgers(2)
                .bun(BigMac.SESAME)
                .ingredient(BigMac.CHEESE)
                .build();
        System.out.println(bigMac);

        //When
        String bun = bigMac.getBun();
        int burgers = bigMac.getBurgers();
        String sauce = bigMac.getSauce();
        int ingredientAmount = bigMac.getIngredients().size();

        //Then
        assertEquals(BigMac.SESAME, bun);
        assertEquals(2, burgers);
        assertEquals(BigMac.STANDARD, sauce);
        assertEquals(3, ingredientAmount);
    }
}
