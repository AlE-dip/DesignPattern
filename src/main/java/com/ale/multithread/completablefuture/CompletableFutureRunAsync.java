package com.ale.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureRunAsync {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        CompletableFuture future = CompletableFuture.runAsync(() -> {
            System.out.println("Future running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Future done");
        });
        System.out.println("Main continue");
        future.join();
        System.out.println("Main done");
    }
}
