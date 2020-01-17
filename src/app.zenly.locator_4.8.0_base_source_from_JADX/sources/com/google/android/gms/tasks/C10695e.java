package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.e */
public final class C10695e {

    /* renamed from: a */
    public static final Executor f27791a = new C10696a();

    /* renamed from: b */
    static final Executor f27792b = new C10719z();

    /* renamed from: com.google.android.gms.tasks.e$a */
    private static final class C10696a implements Executor {

        /* renamed from: a */
        private final Handler f27793a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f27793a.post(runnable);
        }
    }
}
