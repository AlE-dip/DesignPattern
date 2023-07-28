package com.ale.designpattern.creationalpattern.singleton;

import com.ale.designpattern.DesignPatternApplication;
import com.ale.designpattern.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.util.Assert;

public class Main {
    public static void main(String[] args) {
        //Eager Initialization
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        eagerInitialization1.setName("test");
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        Assert.isTrue(eagerInitialization1.getName().equals(eagerInitialization2.getName()), Message.toast());
        Assert.isTrue(eagerInitialization1 == eagerInitialization2, Message.toast());

        //Lazy Initialization
        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        lazyInitialization1.setName("test");
        LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
        Assert.isTrue(lazyInitialization1.getName().equals(lazyInitialization2.getName()), Message.toast());
        Assert.isTrue(lazyInitialization1 == lazyInitialization2, Message.toast());

        //Thread Safe
        ThreadSafe threadSafe = ThreadSafe.getInstance();
        threadSafe.setName("Test");
        new Thread(() -> {
            ThreadSafe threadSafe1 = ThreadSafe.getInstance();
            Assert.isTrue(threadSafe1.getName().equals("Test"), Message.toast());
        }).start();

        //Double Check Locking
        DoubleCheckLocking doubleCheckLocking = DoubleCheckLocking.getInstance();
        doubleCheckLocking.setName("Test");
        new Thread(() -> {
            DoubleCheckLocking doubleCheckLocking1 = DoubleCheckLocking.getInstance();
            Assert.isTrue(doubleCheckLocking1.getName().equals("Test"), Message.toast());
        }).start();
    }
}
