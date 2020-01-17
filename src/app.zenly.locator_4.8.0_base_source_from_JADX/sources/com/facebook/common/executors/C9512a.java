package com.facebook.common.executors;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.executors.a */
public class C9512a extends AbstractExecutorService {

    /* renamed from: a */
    private static final C9512a f24692a = new C9512a();

    private C9512a() {
    }

    /* renamed from: a */
    public static C9512a m23227a() {
        return f24692a;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
