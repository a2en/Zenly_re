package p389io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.fabric.sdk.android.services.concurrency.i */
public class C12222i extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f31773a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f31774b;

    /* renamed from: c */
    private static final int f31775c;

    /* renamed from: io.fabric.sdk.android.services.concurrency.i$a */
    protected static final class C12223a implements ThreadFactory {

        /* renamed from: e */
        private final int f31776e;

        public C12223a(int i) {
            this.f31776e = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f31776e);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i = f31773a;
        f31774b = i + 1;
        f31775c = (i * 2) + 1;
    }

    <T extends Runnable & Dependency & Task & PriorityProvider> C12222i(int i, int i2, long j, TimeUnit timeUnit, C12213b<T> bVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, bVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & Dependency & Task & PriorityProvider> C12222i m32363a(int i, int i2) {
        C12222i iVar = new C12222i(i, i2, 1, TimeUnit.SECONDS, new C12213b(), new C12223a(10));
        return iVar;
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        Task task = (Task) runnable;
        task.setFinished(true);
        task.setError(th);
        getQueue().mo36119a();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C12221h.m32360a((Object) runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C12220g(runnable, t);
    }

    /* renamed from: a */
    public static C12222i m32362a() {
        return m32363a(f31774b, f31775c);
    }

    public C12213b getQueue() {
        return (C12213b) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C12220g(callable);
    }
}
