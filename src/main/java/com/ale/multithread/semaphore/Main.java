package com.ale.multithread.semaphore;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static final int BUFFER_SIZE = 4;
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Semaphore producerSemaphore = new Semaphore(BUFFER_SIZE);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer producer1 = new Producer(producerSemaphore, consumerSemaphore, queue);
        Consumer consumer1 = new Consumer(producerSemaphore, consumerSemaphore, queue, "Con1");
        Consumer consumer2 = new Consumer(producerSemaphore, consumerSemaphore, queue, "Con2");
        Consumer consumer3 = new Consumer(producerSemaphore, consumerSemaphore, queue, "Con3");
        Consumer consumer4 = new Consumer(producerSemaphore, consumerSemaphore, queue, "Con4");


        new Thread(producer1).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();
        new Thread(consumer4).start();
    }
}
