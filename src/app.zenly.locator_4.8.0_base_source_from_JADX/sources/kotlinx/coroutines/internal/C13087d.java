package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C13149u;

/* renamed from: kotlinx.coroutines.internal.d */
public abstract class C13087d<T> extends C13104k {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f33672a = AtomicReferenceFieldUpdater.newUpdater(C13087d.class, Object.class, "_consensus");
    private volatile Object _consensus = C13086c.f33671a;

    /* renamed from: d */
    private final Object m34150d(Object obj) {
        return mo37583c(obj) ? obj : this._consensus;
    }

    /* renamed from: a */
    public final Object mo37580a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C13086c.f33671a) {
            obj2 = m34150d(mo37582b(obj));
        }
        mo37581a(obj, obj2);
        return obj2;
    }

    /* renamed from: a */
    public abstract void mo37581a(T t, Object obj);

    /* renamed from: b */
    public abstract Object mo37582b(T t);

    /* renamed from: c */
    public final boolean mo37583c(Object obj) {
        if (C13149u.m34325a()) {
            if (!(obj != C13086c.f33671a)) {
                throw new AssertionError();
            }
        }
        return f33672a.compareAndSet(this, C13086c.f33671a, obj);
    }
}
