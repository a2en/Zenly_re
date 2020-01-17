package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.m */
final class C10706m<TResult> implements C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27807a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f27808b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnCanceledListener f27809c;

    public C10706m(Executor executor, OnCanceledListener onCanceledListener) {
        this.f27807a = executor;
        this.f27809c = onCanceledListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f27807a.execute(new com.google.android.gms.tasks.C10707n(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.C10693c r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo29318c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f27808b
            monitor-enter(r2)
            com.google.android.gms.tasks.OnCanceledListener r0 = r1.f27809c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f27807a
            com.google.android.gms.tasks.n r0 = new com.google.android.gms.tasks.n
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C10706m.onComplete(com.google.android.gms.tasks.c):void");
    }
}
