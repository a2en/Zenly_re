package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.q */
final class C10710q<TResult> implements C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27816a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f27817b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnFailureListener f27818c;

    public C10710q(Executor executor, OnFailureListener onFailureListener) {
        this.f27816a = executor;
        this.f27818c = onFailureListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f27816a.execute(new com.google.android.gms.tasks.C10711r(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.C10693c<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo29320e()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo29318c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f27817b
            monitor-enter(r0)
            com.google.android.gms.tasks.OnFailureListener r1 = r2.f27818c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f27816a
            com.google.android.gms.tasks.r r1 = new com.google.android.gms.tasks.r
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C10710q.onComplete(com.google.android.gms.tasks.c):void");
    }
}
