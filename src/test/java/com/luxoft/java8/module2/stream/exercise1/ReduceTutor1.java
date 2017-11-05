package com.luxoft.java8.module2.stream.exercise1;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceTutor1 {

  public static Stream<String> getStream() {
    return Stream.of("John Lennon", "Paul Mccartney",
        "George Harrison", "Ringo Star");
  }

  public static void main(String[] args) {

    Optional<String> reduced = getStream()
        .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
    System.out.println(reduced.get());

    Optional<String> max =
        getStream().collect(
            Collectors.maxBy(Comparator.comparing(String::length)));
    System.out.println(max.get());

  }
}
