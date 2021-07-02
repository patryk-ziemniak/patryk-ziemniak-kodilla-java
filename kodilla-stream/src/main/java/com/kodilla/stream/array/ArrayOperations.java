package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        System.out.println("Numbers in array:");
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));
        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        if(result.isPresent()) {
            System.out.println("Average of numbers in array: " + result.getAsDouble());
            return result.getAsDouble();
        } else {
            System.out.println("No numbers available in array");
            return 0.0;
        }
    }
}
