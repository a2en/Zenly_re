package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Element.C12865a;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

public interface ThreadContextElement<S> extends Element {

    /* renamed from: kotlinx.coroutines.ThreadContextElement$a */
    public static final class C13050a {
        /* renamed from: a */
        public static <S, R> R m34066a(ThreadContextElement<S> threadContextElement, R r, Function2<? super R, ? super Element, ? extends R> function2) {
            C12932j.m33818b(function2, "operation");
            return C12865a.m33704a(threadContextElement, r, function2);
        }

        /* renamed from: a */
        public static <S, E extends Element> E m34067a(ThreadContextElement<S> threadContextElement, Key<E> key) {
            C12932j.m33818b(key, "key");
            return C12865a.m33705a((Element) threadContextElement, key);
        }

        /* renamed from: a */
        public static <S> CoroutineContext m34068a(ThreadContextElement<S> threadContextElement, CoroutineContext coroutineContext) {
            C12932j.m33818b(coroutineContext, "context");
            return C12865a.m33706a((Element) threadContextElement, coroutineContext);
        }

        /* renamed from: b */
        public static <S> CoroutineContext m34069b(ThreadContextElement<S> threadContextElement, Key<?> key) {
            C12932j.m33818b(key, "key");
            return C12865a.m33707b(threadContextElement, key);
        }
    }

    void restoreThreadContext(CoroutineContext coroutineContext, S s);

    S updateThreadContext(CoroutineContext coroutineContext);
}
