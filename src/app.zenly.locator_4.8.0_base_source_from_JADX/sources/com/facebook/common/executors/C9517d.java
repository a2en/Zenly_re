package com.facebook.common.executors;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.executors.d */
public class C9517d extends AbstractExecutorService implements HandlerExecutorService {

    /* renamed from: a */
    private final Handler f24702a;

    public C9517d(Handler handler) {
        this.f24702a = handler;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        this.f24702a.post(runnable);
    }

    public boolean isHandlerThread() {
        return Thread.currentThread() == this.f24702a.getLooper().getThread();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void quit() {
        this.f24702a.getLooper().quit();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C9518e newTaskFor = newTaskFor(runnable, (T) null);
        this.f24702a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public <T> C9518e<T> newTaskFor(Runnable runnable, T t) {
        return new C9518e<>(this.f24702a, runnable, t);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C9518e newTaskFor = newTaskFor(callable);
        this.f24702a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    /* access modifiers changed from: protected */
    public <T> C9518e<T> newTaskFor(Callable<T> callable) {
        return new C9518e<>(this.f24702a, callable);
    }

    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            C9518e newTaskFor = newTaskFor(runnable, t);
            execute(newTaskFor);
            return newTaskFor;
        }
        throw new NullPointerException();
    }

    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable != null) {
            C9518e newTaskFor = newTaskFor(callable);
            execute(newTaskFor);
            return newTaskFor;
        }
        throw new NullPointerException();
    }
}
