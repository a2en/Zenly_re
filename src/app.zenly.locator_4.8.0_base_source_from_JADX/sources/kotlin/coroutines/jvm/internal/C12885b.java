package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlin.coroutines.jvm.internal.b */
public final class C12885b implements Continuation<Object> {

    /* renamed from: e */
    public static final C12885b f33459e = new C12885b();

    private C12885b() {
    }

    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
