package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println(challenge.probablyIWillThrowException(1.0, 2.0));
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
