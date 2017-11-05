package com.luxoft.java8.module2.stream.exercise7;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class IntStreamTutor {

  public static IntStream intStream() {
    return IntStream.of(2, 3, 3, 4);
  }

  public static void log(int i) {
    System.out.println(i);
  }

  public static void log(String i) {
    System.out.println(i);
  }


  /**
   * Find and print:
   * - max number in intStream
   * - average number in intStream
   * - list of distinct values: "2,3,4" (use distinct())
   */
  @Test
  public void testIntStream() {

    // Find the max number
    int max = 0;
    log(max);
    assertEquals(max, 4);

    // Find the average number
    int avg = 0;
    log(avg);
    assertEquals(avg, 3);

    // Find distinct values and collect them to a string separated by ","
    String distinct = null;
    log(distinct);
    assertEquals(distinct, "2,3,4");

  }
}
