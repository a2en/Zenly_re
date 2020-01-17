package kotlin.coroutines;

import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.internal.C12932j;

public interface ContinuationInterceptor extends Element {

    /* renamed from: b */
    public static final C12864b f33435b = C12864b.f33436a;

    /* renamed from: kotlin.coroutines.ContinuationInterceptor$a */
    public static final class C12863a {
        /* renamed from: a */
        public static <E extends Element> E m33701a(ContinuationInterceptor continuationInterceptor, Key<E> key) {
            C12932j.m33818b(key, "key");
            if (key != ContinuationInterceptor.f33435b) {
                return null;
            }
            if (continuationInterceptor != null) {
                return continuationInterceptor;
            }
            throw new TypeCastException("null cannot be cast to non-null type E");
        }

        /* renamed from: a */
        public static void m33702a(ContinuationInterceptor continuationInterceptor, Continuation<?> continuation) {
            C12932j.m33818b(continuation, "continuation");
        }

        /* renamed from: b */
        public static CoroutineContext m33703b(ContinuationInterceptor continuationInterceptor, Key<?> key) {
            C12932j.m33818b(key, "key");
            return key == ContinuationInterceptor.f33435b ? C12874c.f33444e : continuationInterceptor;
        }
    }

    /* renamed from: kotlin.coroutines.ContinuationInterceptor$b */
    public static final class C12864b implements Key<ContinuationInterceptor> {

        /* renamed from: a */
        static final /* synthetic */ C12864b f33436a = new C12864b();

        private C12864b() {
        }
    }

    <E extends Element> E get(Key<E> key);

    <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation);

    CoroutineContext minusKey(Key<?> key);

    void releaseInterceptedContinuation(Continuation<?> continuation);
}
