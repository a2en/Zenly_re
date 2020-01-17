package kotlinx.coroutines;

import kotlin.coroutines.C12868a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.ContinuationInterceptor.C12863a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.o */
public abstract class C13128o extends C12868a implements ContinuationInterceptor {
    public C13128o() {
        super(ContinuationInterceptor.f33435b);
    }

    /* renamed from: a */
    public abstract void mo37495a(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: a */
    public boolean mo37496a(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return true;
    }

    public <E extends Element> E get(Key<E> key) {
        C12932j.m33818b(key, "key");
        return C12863a.m33701a((ContinuationInterceptor) this, key);
    }

    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        C12932j.m33818b(continuation, "continuation");
        return new C13157y(this, continuation);
    }

    public CoroutineContext minusKey(Key<?> key) {
        C12932j.m33818b(key, "key");
        return C12863a.m33703b(this, key);
    }

    public void releaseInterceptedContinuation(Continuation<?> continuation) {
        C12932j.m33818b(continuation, "continuation");
        C12863a.m33702a((ContinuationInterceptor) this, continuation);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13151v.m34329a((Object) this));
        sb.append('@');
        sb.append(C13151v.m34331b(this));
        return sb.toString();
    }
}
