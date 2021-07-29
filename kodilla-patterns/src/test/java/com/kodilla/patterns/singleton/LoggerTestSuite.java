package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLogger() {
        logger = Logger.INSTANCE;
    }

    @BeforeEach
    public void prepareLogger() {
        logger.log("Created new order");
    }

    @Test
    void getLastLogTest() {
        //Given
        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("Created new order", log);
    }

    @Test
    void getLastLogSecondAssignTest() {
        //Given
        logger.log("Deleted order");

        //When
        String log = logger.getLastLog();

        //Then
        assertEquals("Deleted order", log);
    }
}
