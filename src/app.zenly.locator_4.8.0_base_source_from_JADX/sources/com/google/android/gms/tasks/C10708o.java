package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.o */
final class C10708o<TResult> implements C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f27812b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnCompleteListener<TResult> f27813c;

    public C10708o(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f27811a = executor;
        this.f27813c = onCompleteListener;
    }

    public final void onComplete(C10693c<TResult> cVar) {
        synchronized (this.f27812b) {
            if (this.f27813c != null) {
                this.f27811a.execute(new C10709p(this, cVar));
            }
        }
    }
}
