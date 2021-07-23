package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double add = calculator.add(10,5);
        double subtract = calculator.sub(10,5);
        double multiply = calculator.mul(10,5);
        double divide = calculator.div(10,5);

        //Then
        assertAll(
                () -> assertEquals(15.0, add, 0.0),
                () -> assertEquals(5.0, subtract, 0.0),
                () -> assertEquals(50.0, multiply, 0.0),
                () -> assertEquals(2.0, divide, 0.0)
        );
    }
}
