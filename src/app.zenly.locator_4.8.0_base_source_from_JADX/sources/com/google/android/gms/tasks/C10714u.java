package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.u */
final class C10714u<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, C10716w<TResult> {

    /* renamed from: a */
    private final Executor f27826a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SuccessContinuation<TResult, TContinuationResult> f27827b;

    /* renamed from: c */
    private final C10690a0<TContinuationResult> f27828c;

    public C10714u(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation, C10690a0<TContinuationResult> a0Var) {
        this.f27826a = executor;
        this.f27827b = successContinuation;
        this.f27828c = a0Var;
    }

    public final void onCanceled() {
        this.f27828c.mo29321f();
    }

    public final void onComplete(C10693c<TResult> cVar) {
        this.f27826a.execute(new C10715v(this, cVar));
    }

    public final void onFailure(Exception exc) {
        this.f27828c.mo29311a(exc);
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f27828c.mo29312a(tcontinuationresult);
    }
}
