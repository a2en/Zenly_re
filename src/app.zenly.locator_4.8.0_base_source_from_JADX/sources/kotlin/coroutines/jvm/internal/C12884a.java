package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.jvm.internal.a */
public abstract class C12884a implements Continuation<Object>, CoroutineStackFrame, Serializable {

    /* renamed from: e */
    private final Continuation<Object> f33458e;

    public C12884a(Continuation<Object> continuation) {
        this.f33458e = continuation;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo37176a(Object obj);

    /* renamed from: a */
    public final Continuation<Object> mo37188a() {
        return this.f33458e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37191b() {
    }

    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.f33458e;
        if (!(continuation instanceof CoroutineStackFrame)) {
            continuation = null;
        }
        return (CoroutineStackFrame) continuation;
    }

    public StackTraceElement getStackTraceElement() {
        return C12888e.m33742c(this);
    }

    public final void resumeWith(Object obj) {
        Object obj2 = obj;
        C12884a aVar = this;
        while (true) {
            C12889f.m33744b(aVar);
            Continuation<Object> continuation = aVar.f33458e;
            if (continuation != null) {
                try {
                    obj2 = aVar.mo37176a(obj2);
                    if (obj2 != C12882d.m33726a()) {
                        C12919a aVar2 = C12918j.f33499e;
                        C12918j.m33783a(obj2);
                        aVar.mo37191b();
                        if (continuation instanceof C12884a) {
                            aVar = (C12884a) continuation;
                        } else {
                            continuation.resumeWith(obj2);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C12919a aVar3 = C12918j.f33499e;
                    obj2 = C12949k.m33848a(th);
                    C12918j.m33783a(obj2);
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    /* renamed from: a */
    public Continuation<C12956q> mo37190a(Continuation<?> continuation) {
        C12932j.m33818b(continuation, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* renamed from: a */
    public Continuation<C12956q> mo37189a(Object obj, Continuation<?> continuation) {
        C12932j.m33818b(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
