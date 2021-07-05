package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void secondChallengeMethodShouldThrowException() {
        //Given
        SecondChallenge challenge = new SecondChallenge();
        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2.0, 1.4)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0.9, 1.6)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0.5, 1.5))
        );
    }

    @Test
    void secondChallengeMethodShouldNotThrowException() {
        //Given
        SecondChallenge challenge = new SecondChallenge();
        //When&Then
        assertAll(
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.99, 1.4)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1.0, 1.6))
        );
    }
}
