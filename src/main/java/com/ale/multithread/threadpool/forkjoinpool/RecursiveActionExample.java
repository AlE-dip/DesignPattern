package com.ale.multithread.threadpool.forkjoinpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class RecursiveActionExample {
    public static void main(String[] args) {
        AtomicLong atomicLongC = new AtomicLong(0L);
        AtomicLong atomicLongD = new AtomicLong(0L);
        AtomicLong atomicLongE = new AtomicLong(0L);
        ForkJoinPool pool = new ForkJoinPool();

        SizeOfFileRecursiveAction C = new SizeOfFileRecursiveAction("C:/", atomicLongC);
        SizeOfFileRecursiveAction D = new SizeOfFileRecursiveAction("D:/", atomicLongD);
        SizeOfFileRecursiveAction E = new SizeOfFileRecursiveAction("E:/", atomicLongE);

        pool.execute(C);
        pool.execute(D);
        pool.execute(E);

        do {
            System.out.printf("******************************************\n");
            System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
            System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
            System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
            System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
            System.out.printf("******************************************\n");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while ((!C.isDone()) || (!D.isDone()) || (!E.isDone()));

        pool.shutdown();

        System.out.printf("Size of C: %d bytes \n", atomicLongC.get());
        System.out.printf("Size of D: %d bytes \n", atomicLongD.get());
        System.out.printf("Size of E: %d bytes \n", atomicLongE.get());
    }
}
