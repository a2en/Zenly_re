package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.Job.C13048a;
import kotlinx.coroutines.internal.C13106m;

/* renamed from: kotlinx.coroutines.e */
public class C13070e<T> extends C13052a0<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* renamed from: i */
    private static final AtomicIntegerFieldUpdater f33649i = AtomicIntegerFieldUpdater.newUpdater(C13070e.class, "_decision");

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f33650j = AtomicReferenceFieldUpdater.newUpdater(C13070e.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _state = C13051a.f33630e;

    /* renamed from: g */
    private final CoroutineContext f33651g = this.f33652h.getContext();

    /* renamed from: h */
    private final Continuation<T> f33652h;
    private volatile DisposableHandle parentHandle;

    public C13070e(Continuation<? super T> continuation, int i) {
        C12932j.m33818b(continuation, "delegate");
        super(i);
        this.f33652h = continuation;
    }

    /* renamed from: f */
    private final void m34103f() {
        DisposableHandle disposableHandle = this.parentHandle;
        if (disposableHandle != null) {
            disposableHandle.dispose();
            this.parentHandle = C13152v0.f33756e;
        }
    }

    /* renamed from: g */
    private final void m34104g() {
        if (!isCompleted()) {
            Job job = (Job) this.f33652h.getContext().get(Job.f33627d);
            if (job != null) {
                job.start();
                DisposableHandle a = C13048a.m34061a(job, true, false, new C13080h(job, this), 2, null);
                this.parentHandle = a;
                if (isCompleted()) {
                    a.dispose();
                    this.parentHandle = C13152v0.f33756e;
                }
            }
        }
    }

    /* renamed from: h */
    private final boolean m34105h() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f33649i.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: i */
    private final boolean m34106i() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f33649i.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public final Continuation<T> mo37486a() {
        return this.f33652h;
    }

    /* renamed from: b */
    public Object mo37489b() {
        return mo37547d();
    }

    /* renamed from: c */
    public final Object mo37546c() {
        m34104g();
        if (m34106i()) {
            return C12882d.m33726a();
        }
        Object d = mo37547d();
        if (!(d instanceof C13118j)) {
            if (this.f33631f == 1) {
                Job job = (Job) getContext().get(Job.f33627d);
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    mo37487a(d, (Throwable) cancellationException);
                    throw C13106m.m34208a(cancellationException, (Continuation<?>) this);
                }
            }
            return mo37490b(d);
        }
        throw C13106m.m34208a(((C13118j) d).f33714a, (Continuation<?>) this);
    }

    public boolean cancel(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            z = obj instanceof C13063c;
        } while (!f33650j.compareAndSet(this, obj, new C13078g(this, th, z)));
        if (z) {
            try {
                ((C13063c) obj).mo37503a(th);
            } catch (Throwable th2) {
                CoroutineContext context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13132q.m34262a(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        }
        m34103f();
        m34100a(0);
        return true;
    }

    public void completeResume(Object obj) {
        C12932j.m33818b(obj, "token");
        m34100a(this.f33631f);
    }

    /* renamed from: d */
    public final Object mo37547d() {
        return this._state;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo37548e() {
        return "CancellableContinuation";
    }

    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f33652h;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    public CoroutineContext getContext() {
        return this.f33651g;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public /* synthetic */ void initCancellability() {
    }

    public void invokeOnCancellation(Function1<? super Throwable, C12956q> function1) {
        Object obj;
        C12932j.m33818b(function1, "handler");
        Throwable th = null;
        Object obj2 = null;
        do {
            obj = this._state;
            if (obj instanceof C13051a) {
                if (obj2 == null) {
                    obj2 = m34098a(function1);
                }
            } else if (obj instanceof C13063c) {
                m34101a(function1, obj);
                throw null;
            } else if (!(obj instanceof C13078g)) {
                return;
            } else {
                if (((C13078g) obj).mo37628a()) {
                    try {
                        if (!(obj instanceof C13118j)) {
                            obj = null;
                        }
                        C13118j jVar = (C13118j) obj;
                        if (jVar != null) {
                            th = jVar.f33714a;
                        }
                        function1.invoke(th);
                    } catch (Throwable th2) {
                        CoroutineContext context = getContext();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in cancellation handler for ");
                        sb.append(this);
                        C13132q.m34262a(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
                    }
                    return;
                }
                m34101a(function1, obj);
                throw null;
            }
        } while (!f33650j.compareAndSet(this, obj, obj2));
    }

    public boolean isActive() {
        return mo37547d() instanceof NotCompleted;
    }

    public boolean isCancelled() {
        return mo37547d() instanceof C13078g;
    }

    public boolean isCompleted() {
        return !(mo37547d() instanceof NotCompleted);
    }

    public void resume(T t, Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(function1, "onCancellation");
        C13078g a = m34099a((Object) new C13124m(t, function1), this.f33631f);
        if (a != null) {
            try {
                function1.invoke(a.f33714a);
            } catch (Throwable th) {
                CoroutineContext context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13132q.m34262a(context, (Throwable) new CompletionHandlerException(sb.toString(), th));
            }
        }
    }

    public void resumeUndispatched(C13128o oVar, T t) {
        C12932j.m33818b(oVar, "$this$resumeUndispatched");
        Continuation<T> continuation = this.f33652h;
        C13128o oVar2 = null;
        if (!(continuation instanceof C13157y)) {
            continuation = null;
        }
        C13157y yVar = (C13157y) continuation;
        if (yVar != null) {
            oVar2 = yVar.f33764j;
        }
        m34099a((Object) t, oVar2 == oVar ? 3 : this.f33631f);
    }

    public void resumeUndispatchedWithException(C13128o oVar, Throwable th) {
        C12932j.m33818b(oVar, "$this$resumeUndispatchedWithException");
        C12932j.m33818b(th, "exception");
        Continuation<T> continuation = this.f33652h;
        C13128o oVar2 = null;
        if (!(continuation instanceof C13157y)) {
            continuation = null;
        }
        C13157y yVar = (C13157y) continuation;
        C13118j jVar = new C13118j(th, false, 2, null);
        if (yVar != null) {
            oVar2 = yVar.f33764j;
        }
        m34099a((Object) jVar, oVar2 == oVar ? 3 : this.f33631f);
    }

    public void resumeWith(Object obj) {
        m34099a(C13120k.m34249a(obj), this.f33631f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37548e());
        sb.append('(');
        sb.append(C13151v.m34330a(this.f33652h));
        sb.append("){");
        sb.append(mo37547d());
        sb.append("}@");
        sb.append(C13151v.m34331b(this));
        return sb.toString();
    }

    public Object tryResume(T t, Object obj) {
        Object obj2;
        T t2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof NotCompleted)) {
                NotCompleted notCompleted = null;
                if (obj2 instanceof C13122l) {
                    C13122l lVar = (C13122l) obj2;
                    if (lVar.f33716a == obj) {
                        if (C13149u.m34325a()) {
                            if (!(lVar.f33717b == t)) {
                                throw new AssertionError();
                            }
                        }
                        notCompleted = lVar.f33718c;
                    }
                }
                return notCompleted;
            } else if (obj == null) {
                t2 = t;
            } else {
                t2 = new C13122l(obj, t, (NotCompleted) obj2);
            }
        } while (!f33650j.compareAndSet(this, obj2, t2));
        m34103f();
        return obj2;
    }

    public Object tryResumeWithException(Throwable th) {
        Object obj;
        C12932j.m33818b(th, "exception");
        do {
            obj = this._state;
            if (!(obj instanceof NotCompleted)) {
                return null;
            }
        } while (!f33650j.compareAndSet(this, obj, new C13118j(th, false, 2, null)));
        m34103f();
        return obj;
    }

    /* renamed from: a */
    public void mo37487a(Object obj, Throwable th) {
        C12932j.m33818b(th, "cause");
        if (obj instanceof C13124m) {
            try {
                ((C13124m) obj).f33722b.invoke(th);
            } catch (Throwable th2) {
                CoroutineContext context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                C13132q.m34262a(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        }
    }

    /* renamed from: b */
    public <T> T mo37490b(Object obj) {
        if (obj instanceof C13122l) {
            return ((C13122l) obj).f33717b;
        }
        return obj instanceof C13124m ? ((C13124m) obj).f33721a : obj;
    }

    /* renamed from: a */
    public Throwable mo37545a(Job job) {
        C12932j.m33818b(job, "parent");
        return job.getCancellationException();
    }

    /* renamed from: a */
    private final void m34101a(Function1<? super Throwable, C12956q> function1, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(function1);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final C13063c m34098a(Function1<? super Throwable, C12956q> function1) {
        return function1 instanceof C13063c ? (C13063c) function1 : new C13121k0(function1);
    }

    /* renamed from: a */
    private final void m34100a(int i) {
        if (!m34105h()) {
            C13159z.m34350a((C13052a0<? super T>) this, i);
        }
    }

    /* renamed from: a */
    private final C13078g m34099a(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof C13078g) {
                    C13078g gVar = (C13078g) obj2;
                    if (gVar.mo37573b()) {
                        return gVar;
                    }
                }
                m34102c(obj);
                throw null;
            }
        } while (!f33650j.compareAndSet(this, obj2, obj));
        m34103f();
        m34100a(i);
        return null;
    }

    /* renamed from: c */
    private final void m34102c(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
}
