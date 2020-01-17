package com.facebook.common.executors;

import com.facebook.common.logging.C9543a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.executors.b */
public class C9513b extends AbstractExecutorService {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Class<?> f24693h = C9513b.class;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f24694a;

    /* renamed from: b */
    private final Executor f24695b;

    /* renamed from: c */
    private volatile int f24696c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BlockingQueue<Runnable> f24697d;

    /* renamed from: e */
    private final C9515b f24698e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicInteger f24699f;

    /* renamed from: g */
    private final AtomicInteger f24700g;

    /* renamed from: com.facebook.common.executors.b$b */
    private class C9515b implements Runnable {
        private C9515b() {
        }

        public void run() {
            String str = "%s: worker finished; %d workers left";
            try {
                Runnable runnable = (Runnable) C9513b.this.f24697d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C9543a.m23313b(C9513b.f24693h, "%s: Worker has nothing to run", (Object) C9513b.this.f24694a);
                }
            } finally {
                int decrementAndGet = C9513b.this.f24699f.decrementAndGet();
                if (!C9513b.this.f24697d.isEmpty()) {
                    C9513b.this.m23231b();
                } else {
                    C9543a.m23302a(C9513b.f24693h, str, (Object) C9513b.this.f24694a, (Object) Integer.valueOf(decrementAndGet));
                }
            }
        }
    }

    public C9513b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        if (i > 0) {
            this.f24694a = str;
            this.f24695b = executor;
            this.f24696c = i;
            this.f24697d = blockingQueue;
            this.f24698e = new C9515b();
            this.f24699f = new AtomicInteger(0);
            this.f24700g = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f24697d.offer(runnable)) {
            int size = this.f24697d.size();
            int i = this.f24700g.get();
            if (size > i && this.f24700g.compareAndSet(i, size)) {
                C9543a.m23302a(f24693h, "%s: max pending work in queue = %d", (Object) this.f24694a, (Object) Integer.valueOf(size));
            }
            m23231b();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24694a);
            sb.append(" queue is full, size=");
            sb.append(this.f24697d.size());
            throw new RejectedExecutionException(sb.toString());
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m23231b() {
        int i = this.f24699f.get();
        while (i < this.f24696c) {
            int i2 = i + 1;
            if (this.f24699f.compareAndSet(i, i2)) {
                C9543a.m23303a(f24693h, "%s: starting worker %d of %d", this.f24694a, Integer.valueOf(i2), Integer.valueOf(this.f24696c));
                this.f24695b.execute(this.f24698e);
                return;
            }
            C9543a.m23313b(f24693h, "%s: race in startWorkerIfNeeded; retrying", (Object) this.f24694a);
            i = this.f24699f.get();
        }
    }
}
