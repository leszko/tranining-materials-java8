package com.luxoft.java8.module1.lambda.exercise1;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

  private static final String EXERCISE1_PATH = "./src/test/java/com/luxoft/java8/module1/lambda/exercise1";

  /**
   * Rewrite this class to use lambda expression.
   */
  public static void main(String[] args) {

    FileFilter filter = new FileFilter() {

      @Override
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
      }
    };

    File dir = new File(EXERCISE1_PATH);

    File[] files = dir.listFiles(filter);

    for (File f : files) {
      System.out.println(f);
    }
  }
}
