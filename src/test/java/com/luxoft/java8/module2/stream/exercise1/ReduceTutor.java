package com.luxoft.java8.module2.stream.exercise1;

import java.util.stream.Stream;

public class ReduceTutor {

    public static Stream<String> getStream() {
        return Stream.of("John Lennon", "Paul Mccartney",
                "George Harrison", "Ringo Star");
    }

    /**
     * Find the longest text and print it - use two different ways:
     * - Using getStream().reduce()
     * - Using Collectors.maxBy()
     */
    public static void main(String[] args) {
    }

}
