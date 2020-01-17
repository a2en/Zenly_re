package p389io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.fabric.sdk.android.services.concurrency.a */
public abstract class C12202a<Params, Progress, Result> {

    /* renamed from: j */
    private static final int f31730j = Runtime.getRuntime().availableProcessors();

    /* renamed from: k */
    private static final int f31731k;

    /* renamed from: l */
    private static final int f31732l;

    /* renamed from: m */
    private static final ThreadFactory f31733m = new C12203a();

    /* renamed from: n */
    private static final BlockingQueue<Runnable> f31734n = new LinkedBlockingQueue(128);

    /* renamed from: o */
    public static final Executor f31735o;

    /* renamed from: p */
    public static final Executor f31736p = new C12209g(null);

    /* renamed from: q */
    private static final C12208f f31737q = new C12208f();

    /* renamed from: e */
    private final C12212i<Params, Result> f31738e = new C12204b();

    /* renamed from: f */
    private final FutureTask<Result> f31739f = new C12205c(this.f31738e);

    /* renamed from: g */
    private volatile C12211h f31740g = C12211h.PENDING;

    /* renamed from: h */
    private final AtomicBoolean f31741h = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicBoolean f31742i = new AtomicBoolean();

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$a */
    static class C12203a implements ThreadFactory {

        /* renamed from: e */
        private final AtomicInteger f31743e = new AtomicInteger(1);

        C12203a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTask #");
            sb.append(this.f31743e.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$b */
    class C12204b extends C12212i<Params, Result> {
        C12204b() {
            super(null);
        }

        public Result call() throws Exception {
            C12202a.this.f31742i.set(true);
            Process.setThreadPriority(10);
            C12202a aVar = C12202a.this;
            Result a = aVar.mo36000a(this.f31757e);
            aVar.m32336d(a);
            return a;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$c */
    class C12205c extends FutureTask<Result> {
        C12205c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C12202a.this.m32337e(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C12202a.this.m32337e(null);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$d */
    static /* synthetic */ class C12206d {

        /* renamed from: a */
        static final /* synthetic */ int[] f31746a = new int[C12211h.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                io.fabric.sdk.android.services.concurrency.a$h[] r0 = p389io.fabric.sdk.android.services.concurrency.C12202a.C12211h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31746a = r0
                int[] r0 = f31746a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.concurrency.a$h r1 = p389io.fabric.sdk.android.services.concurrency.C12202a.C12211h.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f31746a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.concurrency.a$h r1 = p389io.fabric.sdk.android.services.concurrency.C12202a.C12211h.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.concurrency.C12202a.C12206d.<clinit>():void");
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$e */
    private static class C12207e<Data> {

        /* renamed from: a */
        final C12202a f31747a;

        /* renamed from: b */
        final Data[] f31748b;

        C12207e(C12202a aVar, Data... dataArr) {
            this.f31747a = aVar;
            this.f31748b = dataArr;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$f */
    private static class C12208f extends Handler {
        public C12208f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C12207e eVar = (C12207e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f31747a.m32335c(eVar.f31748b[0]);
            } else if (i == 2) {
                eVar.f31747a.mo36109b((Progress[]) eVar.f31748b);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$g */
    private static class C12209g implements Executor {

        /* renamed from: a */
        final LinkedList<Runnable> f31749a;

        /* renamed from: b */
        Runnable f31750b;

        /* renamed from: io.fabric.sdk.android.services.concurrency.a$g$a */
        class C12210a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Runnable f31751e;

            C12210a(Runnable runnable) {
                this.f31751e = runnable;
            }

            public void run() {
                try {
                    this.f31751e.run();
                } finally {
                    C12209g.this.mo36115a();
                }
            }
        }

        private C12209g() {
            this.f31749a = new LinkedList<>();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo36115a() {
            Runnable runnable = (Runnable) this.f31749a.poll();
            this.f31750b = runnable;
            if (runnable != null) {
                C12202a.f31735o.execute(this.f31750b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f31749a.offer(new C12210a(runnable));
            if (this.f31750b == null) {
                mo36115a();
            }
        }

        /* synthetic */ C12209g(C12203a aVar) {
            this();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$h */
    public enum C12211h {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: io.fabric.sdk.android.services.concurrency.a$i */
    private static abstract class C12212i<Params, Result> implements Callable<Result> {

        /* renamed from: e */
        Params[] f31757e;

        private C12212i() {
        }

        /* synthetic */ C12212i(C12203a aVar) {
            this();
        }
    }

    static {
        int i = f31730j;
        f31731k = i + 1;
        f31732l = (i * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f31731k, f31732l, 1, TimeUnit.SECONDS, f31734n, f31733m);
        f31735o = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m32336d(Result result) {
        f31737q.obtainMessage(1, new C12207e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m32337e(Result result) {
        if (!this.f31742i.get()) {
            m32336d(result);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo36000a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36002a(Result result);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36003b(Result result);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36109b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36004c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m32335c(Result result) {
        if (mo36110b()) {
            mo36002a(result);
        } else {
            mo36003b(result);
        }
        this.f31740g = C12211h.FINISHED;
    }

    /* renamed from: b */
    public final boolean mo36110b() {
        return this.f31741h.get();
    }

    /* renamed from: a */
    public final C12211h mo36106a() {
        return this.f31740g;
    }

    /* renamed from: a */
    public final boolean mo36108a(boolean z) {
        this.f31741h.set(true);
        return this.f31739f.cancel(z);
    }

    /* renamed from: a */
    public final C12202a<Params, Progress, Result> mo36107a(Executor executor, Params... paramsArr) {
        if (this.f31740g != C12211h.PENDING) {
            int i = C12206d.f31746a[this.f31740g.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f31740g = C12211h.RUNNING;
        mo36004c();
        this.f31738e.f31757e = paramsArr;
        executor.execute(this.f31739f);
        return this;
    }
}
