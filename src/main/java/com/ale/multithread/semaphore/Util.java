package com.ale.multithread.semaphore;

import java.util.Queue;

public class Util {
    public static synchronized Integer updateQueue(Queue<Integer> queue, Integer integer) {
        if(integer != null) {
            queue.add(integer);
            return null;
        }
        return queue.poll();
    }
}
