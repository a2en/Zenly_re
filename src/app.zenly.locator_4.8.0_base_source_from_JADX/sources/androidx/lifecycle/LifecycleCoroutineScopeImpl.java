package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

public final class LifecycleCoroutineScopeImpl extends C0866i implements LifecycleEventObserver {

    /* renamed from: e */
    private final C0862g f3407e;

    /* renamed from: f */
    private final CoroutineContext f3408f;

    /* renamed from: a */
    public C0862g mo4383a() {
        return this.f3407e;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f3408f;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        C12932j.m33818b(lifecycleOwner, "source");
        C12932j.m33818b(aVar, "event");
        if (mo4383a().mo4445a().compareTo(C0864b.DESTROYED) <= 0) {
            mo4383a().mo4447b(this);
            C13131p0.m34260a(getCoroutineContext(), null, 1, null);
        }
    }
}
