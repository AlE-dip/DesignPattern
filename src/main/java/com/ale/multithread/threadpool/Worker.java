package com.ale.multithread.threadpool;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Worker implements Runnable{
    private String task;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Starting. Task = " + task);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");
    }

    private void processCommand() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
