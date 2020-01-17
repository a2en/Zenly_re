package app.zenly.locator.core.app;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: app.zenly.locator.core.app.e */
public class C2454e {

    /* renamed from: a */
    private static final Handler f7357a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final Executor f7358b;

    /* renamed from: c */
    private static final ExecutorService f7359c = Executors.newFixedThreadPool(2);

    /* renamed from: d */
    private static final Executor f7360d;

    static {
        Handler handler = f7357a;
        handler.getClass();
        f7358b = new C2449a(handler);
        ExecutorService executorService = f7359c;
        executorService.getClass();
        f7360d = new C2450b(executorService);
    }

    /* renamed from: a */
    public static Executor m8569a() {
        return f7360d;
    }

    /* renamed from: b */
    public static Executor m8570b() {
        return f7358b;
    }
}
