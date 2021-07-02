package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = IntStream.rangeClosed(1, 20)
                .toArray();

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(10.5, result, 0.0);
    }
}
