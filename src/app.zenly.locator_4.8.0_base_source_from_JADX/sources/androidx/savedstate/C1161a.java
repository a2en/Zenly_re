package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0864b;

/* renamed from: androidx.savedstate.a */
public final class C1161a {

    /* renamed from: a */
    private final SavedStateRegistryOwner f4395a;

    /* renamed from: b */
    private final SavedStateRegistry f4396b = new SavedStateRegistry();

    private C1161a(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f4395a = savedStateRegistryOwner;
    }

    /* renamed from: a */
    public SavedStateRegistry mo5831a() {
        return this.f4396b;
    }

    /* renamed from: b */
    public void mo5833b(Bundle bundle) {
        this.f4396b.mo5827a(bundle);
    }

    /* renamed from: a */
    public void mo5832a(Bundle bundle) {
        C0862g lifecycle = this.f4395a.getLifecycle();
        if (lifecycle.mo4445a() == C0864b.INITIALIZED) {
            lifecycle.mo4446a(new Recreator(this.f4395a));
            this.f4396b.mo5828a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: a */
    public static C1161a m5683a(SavedStateRegistryOwner savedStateRegistryOwner) {
        return new C1161a(savedStateRegistryOwner);
    }
}
