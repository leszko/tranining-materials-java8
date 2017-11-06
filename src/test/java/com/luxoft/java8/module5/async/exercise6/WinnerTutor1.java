package com.luxoft.java8.module5.async.exercise6;

import static org.junit.Assert.assertEquals;

import com.luxoft.java8.module5.async.base.CompletableFutureBase;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class WinnerTutor1 extends CompletableFutureBase {

  @Test
  public void testApplyToEither() throws Exception {
    long start = System.nanoTime();

    CompletableFuture<Integer> future1 =
        CompletableFuture.supplyAsync(this::slowInit)
            .thenApply(this::slowIncrement)
            .thenApply(this::slowIncrement);
    CompletableFuture<Integer> future2 =
        CompletableFuture.supplyAsync(this::slowInit)
            .thenApply(this::slowIncrement);
    CompletableFuture<Integer> winner = future1
        .applyToEither(future2, this::slowIncrement);

    int result = winner.get();
    System.out.println("result: " + result); // result: 3

    long elapsedTime = System.nanoTime() - start;
    System.out.printf("%d sec passed",
        TimeUnit.NANOSECONDS.toSeconds(elapsedTime));

    assertEquals(result, 3);
    assertEquals(TimeUnit.NANOSECONDS.toSeconds(elapsedTime), 3);

  } // 3 sec passed

}
