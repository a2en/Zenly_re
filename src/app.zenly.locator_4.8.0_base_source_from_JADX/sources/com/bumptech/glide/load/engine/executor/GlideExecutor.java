package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class GlideExecutor implements ExecutorService {

    /* renamed from: b */
    private static final long f23336b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static volatile int f23337c;

    /* renamed from: a */
    private final ExecutorService f23338a;

    public interface UncaughtThrowableStrategy {

        /* renamed from: a */
        public static final UncaughtThrowableStrategy f23339a = new C8960b();

        /* renamed from: b */
        public static final UncaughtThrowableStrategy f23340b = f23339a;

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$a */
        class C8959a implements UncaughtThrowableStrategy {
            C8959a() {
            }

            public void handle(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$b */
        class C8960b implements UncaughtThrowableStrategy {
            C8960b() {
            }

            public void handle(Throwable th) {
                if (th != null) {
                    String str = "GlideExecutor";
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$c */
        class C8961c implements UncaughtThrowableStrategy {
            C8961c() {
            }

            public void handle(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            new C8959a();
            new C8961c();
        }

        void handle(Throwable th);
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$a */
    private static final class C8962a implements ThreadFactory {

        /* renamed from: e */
        private final String f23341e;

        /* renamed from: f */
        final UncaughtThrowableStrategy f23342f;

        /* renamed from: g */
        final boolean f23343g;

        /* renamed from: h */
        private int f23344h;

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$a$a */
        class C8963a extends Thread {
            C8963a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C8962a.this.f23343g) {
                    StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C8962a.this.f23342f.handle(th);
                }
            }
        }

        C8962a(String str, UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z) {
            this.f23341e = str;
            this.f23342f = uncaughtThrowableStrategy;
            this.f23343g = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C8963a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append("glide-");
            sb.append(this.f23341e);
            sb.append("-thread-");
            sb.append(this.f23344h);
            aVar = new C8963a(runnable, sb.toString());
            this.f23344h++;
            return aVar;
        }
    }

    GlideExecutor(ExecutorService executorService) {
        this.f23338a = executorService;
    }

    /* renamed from: a */
    public static GlideExecutor m21514a(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8962a(str, uncaughtThrowableStrategy, true));
        return new GlideExecutor(threadPoolExecutor);
    }

    /* renamed from: b */
    public static GlideExecutor m21516b(int i, String str, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8962a(str, uncaughtThrowableStrategy, false));
        return new GlideExecutor(threadPoolExecutor);
    }

    /* renamed from: c */
    public static GlideExecutor m21517c() {
        return m21514a(1, "disk-cache", UncaughtThrowableStrategy.f23340b);
    }

    /* renamed from: d */
    public static GlideExecutor m21518d() {
        return m21516b(m21512a(), "source", UncaughtThrowableStrategy.f23340b);
    }

    /* renamed from: e */
    public static GlideExecutor m21519e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f23336b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C8962a("source-unlimited", UncaughtThrowableStrategy.f23340b, false));
        return new GlideExecutor(threadPoolExecutor);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f23338a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f23338a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f23338a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f23338a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f23338a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f23338a.isTerminated();
    }

    public void shutdown() {
        this.f23338a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f23338a.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f23338a.submit(runnable);
    }

    public String toString() {
        return this.f23338a.toString();
    }

    /* renamed from: a */
    public static GlideExecutor m21513a(int i, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8962a("animation", uncaughtThrowableStrategy, true));
        return new GlideExecutor(threadPoolExecutor);
    }

    /* renamed from: b */
    public static GlideExecutor m21515b() {
        return m21513a(m21512a() >= 4 ? 2 : 1, UncaughtThrowableStrategy.f23340b);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f23338a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f23338a.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f23338a.submit(runnable, t);
    }

    /* renamed from: a */
    public static int m21512a() {
        if (f23337c == 0) {
            f23337c = Math.min(4, C8964a.m21520a());
        }
        return f23337c;
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f23338a.submit(callable);
    }
}
