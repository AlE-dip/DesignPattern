package com.ale.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCompose {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Future done");
            return "1";
        })
                .thenCompose(s -> CompletableFuture.supplyAsync(() ->
                    Integer.parseInt(s)
                ));
        System.out.println("Main continue");
        future.join();
        System.out.println("Main done");
    }
}
