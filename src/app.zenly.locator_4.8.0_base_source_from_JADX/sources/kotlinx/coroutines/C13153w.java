package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.w */
public final class C13153w extends C13071e0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j */
    private static final long f33757j;

    /* renamed from: k */
    public static final C13153w f33758k;

    static {
        Long l;
        C13153w wVar = new C13153w();
        f33758k = wVar;
        C13069d0.m34088a(wVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        C12932j.m33815a((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f33757j = timeUnit.toNanos(l.longValue());
    }

    private C13153w() {
    }

    /* renamed from: k */
    private final synchronized void m34332k() {
        if (m34334m()) {
            debugStatus = 3;
            mo37555j();
            notifyAll();
        }
    }

    /* renamed from: l */
    private final synchronized Thread m34333l() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: m */
    private final boolean m34334m() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: n */
    private final synchronized boolean m34335n() {
        if (m34334m()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Thread mo37502f() {
        Thread thread = _thread;
        return thread != null ? thread : m34333l();
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable) {
        C12932j.m33818b(runnable, "block");
        return mo37550a(j, runnable);
    }

    public void run() {
        C13160z0.f33770b.mo37697a(this);
        TimeSource a = C13053a1.m34076a();
        if (a != null) {
            a.registerTimeLoopThread();
        }
        try {
            if (m34335n()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i = mo37554i();
                    if (i == Long.MAX_VALUE) {
                        int i2 = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
                        if (i2 == 0) {
                            TimeSource a2 = C13053a1.m34076a();
                            long nanoTime = a2 != null ? a2.nanoTime() : System.nanoTime();
                            if (i2 == 0) {
                                j = f33757j + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                m34332k();
                                TimeSource a3 = C13053a1.m34076a();
                                if (a3 != null) {
                                    a3.unregisterTimeLoopThread();
                                }
                                if (!mo37553h()) {
                                    mo37502f();
                                }
                                return;
                            }
                            i = C12973l.m33891b(i, j2);
                        } else {
                            i = C12973l.m33891b(i, f33757j);
                        }
                    }
                    if (i > 0) {
                        if (m34334m()) {
                            _thread = null;
                            m34332k();
                            TimeSource a4 = C13053a1.m34076a();
                            if (a4 != null) {
                                a4.unregisterTimeLoopThread();
                            }
                            if (!mo37553h()) {
                                mo37502f();
                            }
                            return;
                        }
                        TimeSource a5 = C13053a1.m34076a();
                        if (a5 != null) {
                            a5.parkNanos(this, i);
                        } else {
                            LockSupport.parkNanos(this, i);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m34332k();
            TimeSource a6 = C13053a1.m34076a();
            if (a6 != null) {
                a6.unregisterTimeLoopThread();
            }
            if (!mo37553h()) {
                mo37502f();
            }
        }
    }
}
