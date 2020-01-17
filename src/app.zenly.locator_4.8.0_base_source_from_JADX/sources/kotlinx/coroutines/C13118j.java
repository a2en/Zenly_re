package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.j */
public class C13118j {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f33713b = AtomicIntegerFieldUpdater.newUpdater(C13118j.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f33714a;

    public C13118j(Throwable th, boolean z) {
        C12932j.m33818b(th, "cause");
        this.f33714a = th;
        this._handled = z ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean mo37628a() {
        return f33713b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13151v.m34329a((Object) this));
        sb.append('[');
        sb.append(this.f33714a);
        sb.append(']');
        return sb.toString();
    }

    public /* synthetic */ C13118j(Throwable th, boolean z, int i, C12928f fVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(th, z);
    }
}
