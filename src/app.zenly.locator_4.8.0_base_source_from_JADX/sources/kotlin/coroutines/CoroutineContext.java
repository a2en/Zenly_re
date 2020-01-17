package kotlin.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

public interface CoroutineContext {

    public interface Element extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$Element$a */
        public static final class C12865a {
            /* renamed from: a */
            public static <E extends Element> E m33705a(Element element, Key<E> key) {
                C12932j.m33818b(key, "key");
                if (!C12932j.m33817a((Object) element.getKey(), (Object) key)) {
                    return null;
                }
                if (element != null) {
                    return element;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            /* renamed from: a */
            public static CoroutineContext m33706a(Element element, CoroutineContext coroutineContext) {
                C12932j.m33818b(coroutineContext, "context");
                return C12866a.m33708a(element, coroutineContext);
            }

            /* renamed from: b */
            public static CoroutineContext m33707b(Element element, Key<?> key) {
                C12932j.m33818b(key, "key");
                return C12932j.m33817a((Object) element.getKey(), (Object) key) ? C12874c.f33444e : element;
            }

            /* renamed from: a */
            public static <R> R m33704a(Element element, R r, Function2<? super R, ? super Element, ? extends R> function2) {
                C12932j.m33818b(function2, "operation");
                return function2.invoke(r, element);
            }
        }

        <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

        <E extends Element> E get(Key<E> key);

        Key<?> getKey();

        CoroutineContext minusKey(Key<?> key);
    }

    public interface Key<E extends Element> {
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    public static final class C12866a {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        static final class C12867a extends C12933k implements Function2<CoroutineContext, Element, CoroutineContext> {

            /* renamed from: f */
            public static final C12867a f33437f = new C12867a();

            C12867a() {
                super(2);
            }

            /* renamed from: a */
            public final CoroutineContext invoke(CoroutineContext coroutineContext, Element element) {
                C12932j.m33818b(coroutineContext, "acc");
                C12932j.m33818b(element, "element");
                CoroutineContext minusKey = coroutineContext.minusKey(element.getKey());
                if (minusKey == C12874c.f33444e) {
                    return element;
                }
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(ContinuationInterceptor.f33435b);
                if (continuationInterceptor == null) {
                    return new C12869b(minusKey, element);
                }
                CoroutineContext minusKey2 = minusKey.minusKey(ContinuationInterceptor.f33435b);
                if (minusKey2 == C12874c.f33444e) {
                    return new C12869b(element, continuationInterceptor);
                }
                return new C12869b(new C12869b(minusKey2, element), continuationInterceptor);
            }
        }

        /* renamed from: a */
        public static CoroutineContext m33708a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            C12932j.m33818b(coroutineContext2, "context");
            return coroutineContext2 == C12874c.f33444e ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, C12867a.f33437f);
        }
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(Key<E> key);

    CoroutineContext minusKey(Key<?> key);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
