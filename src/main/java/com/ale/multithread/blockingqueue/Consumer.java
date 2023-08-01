package com.ale.multithread.blockingqueue;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;

@AllArgsConstructor
public class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    private String name;
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            System.out.println(name + " data: " + queue.take());
        }
    }
}
