package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C10123l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.a0 */
final class C10690a0<TResult> extends C10693c<TResult> {

    /* renamed from: a */
    private final Object f27781a = new Object();

    /* renamed from: b */
    private final C10717x<TResult> f27782b = new C10717x<>();

    /* renamed from: c */
    private boolean f27783c;

    /* renamed from: d */
    private volatile boolean f27784d;

    /* renamed from: e */
    private TResult f27785e;

    /* renamed from: f */
    private Exception f27786f;

    C10690a0() {
    }

    /* renamed from: g */
    private final void m27206g() {
        C10123l.m25517b(this.f27783c, "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m27207h() {
        C10123l.m25517b(!this.f27783c, "Task is already complete");
    }

    /* renamed from: i */
    private final void m27208i() {
        if (this.f27784d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m27209j() {
        synchronized (this.f27781a) {
            if (this.f27783c) {
                this.f27782b.mo29342a((C10693c<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo29310a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f27781a) {
            m27206g();
            m27208i();
            if (cls.isInstance(this.f27786f)) {
                throw ((Throwable) cls.cast(this.f27786f));
            } else if (this.f27786f == null) {
                tresult = this.f27785e;
            } else {
                throw new RuntimeExecutionException(this.f27786f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final TResult mo29315b() {
        TResult tresult;
        synchronized (this.f27781a) {
            m27206g();
            m27208i();
            if (this.f27786f == null) {
                tresult = this.f27785e;
            } else {
                throw new RuntimeExecutionException(this.f27786f);
            }
        }
        return tresult;
    }

    /* renamed from: c */
    public final boolean mo29318c() {
        return this.f27784d;
    }

    /* renamed from: d */
    public final boolean mo29319d() {
        boolean z;
        synchronized (this.f27781a) {
            z = this.f27783c;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo29320e() {
        boolean z;
        synchronized (this.f27781a) {
            z = this.f27783c && !this.f27784d && this.f27786f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo29321f() {
        synchronized (this.f27781a) {
            if (this.f27783c) {
                return false;
            }
            this.f27783c = true;
            this.f27784d = true;
            this.f27782b.mo29342a((C10693c<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29313b(Continuation<TResult, C10693c<TContinuationResult>> continuation) {
        return mo29314b(C10695e.f27791a, continuation);
    }

    /* renamed from: b */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29314b(Executor executor, Continuation<TResult, C10693c<TContinuationResult>> continuation) {
        C10690a0 a0Var = new C10690a0();
        this.f27782b.mo29343a((C10716w<TResult>) new C10704k<TResult>(executor, continuation, a0Var));
        m27209j();
        return a0Var;
    }

    /* renamed from: a */
    public final Exception mo29309a() {
        Exception exc;
        synchronized (this.f27781a) {
            exc = this.f27786f;
        }
        return exc;
    }

    /* renamed from: b */
    public final boolean mo29317b(TResult tresult) {
        synchronized (this.f27781a) {
            if (this.f27783c) {
                return false;
            }
            this.f27783c = true;
            this.f27785e = tresult;
            this.f27782b.mo29342a((C10693c<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29301a(OnSuccessListener<? super TResult> onSuccessListener) {
        mo29307a(C10695e.f27791a, onSuccessListener);
        return this;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29307a(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f27782b.mo29343a((C10716w<TResult>) new C10712s<TResult>(executor, onSuccessListener));
        m27209j();
        return this;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29300a(OnFailureListener onFailureListener) {
        mo29306a(C10695e.f27791a, onFailureListener);
        return this;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29306a(Executor executor, OnFailureListener onFailureListener) {
        this.f27782b.mo29343a((C10716w<TResult>) new C10710q<TResult>(executor, onFailureListener));
        m27209j();
        return this;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29299a(OnCompleteListener<TResult> onCompleteListener) {
        mo29305a(C10695e.f27791a, onCompleteListener);
        return this;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29305a(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f27782b.mo29343a((C10716w<TResult>) new C10708o<TResult>(executor, onCompleteListener));
        m27209j();
        return this;
    }

    /* renamed from: b */
    public final boolean mo29316b(Exception exc) {
        C10123l.m25506a(exc, (Object) "Exception must not be null");
        synchronized (this.f27781a) {
            if (this.f27783c) {
                return false;
            }
            this.f27783c = true;
            this.f27786f = exc;
            this.f27782b.mo29342a((C10693c<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29298a(Continuation<TResult, TContinuationResult> continuation) {
        return mo29303a(C10695e.f27791a, continuation);
    }

    /* renamed from: a */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29303a(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        C10690a0 a0Var = new C10690a0();
        this.f27782b.mo29343a((C10716w<TResult>) new C10702i<TResult>(executor, continuation, a0Var));
        m27209j();
        return a0Var;
    }

    /* renamed from: a */
    public final C10693c<TResult> mo29304a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f27782b.mo29343a((C10716w<TResult>) new C10706m<TResult>(executor, onCanceledListener));
        m27209j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29308a(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        C10690a0 a0Var = new C10690a0();
        this.f27782b.mo29343a((C10716w<TResult>) new C10714u<TResult>(executor, successContinuation, a0Var));
        m27209j();
        return a0Var;
    }

    /* renamed from: a */
    public final <TContinuationResult> C10693c<TContinuationResult> mo29302a(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        return mo29308a(C10695e.f27791a, successContinuation);
    }

    /* renamed from: a */
    public final void mo29312a(TResult tresult) {
        synchronized (this.f27781a) {
            m27207h();
            this.f27783c = true;
            this.f27785e = tresult;
        }
        this.f27782b.mo29342a((C10693c<TResult>) this);
    }

    /* renamed from: a */
    public final void mo29311a(Exception exc) {
        C10123l.m25506a(exc, (Object) "Exception must not be null");
        synchronized (this.f27781a) {
            m27207h();
            this.f27783c = true;
            this.f27786f = exc;
        }
        this.f27782b.mo29342a((C10693c<TResult>) this);
    }
}
