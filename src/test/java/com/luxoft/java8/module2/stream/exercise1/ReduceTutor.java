package com.luxoft.java8.module2.stream.exercise1;

import java.util.stream.Stream;

public class ReduceTutor {

  public static Stream<String> getStream() {
    return Stream.of("John Lennon", "Paul Mccartney",
        "George Harrison", "Ringo Star");
  }

  /**
   * Find the longest text in the com.luxoft.java8.stream in 2 ways and print it:
   * - Using getStream().reduce()
   */
  public static void main(String[] args) {

  }

}
