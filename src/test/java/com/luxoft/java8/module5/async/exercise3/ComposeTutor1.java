package com.luxoft.java8.module5.async.exercise3;

import static org.junit.Assert.assertEquals;

import com.luxoft.java8.module5.async.base.CompletableFutureBase;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class ComposeTutor1 extends CompletableFutureBase {

  @Test
  public void promiseTestCompose2() throws Exception {
    CompletableFuture<Integer> future1 =
        CompletableFuture.supplyAsync(this::slowInit) // 1
            .thenApply(this::slowIncrement); // 2

    CompletableFuture<Integer> thenCompose =
        future1.thenCompose(
            res -> CompletableFuture.supplyAsync(() -> res)
                .thenApply(this::slowIncrement)); // 3

    int result = thenCompose.get();
    System.out.println(result);
    assertEquals(result, 3);
  }

}
