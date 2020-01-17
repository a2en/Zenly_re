package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.p */
public final class C13130p {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f33724a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        Iterator it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        C12932j.m33815a((Object) it, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        f33724a = C12990j.m33935g(C12987h.m33919a(it));
    }

    /* renamed from: a */
    public static final void m34258a(CoroutineContext coroutineContext, Throwable th) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(th, "exception");
        Iterator it = f33724a.iterator();
        while (true) {
            String str = "currentThread";
            if (it.hasNext()) {
                try {
                    ((CoroutineExceptionHandler) it.next()).handleException(coroutineContext, th);
                } catch (Throwable th2) {
                    Thread currentThread = Thread.currentThread();
                    C12932j.m33815a((Object) currentThread, str);
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C13132q.m34261a(th, th2));
                }
            } else {
                Thread currentThread2 = Thread.currentThread();
                C12932j.m33815a((Object) currentThread2, str);
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                return;
            }
        }
    }
}
