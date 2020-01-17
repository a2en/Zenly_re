package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.c */
public final class C12874c implements CoroutineContext, Serializable {

    /* renamed from: e */
    public static final C12874c f33444e = new C12874c();
    private static final long serialVersionUID = 0;

    private C12874c() {
    }

    private final Object readResolve() {
        return f33444e;
    }

    public <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        C12932j.m33818b(function2, "operation");
        return r;
    }

    public <E extends Element> E get(Key<E> key) {
        C12932j.m33818b(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public CoroutineContext minusKey(Key<?> key) {
        C12932j.m33818b(key, "key");
        return this;
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return coroutineContext;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
