package com.ale.multithread.threadpool.forkjoinpool;

import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

@Data
public class SizeOfFileRecursiveAction extends RecursiveAction {
    private File file;
    private AtomicLong atomicLong;

    public SizeOfFileRecursiveAction(String fileName, AtomicLong atomicLong) {
        this(new File(fileName), atomicLong);
    }

    public SizeOfFileRecursiveAction(File file, AtomicLong atomicLong) {
        this.file = Objects.requireNonNull(file);
        this.atomicLong = Objects.requireNonNull(atomicLong);
    }

    @Override
    protected void compute() {
        if(file.isFile()) {
            atomicLong.getAndAdd(file.length());
        } else {
            File[] children = file.listFiles();
            if(children != null) {
                Arrays.stream(children).forEach(f -> {
                    SizeOfFileRecursiveAction sizeOfFileRecursiveTask = new SizeOfFileRecursiveAction(f, atomicLong);
                    ForkJoinTask.invokeAll(sizeOfFileRecursiveTask);
                });
            }
        }
    }
}
