package com.luxoft.java8.module1.lambda.exercise4;

import java.util.function.Function;

public class LambdaTest1 {

  public String process(String s, Function<String, String> f) {
    return f.apply(s);
  }

  public String addExclam(String s) {
    return s + "!";
  }

  public static void main(String[] args) {
    LambdaTest1 lambdaTest = new LambdaTest1();
    String string = lambdaTest.process("hello", lambdaTest::addExclam);
    System.out.println(string);
  }
}
