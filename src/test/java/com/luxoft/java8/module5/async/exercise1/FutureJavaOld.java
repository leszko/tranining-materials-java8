package com.luxoft.java8.module5.async.exercise1;

import com.luxoft.java8.module5.async.base.CompletableFutureBase;

import java.util.concurrent.*;

public class FutureJavaOld extends CompletableFutureBase {

	int result;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureJavaOld futureJavaOld = new FutureJavaOld();

		futureJavaOld.useOldStyle();
		futureJavaOld.useFuture();
		futureJavaOld.useCompletableFuture();
	}

	public void useOldStyle() throws InterruptedException {
		Thread t = new Thread() {
			public void run() {
				result = slowInit();				
			};
		};
		
		t.start();

		// wait for the async operation to finish
		t.join();
		System.out.println("futureTest() is finished: "+result);
	}
	
	public void useFuture()
		throws InterruptedException, ExecutionException {
	
		Callable<Integer> r = this::slowInit;
		ExecutorService es =
				Executors.newFixedThreadPool(10);
		Future<Integer> future = es.submit(r);

		// wait for the async operation to finish and retrieve result
		Integer res = future.get();

		System.out.println("futureTest() is finished: "+res);
	}
	
	public void useCompletableFuture()
		throws InterruptedException, ExecutionException {
			CompletableFuture<Void> future = 
				CompletableFuture
				.supplyAsync(this::slowInit)
				.thenAccept(
					  (res) -> { System.out.println("finished "+res); }
					)
				.thenRun(
					() -> { System.out.println("look at results"); }
				);

			// wait to finish all 3 chained operations
			future.get();
			System.out.println("promiseTestNext() is finished");
	}

}
