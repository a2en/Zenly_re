package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;

class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* renamed from: e */
    private final Object f3428e;

    /* renamed from: f */
    private final C0853a f3429f = C0852b.f3441c.mo4419a(this.f3428e.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3428e = obj;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        this.f3429f.mo4421a(lifecycleOwner, aVar, this.f3428e);
    }
}
