package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.gcm.m */
final class C10481m extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f27394a;

    public C10481m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f27394a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C10481m.class) {
            if (this == obj) {
                return true;
            }
            C10481m mVar = (C10481m) obj;
            return this.f27394a == mVar.f27394a && get() == mVar.get();
        }
    }

    public final int hashCode() {
        return this.f27394a;
    }
}
