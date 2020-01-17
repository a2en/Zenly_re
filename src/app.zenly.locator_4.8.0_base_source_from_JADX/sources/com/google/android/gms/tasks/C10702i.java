package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.i */
final class C10702i<TResult, TContinuationResult> implements C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27797a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Continuation<TResult, TContinuationResult> f27798b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10690a0<TContinuationResult> f27799c;

    public C10702i(Executor executor, Continuation<TResult, TContinuationResult> continuation, C10690a0<TContinuationResult> a0Var) {
        this.f27797a = executor;
        this.f27798b = continuation;
        this.f27799c = a0Var;
    }

    public final void onComplete(C10693c<TResult> cVar) {
        this.f27797a.execute(new C10703j(this, cVar));
    }
}
