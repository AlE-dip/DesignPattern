package com.ale.multithread.threadpool.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class SubmitExample {
    public static final int THREAD_SIZE = 4;
    public static void main(String[] args) {
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);

        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(new CallableWorker(i));
            list.add(future);
        }

        executor.shutdown();
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        list.forEach(integerFuture -> {
            try {
                System.out.println(integerFuture.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Finished all threads: ");
    }
}
