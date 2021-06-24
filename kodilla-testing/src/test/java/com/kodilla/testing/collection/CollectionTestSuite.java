package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end" + "\n");
    }

    @DisplayName("When give empty list to exterminator, " +
            "then it should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(new ArrayList<Integer>());
        System.out.println("Testing empty list");
        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @DisplayName("When give normal list to exterminator, " +
            "then it should return only even integers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(new ArrayList<Integer>(Arrays.asList(5,6,7,10,5,0,6,58,12)));
        List<Integer> expectedResult = Arrays.asList(6,10,0,6,58,12);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
