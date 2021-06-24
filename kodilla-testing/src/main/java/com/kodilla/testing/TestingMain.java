package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultOfAdd = calculator.add(5, 3);
        int expectedResultOfAdd = 5 + 3;
        if (expectedResultOfAdd == resultOfAdd) {
            System.out.println("test of method Calculator.add() OK");
        } else {
            System.out.println("Error! - method Calculator.add()");
        }

        int resultOfSubtract = calculator.subtract(5, 3);
        int expectedResultOfSubtract = 5 - 3;
        if (expectedResultOfSubtract == resultOfSubtract) {
            System.out.println("test of method Calculator.subtract() OK");
        } else {
            System.out.println("Error! - method Calculator.subtract()");
        }
    }
}
