package com.evernote.android.job;

import android.os.Build.VERSION;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.Clock;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.evernote.android.job.d */
public final class C9441d {

    /* renamed from: a */
    private static final EnumMap<C9439c, Boolean> f24435a = new EnumMap<>(C9439c.class);

    /* renamed from: b */
    private static final ExecutorService f24436b = Executors.newCachedThreadPool(new C9442a());

    /* renamed from: c */
    private static volatile boolean f24437c;

    /* renamed from: d */
    private static volatile boolean f24438d = false;

    /* renamed from: e */
    private static volatile long f24439e = 3000;

    /* renamed from: f */
    private static volatile boolean f24440f = false;

    /* renamed from: g */
    private static volatile int f24441g = 0;

    /* renamed from: h */
    private static volatile boolean f24442h = false;

    /* renamed from: i */
    private static volatile Clock f24443i = Clock.f24524a;

    /* renamed from: j */
    private static volatile ExecutorService f24444j = f24436b;

    /* renamed from: com.evernote.android.job.d$a */
    static class C9442a implements ThreadFactory {

        /* renamed from: e */
        private final AtomicInteger f24445e = new AtomicInteger();

        C9442a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AndroidJob-");
            sb.append(this.f24445e.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        new C9469c("JobConfig");
        for (C9439c put : C9439c.values()) {
            f24435a.put(put, Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public static boolean m22854a(C9439c cVar) {
        return ((Boolean) f24435a.get(cVar)).booleanValue();
    }

    /* renamed from: b */
    public static ExecutorService m22855b() {
        return f24444j;
    }

    /* renamed from: c */
    public static int m22856c() {
        return f24441g;
    }

    /* renamed from: d */
    public static long m22857d() {
        return f24439e;
    }

    /* renamed from: e */
    public static boolean m22858e() {
        return f24437c && VERSION.SDK_INT < 24;
    }

    /* renamed from: f */
    public static boolean m22859f() {
        return f24438d;
    }

    /* renamed from: g */
    public static boolean m22860g() {
        return f24442h;
    }

    /* renamed from: h */
    static boolean m22861h() {
        return f24440f;
    }

    /* renamed from: a */
    public static Clock m22853a() {
        return f24443i;
    }
}
