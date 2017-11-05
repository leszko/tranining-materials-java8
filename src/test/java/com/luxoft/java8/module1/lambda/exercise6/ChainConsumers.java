package com.luxoft.java8.module1.lambda.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** Use method reference to print List elements. */
public class ChainConsumers {

  public static void main(String... args) {

    List<String> strings =
        Arrays.asList("one", "two", "three", "four", "five");
    // Use strings.forEach() to print all elements
    Consumer<String> consumer = null;
    strings.forEach(consumer);

    // Observe how Consumer can be chained
    List<String> result = new ArrayList<>();
    strings.forEach(consumer.andThen(result::add));
    System.out.println("size of result = " + result.size());
  }
}
