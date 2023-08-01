package com.ale.multithread.threadpool.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class InvokeAllExample {
    public static final int THREAD_SIZE = 4;
    public static void main(String[] args) throws InterruptedException {
        List<CallableWorker> callableWorkers = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);

        for (int i = 0; i < 10; i++) {
            callableWorkers.add(new CallableWorker(i));
        }
        List<Future<Integer>> futures = new ArrayList<>(executor.invokeAll(callableWorkers));
        executor.shutdown();

        futures.forEach(integerFuture -> {
            try {
                System.out.println(integerFuture.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Finished all threads: ");
    }
}
