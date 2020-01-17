package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistryOwner;

final class SavedStateHandleController implements LifecycleEventObserver {

    /* renamed from: e */
    private final String f3430e;

    /* renamed from: f */
    private boolean f3431f = false;

    /* renamed from: g */
    private final C0884r f3432g;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0846a implements AutoRecreated {
        C0846a() {
        }

        public void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner) {
            if (savedStateRegistryOwner instanceof ViewModelStoreOwner) {
                C0891w viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                for (String a : viewModelStore.mo4503b()) {
                    SavedStateHandleController.m3997a(viewModelStore.mo4500a(a), savedStateRegistry, savedStateRegistryOwner.getLifecycle());
                }
                if (!viewModelStore.mo4503b().isEmpty()) {
                    savedStateRegistry.mo5829a(C0846a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, C0884r rVar) {
        this.f3430e = str;
        this.f3432g = rVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4412a(SavedStateRegistry savedStateRegistry, C0862g gVar) {
        if (!this.f3431f) {
            this.f3431f = true;
            gVar.mo4446a(this);
            savedStateRegistry.mo5830a(this.f3430e, this.f3432g.mo4489a());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4413b() {
        return this.f3431f;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        if (aVar == C0863a.ON_DESTROY) {
            this.f3431f = false;
            lifecycleOwner.getLifecycle().mo4447b(this);
        }
    }

    /* renamed from: b */
    private static void m3998b(final SavedStateRegistry savedStateRegistry, final C0862g gVar) {
        C0864b a = gVar.mo4445a();
        if (a == C0864b.INITIALIZED || a.mo4448a(C0864b.STARTED)) {
            savedStateRegistry.mo5829a(C0846a.class);
        } else {
            gVar.mo4446a(new LifecycleEventObserver() {
                public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
                    if (aVar == C0863a.ON_START) {
                        gVar.mo4447b(this);
                        savedStateRegistry.mo5829a(C0846a.class);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0884r mo4411a() {
        return this.f3432g;
    }

    /* renamed from: a */
    static SavedStateHandleController m3996a(SavedStateRegistry savedStateRegistry, C0862g gVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0884r.m4081a(savedStateRegistry.mo5826a(str), bundle));
        savedStateHandleController.mo4412a(savedStateRegistry, gVar);
        m3998b(savedStateRegistry, gVar);
        return savedStateHandleController;
    }

    /* renamed from: a */
    static void m3997a(C0889u uVar, SavedStateRegistry savedStateRegistry, C0862g gVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) uVar.mo4497a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4413b()) {
            savedStateHandleController.mo4412a(savedStateRegistry, gVar);
            m3998b(savedStateRegistry, gVar);
        }
    }
}
