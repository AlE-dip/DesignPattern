package com.ale.multithread.semaphore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

@Data
@AllArgsConstructor
public class Producer implements Runnable{
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private Queue<Integer> queue;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            producerSemaphore.acquire();
            Util.updateQueue(queue, i);
            consumerSemaphore.release();
        }
    }

}
