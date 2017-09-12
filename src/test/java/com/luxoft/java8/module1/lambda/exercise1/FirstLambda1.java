package com.luxoft.java8.module1.lambda.exercise1;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda1 {

  private static final String EXERCISE1_PATH = "./src/test/java/com/luxoft/java8/module1/lambda/exercise1";

  public static void main(String[] args) {
    FileFilter filterLambda = (File pathname) ->
        pathname.getName().endsWith(".java");

    File dir = new File(EXERCISE1_PATH);

    File[] files = dir.listFiles(filterLambda);

    for (File f : files) {
      System.out.println(f);
    }
  }
}
