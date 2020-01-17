package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13111r;

/* renamed from: kotlinx.coroutines.y */
public final class C13157y<T> extends C13052a0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: g */
    public Object f33761g = C13159z.f33768a;

    /* renamed from: h */
    private final CoroutineStackFrame f33762h;

    /* renamed from: i */
    public final Object f33763i;

    /* renamed from: j */
    public final C13128o f33764j;

    /* renamed from: k */
    public final Continuation<T> f33765k;

    public C13157y(C13128o oVar, Continuation<? super T> continuation) {
        C12932j.m33818b(oVar, "dispatcher");
        C12932j.m33818b(continuation, "continuation");
        super(0);
        this.f33764j = oVar;
        this.f33765k = continuation;
        Continuation<T> continuation2 = this.f33765k;
        if (!(continuation2 instanceof CoroutineStackFrame)) {
            continuation2 = null;
        }
        this.f33762h = (CoroutineStackFrame) continuation2;
        this.f33763i = C13111r.m34224a(getContext());
    }

    /* renamed from: a */
    public Continuation<T> mo37486a() {
        return this;
    }

    /* renamed from: b */
    public Object mo37489b() {
        Object obj = this.f33761g;
        if (C13149u.m34325a()) {
            if (!(obj != C13159z.f33768a)) {
                throw new AssertionError();
            }
        }
        this.f33761g = C13159z.f33768a;
        return obj;
    }

    public CoroutineStackFrame getCallerFrame() {
        return this.f33762h;
    }

    public CoroutineContext getContext() {
        return this.f33765k.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(Object obj) {
        CoroutineContext context;
        Object b;
        CoroutineContext context2 = this.f33765k.getContext();
        Object a = C13120k.m34249a(obj);
        if (this.f33764j.mo37496a(context2)) {
            this.f33761g = a;
            this.f33631f = 0;
            this.f33764j.mo37495a(context2, this);
            return;
        }
        C13069d0 a2 = C13160z0.f33770b.mo37696a();
        if (a2.mo37541b()) {
            this.f33761g = a;
            this.f33631f = 0;
            a2.mo37538a((C13052a0<?>) this);
            return;
        }
        a2.mo37540b(true);
        try {
            context = getContext();
            b = C13111r.m34226b(context, this.f33763i);
            this.f33765k.resumeWith(obj);
            C12956q qVar = C12956q.f33541a;
            C13111r.m34225a(context, b);
            do {
            } while (a2.mo37543d());
        } catch (Throwable th) {
            try {
                mo37488a(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo37539a(true);
                throw th2;
            }
        }
        a2.mo37539a(true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.f33764j);
        sb.append(", ");
        sb.append(C13151v.m34330a(this.f33765k));
        sb.append(']');
        return sb.toString();
    }
}
