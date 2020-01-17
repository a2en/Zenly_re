package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.s */
final class C10712s<TResult> implements C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27821a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f27822b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnSuccessListener<? super TResult> f27823c;

    public C10712s(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f27821a = executor;
        this.f27823c = onSuccessListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f27821a.execute(new com.google.android.gms.tasks.C10713t(r2, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.C10693c<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo29320e()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f27822b
            monitor-enter(r0)
            com.google.android.gms.tasks.OnSuccessListener<? super TResult> r1 = r2.f27823c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f27821a
            com.google.android.gms.tasks.t r1 = new com.google.android.gms.tasks.t
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C10712s.onComplete(com.google.android.gms.tasks.c):void");
    }
}
