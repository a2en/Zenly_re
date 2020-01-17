package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.firebase_messaging.m */
final class C10464m extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f27380a;

    public C10464m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f27380a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C10464m.class) {
            if (this == obj) {
                return true;
            }
            C10464m mVar = (C10464m) obj;
            return this.f27380a == mVar.f27380a && get() == mVar.get();
        }
    }

    public final int hashCode() {
        return this.f27380a;
    }
}
