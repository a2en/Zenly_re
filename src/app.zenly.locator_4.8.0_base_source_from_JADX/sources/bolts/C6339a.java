package bolts;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.a */
final class C6339a {

    /* renamed from: b */
    private static final C6339a f15892b = new C6339a();

    /* renamed from: c */
    private static final int f15893c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d */
    static final int f15894d;

    /* renamed from: e */
    static final int f15895e;

    /* renamed from: a */
    private final Executor f15896a = new C6341b();

    /* renamed from: bolts.a$b */
    private static class C6341b implements Executor {
        private C6341b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int i = f15893c;
        f15894d = i + 1;
        f15895e = (i * 2) + 1;
    }

    private C6339a() {
    }

    /* renamed from: a */
    public static ExecutorService m17435a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f15894d, f15895e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m17436a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m17437b() {
        return f15892b.f15896a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m17436a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }
}
