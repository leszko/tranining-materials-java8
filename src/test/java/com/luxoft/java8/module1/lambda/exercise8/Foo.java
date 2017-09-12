package com.luxoft.java8.module1.lambda.exercise8;

public interface Foo {

  default void someMethod() {
    System.out.println("Foo#someMethod");
  }

  default void someOtherMethod() {
    System.out.println("Foo#someOtherMethod");
  }

}
