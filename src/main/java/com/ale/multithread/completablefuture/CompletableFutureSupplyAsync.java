package com.ale.multithread.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureSupplyAsync {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Future done");
            return "Complete";
        })
                .thenApply(s -> {
                    if(s.equals("Complete")) return true;
                    return false;
                })
                .thenAccept(aBoolean -> {
                    System.out.println(aBoolean);
                });
        System.out.println("Main continue");
        future.join();
        System.out.println("Main done");
    }
}
