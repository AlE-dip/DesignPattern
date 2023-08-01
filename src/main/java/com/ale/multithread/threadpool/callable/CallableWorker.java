package com.ale.multithread.threadpool.callable;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class CallableWorker implements Callable<Integer> {
    private int task;

    private int processCommand() {
        try {
            Thread.sleep(1000);
            return task;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " Starting. Task = " + task);
        int data = processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");
        return data;
    }
}
