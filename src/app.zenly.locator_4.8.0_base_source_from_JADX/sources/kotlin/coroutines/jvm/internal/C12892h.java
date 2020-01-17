package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C12874c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlin.coroutines.jvm.internal.h */
public abstract class C12892h extends C12884a {
    public C12892h(Continuation<Object> continuation) {
        super(continuation);
        if (continuation != null) {
            if (!(continuation.getContext() == C12874c.f33444e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public CoroutineContext getContext() {
        return C12874c.f33444e;
    }
}
