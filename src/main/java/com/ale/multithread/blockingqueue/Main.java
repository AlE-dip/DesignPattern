package com.ale.multithread.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Producer producer1 = new Producer(queue);
        Consumer consumer1 = new Consumer(queue, "Con1");
        Consumer consumer2 = new Consumer(queue, "Con2");

        new Thread(producer1).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
