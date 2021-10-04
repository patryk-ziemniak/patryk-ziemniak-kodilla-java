package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void shouldReturnValue15AndDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();

        //When
        BigDecimal price = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(BigDecimal.valueOf(15), price);
        assertEquals("Basic pizza - dough, sauce and cheese", description);
    }

    @Test
    public void shouldReturnValue19AndDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new SalamiDecorator(order);

        //When
        BigDecimal price = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(BigDecimal.valueOf(19), price);
        assertEquals("Basic pizza - dough, sauce and cheese + salami", description);
    }

    @Test
    public void shouldReturnValue23AndDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new SalamiDecorator(order);
        order = new DoubleCheeseDecorator(order);
        order = new GarlicSauceDecorator(order);

        //When
        BigDecimal price = order.getCost();
        String description = order.getDescription();

        //Then
        assertEquals(BigDecimal.valueOf(23), price);
        assertEquals("Basic pizza - dough, sauce and cheese + salami" +
                " + double cheese + garlic sauce", description);
    }
}
