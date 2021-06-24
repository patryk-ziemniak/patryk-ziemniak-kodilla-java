package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();

        for (Integer i : numbers) {
            if (i%2 == 0) {
                results.add(i);
            }
        }
        return results;
    }
}
