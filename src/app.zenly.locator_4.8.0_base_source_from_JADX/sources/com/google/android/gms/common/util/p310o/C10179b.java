package com.google.android.gms.common.util.p310o;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.o.b */
final class C10179b implements Runnable {

    /* renamed from: e */
    private final Runnable f26733e;

    /* renamed from: f */
    private final int f26734f;

    public C10179b(Runnable runnable, int i) {
        this.f26733e = runnable;
        this.f26734f = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f26734f);
        this.f26733e.run();
    }
}
