package com.luxoft.java8.module2.stream.exercise2;

import java.util.stream.Stream;

public class PredicateTutor {

  /**
   * Find only elements with length > 3, which are equal to "two" or "three"
   * using predefined predicates.
   *
   * Program should print "three".
   */
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("one", "two", "three", "four", "five");
  }
}
