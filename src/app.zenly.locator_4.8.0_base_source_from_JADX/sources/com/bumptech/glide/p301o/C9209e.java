package com.bumptech.glide.p301o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.o.e */
public final class C9209e {

    /* renamed from: a */
    private static final Executor f23875a = new C9210a();

    /* renamed from: b */
    private static final Executor f23876b = new C9211b();

    /* renamed from: com.bumptech.glide.o.e$a */
    class C9210a implements Executor {

        /* renamed from: a */
        private final Handler f23877a = new Handler(Looper.getMainLooper());

        C9210a() {
        }

        public void execute(Runnable runnable) {
            this.f23877a.post(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.o.e$b */
    class C9211b implements Executor {
        C9211b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m22069a() {
        return f23876b;
    }

    /* renamed from: b */
    public static Executor m22070b() {
        return f23875a;
    }
}
