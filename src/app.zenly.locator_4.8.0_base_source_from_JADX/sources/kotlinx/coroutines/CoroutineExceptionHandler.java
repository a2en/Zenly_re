package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;

public interface CoroutineExceptionHandler extends Element {

    /* renamed from: c */
    public static final C13046a f33625c = C13046a.f33626a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C13046a implements Key<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C13046a f33626a = new C13046a();

        private C13046a() {
        }
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
