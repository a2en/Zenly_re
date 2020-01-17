package p214e.p222b.p223a.p224a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.b.a.a.b */
public class C7554b extends C7556c {

    /* renamed from: a */
    private final Object f18972a = new Object();

    /* renamed from: b */
    private final ExecutorService f18973b = Executors.newFixedThreadPool(4, new C7555a(this));

    /* renamed from: c */
    private volatile Handler f18974c;

    /* renamed from: e.b.a.a.b$a */
    class C7555a implements ThreadFactory {

        /* renamed from: e */
        private final AtomicInteger f18975e = new AtomicInteger(0);

        C7555a(C7554b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f18975e.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public void mo19435a(Runnable runnable) {
        this.f18973b.execute(runnable);
    }

    /* renamed from: c */
    public void mo19437c(Runnable runnable) {
        if (this.f18974c == null) {
            synchronized (this.f18972a) {
                if (this.f18974c == null) {
                    this.f18974c = m18223a(Looper.getMainLooper());
                }
            }
        }
        this.f18974c.post(runnable);
    }

    /* renamed from: a */
    public boolean mo19436a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    private static Handler m18223a(Looper looper) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
