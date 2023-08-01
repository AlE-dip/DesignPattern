package com.ale.multithread.blockingqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;

@Data
@AllArgsConstructor
public class Producer implements Runnable{
    private BlockingQueue<Integer> queue;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            queue.put(i);
        }
    }
}
