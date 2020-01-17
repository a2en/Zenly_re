package kotlin.coroutines.experimental;

import kotlin.coroutines.experimental.CoroutineContext.Element;
import kotlin.coroutines.experimental.CoroutineContext.Key;

public interface ContinuationInterceptor extends Element {

    /* renamed from: kotlin.coroutines.experimental.ContinuationInterceptor$a */
    public static final class C12883a implements Key<ContinuationInterceptor> {

        /* renamed from: a */
        static final /* synthetic */ C12883a f33457a = new C12883a();

        private C12883a() {
        }
    }

    static {
        C12883a aVar = C12883a.f33457a;
    }

    <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation);
}
