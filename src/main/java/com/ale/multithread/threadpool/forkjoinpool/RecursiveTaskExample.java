package com.ale.multithread.threadpool.forkjoinpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class RecursiveTaskExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        SizeOfFileRecursiveTask C = new SizeOfFileRecursiveTask("C:/");
        SizeOfFileRecursiveTask D = new SizeOfFileRecursiveTask("D:/");
        SizeOfFileRecursiveTask E = new SizeOfFileRecursiveTask("E:/");

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

        System.out.printf("Size of C: %d bytes \n", C.join());
        System.out.printf("Size of D: %d bytes \n", D.join());
        System.out.printf("Size of E: %d bytes \n", E.join());
    }
}
