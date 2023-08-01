package com.ale.multithread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static final int THREAD_SIZE = 4;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);

        for (int i = 0; i < 10; i++) {
            executor.execute(new Worker("" + i));
        }

        executor.shutdown();
    }
}
