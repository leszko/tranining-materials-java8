package com.luxoft.java8.module1.lambda.exercise8;

public interface Bar {

  default void someMethod() {
    System.out.println("Bar#someMethod");
  }

}
