package com.facebook.common.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.common.executors.c */
public class C9516c extends C9513b implements SerialExecutorService {
    public C9516c(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
