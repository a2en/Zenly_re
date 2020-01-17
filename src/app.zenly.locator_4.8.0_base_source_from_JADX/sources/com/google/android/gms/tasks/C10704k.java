package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.k */
final class C10704k<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27802a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Continuation<TResult, C10693c<TContinuationResult>> f27803b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10690a0<TContinuationResult> f27804c;

    public C10704k(Executor executor, Continuation<TResult, C10693c<TContinuationResult>> continuation, C10690a0<TContinuationResult> a0Var) {
        this.f27802a = executor;
        this.f27803b = continuation;
        this.f27804c = a0Var;
    }

    public final void onCanceled() {
        this.f27804c.mo29321f();
    }

    public final void onComplete(C10693c<TResult> cVar) {
        this.f27802a.execute(new C10705l(this, cVar));
    }

    public final void onFailure(Exception exc) {
        this.f27804c.mo29311a(exc);
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f27804c.mo29312a(tcontinuationresult);
    }
}
