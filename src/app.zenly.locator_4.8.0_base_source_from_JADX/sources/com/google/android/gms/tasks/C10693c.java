package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.c */
public abstract class C10693c<TResult> {
    /* renamed from: a */
    public C10693c<TResult> mo29299a(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract C10693c<TResult> mo29300a(OnFailureListener onFailureListener);

    /* renamed from: a */
    public abstract C10693c<TResult> mo29301a(OnSuccessListener<? super TResult> onSuccessListener);

    /* renamed from: a */
    public abstract C10693c<TResult> mo29306a(Executor executor, OnFailureListener onFailureListener);

    /* renamed from: a */
    public abstract C10693c<TResult> mo29307a(Executor executor, OnSuccessListener<? super TResult> onSuccessListener);

    /* renamed from: a */
    public abstract Exception mo29309a();

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo29310a(Class<X> cls) throws Throwable;

    /* renamed from: b */
    public <TContinuationResult> C10693c<TContinuationResult> mo29313b(Continuation<TResult, C10693c<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: b */
    public abstract TResult mo29315b();

    /* renamed from: c */
    public abstract boolean mo29318c();

    /* renamed from: d */
    public abstract boolean mo29319d();

    /* renamed from: e */
    public abstract boolean mo29320e();

    /* renamed from: a */
    public C10693c<TResult> mo29304a(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> C10693c<TContinuationResult> mo29314b(Executor executor, Continuation<TResult, C10693c<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C10693c<TContinuationResult> mo29298a(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C10693c<TContinuationResult> mo29303a(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C10693c<TContinuationResult> mo29302a(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C10693c<TContinuationResult> mo29308a(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
