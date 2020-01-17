package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.common.executors.e */
public class C9518e<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: e */
    private final FutureTask<V> f24703e;

    public C9518e(Handler handler, Callable<V> callable) {
        this.f24703e = new FutureTask<>(callable);
    }

    /* renamed from: a */
    public int mo25642a(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z) {
        return this.f24703e.cancel(z);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        mo25642a((Delayed) obj);
        throw null;
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.f24703e.get();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.f24703e.isCancelled();
    }

    public boolean isDone() {
        return this.f24703e.isDone();
    }

    public void run() {
        this.f24703e.run();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f24703e.get(j, timeUnit);
    }

    public C9518e(Handler handler, Runnable runnable, V v) {
        this.f24703e = new FutureTask<>(runnable, v);
    }
}
