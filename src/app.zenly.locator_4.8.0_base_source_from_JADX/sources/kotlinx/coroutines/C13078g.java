package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.g */
public final class C13078g extends C13118j {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f33662c = AtomicIntegerFieldUpdater.newUpdater(C13078g.class, "_resumed");
    private volatile int _resumed;

    public C13078g(Continuation<?> continuation, Throwable th, boolean z) {
        C12932j.m33818b(continuation, "continuation");
        if (th == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(continuation);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th, z);
        this._resumed = 0;
    }

    /* renamed from: b */
    public final boolean mo37573b() {
        return f33662c.compareAndSet(this, 0, 1);
    }
}
