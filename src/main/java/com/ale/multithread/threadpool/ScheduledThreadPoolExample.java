package com.ale.multithread.threadpool;

import java.util.List;
import java.util.concurrent.*;

public class ScheduledThreadPoolExample {
    public static final int THREAD_SIZE = 2;
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(THREAD_SIZE);

        for (int i = 0; i < 10; i++) {
            executor.schedule(new Worker("" + i), 1, TimeUnit.SECONDS);
        }

        executor.shutdown();
    }
}
