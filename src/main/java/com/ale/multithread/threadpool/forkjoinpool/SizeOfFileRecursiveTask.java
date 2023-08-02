package com.ale.multithread.threadpool.forkjoinpool;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicReference;

public class SizeOfFileRecursiveTask extends RecursiveTask<Long> {
    private File file;

    public SizeOfFileRecursiveTask(String fileName) {
        this(new File(fileName));
    }

    public SizeOfFileRecursiveTask(File file) {
        this.file = Objects.requireNonNull(file);
    }

    @Override
    protected Long compute() {
        if(file.isFile()) {
            return file.length();
        }

        List<SizeOfFileRecursiveTask> sizeOfFileRecursiveTasks = new ArrayList<>();
        File[] children = file.listFiles();
        if(children != null) {
            Arrays.stream(children).forEach(f -> {
                SizeOfFileRecursiveTask sizeOfFileRecursiveTask = new SizeOfFileRecursiveTask(f);
                sizeOfFileRecursiveTask.fork();
                sizeOfFileRecursiveTasks.add(sizeOfFileRecursiveTask);
            });
        }
        AtomicReference<Long> reference = new AtomicReference<>(0L);
        sizeOfFileRecursiveTasks.forEach(sizeOfFileRecursiveTask -> {
            reference.set(reference.get() + sizeOfFileRecursiveTask.join());
        });

        return reference.get();
    }
}
