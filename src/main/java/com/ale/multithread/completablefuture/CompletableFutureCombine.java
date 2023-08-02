package com.ale.multithread.completablefuture;

import com.ale.designpattern.creational.prototype.User;

import java.lang.invoke.TypeDescriptor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

public class CompletableFutureCombine {
    private static int data;
    public static void main(String[] args) {
        System.out.println("Main starting...");
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future1 running...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Future1 done");
            return 10;
        });
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future2 running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Future2 done");
            return 20;
        });
        CompletableFuture<Void> future = future1.thenCombine(future2, (integer1, integer2) -> {
            return integer1 * integer2;
        })
                .thenAccept(integer -> {
                    System.out.println("Combine: " + integer);
                });

        System.out.println("Main continue");
        future.join();
        System.out.println("Main done");
        List<Integer> list = List.of(1, 2,3,4,5,6,7);
        AtomicReference<String> a = new AtomicReference<>("A: ");
        System.out.println(list.parallelStream()
                .map(String::valueOf)
                .reduce((s, s2) -> s + " " + s2));
//                .toList()
//                .forEach(System.out::println);

        System.out.println(data);

    }

}
