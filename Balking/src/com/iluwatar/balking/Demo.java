package com.iluwatar.balking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
	public static void main(String[] args) {
		final WashingMachine washingMachine = new WashingMachine();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			executorService.execute(washingMachine::wash);
		}
		executorService.shutdown();
		try {
			executorService.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException ie) {
			System.out.println("ERROR: Waiting on executor service shutdown!");
		}
	}
}
