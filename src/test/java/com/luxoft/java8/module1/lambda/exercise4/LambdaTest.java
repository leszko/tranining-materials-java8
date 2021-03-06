package com.luxoft.java8.module1.lambda.exercise4;

import java.util.function.Function;

/**
 * Rewrite this class to use method reference instead of the lambda expression.
 */
public class LambdaTest {

  public String process(String s, Function<String, String> f) {
    return f.apply(s);
  }

  public String addExclam(String s) {
    return s + "!";
  }

  public static void main(String[] args) {
    LambdaTest lambdaTest = new LambdaTest();
    String string = lambdaTest.process("hello", s -> lambdaTest.addExclam(s));
    System.out.println(string);
  }
}
