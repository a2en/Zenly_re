package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Element.C12865a;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.a */
public abstract class C12868a implements Element {
    private final Key<?> key;

    public C12868a(Key<?> key2) {
        C12932j.m33818b(key2, "key");
        this.key = key2;
    }

    public <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        C12932j.m33818b(function2, "operation");
        return C12865a.m33704a(this, r, function2);
    }

    public <E extends Element> E get(Key<E> key2) {
        C12932j.m33818b(key2, "key");
        return C12865a.m33705a((Element) this, key2);
    }

    public Key<?> getKey() {
        return this.key;
    }

    public CoroutineContext minusKey(Key<?> key2) {
        C12932j.m33818b(key2, "key");
        return C12865a.m33707b(this, key2);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return C12865a.m33706a((Element) this, coroutineContext);
    }
}
