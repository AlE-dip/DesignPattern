package com.ale.multithread.semaphore;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Consumer implements Runnable{
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private Queue<Integer> queue;
    private String name;
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            consumerSemaphore.acquire();
            Integer data = Util.updateQueue(queue, null);
            System.out.println(name + " data: " + data);
            producerSemaphore.release();
        }
    }
}
