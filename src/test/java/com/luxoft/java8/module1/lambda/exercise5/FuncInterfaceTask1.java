package com.luxoft.java8.module1.lambda.exercise5;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

/**
 * Implement interface Summator and Printer by using:
 * - static method reference
 * - non-static method reference
 */
public class FuncInterfaceTask1 {

  private static class SumHelper {
    int sum(int a, int b){
      return a + b;
    }
  }

  interface Summator {
    int getSum(int a, int b);
  }

  interface Printer {
    void print(Integer a);
  }

  static class MyInfo {

    public MyInfo() {
    }

    public String info() {
      return "Hello, I'm MyInfo.info()";
    }
  }

  private static MyInfo makeInfo(Supplier<MyInfo> myInfoSupplier) {
    return myInfoSupplier.get();
  }

  public static void main(String[] args) {
    SumHelper sumHelper = new SumHelper();

    // Implement Summator using the method reference from the from the SumHelper object.
    Summator f = sumHelper::sum;
    assertEquals(f.getSum(1, 2), 3);

    // Implement Printer using static method reference from System.out.
    Printer p = System.out::println;
    p.print(f.getSum(5, 5));

    // Use contructor method reference to create MyInfo
    Supplier<MyInfo> myInfoSupplier = MyInfo::new;
    MyInfo info = makeInfo(myInfoSupplier);

    // Use containing type method reference to provide info from MyInfo
    Supplier<String> infoSupplier = info::info;
    System.out.println(infoSupplier.get());
  }
}
