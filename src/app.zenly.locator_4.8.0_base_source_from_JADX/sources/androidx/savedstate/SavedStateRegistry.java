package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map.Entry;
import p214e.p222b.p223a.p225b.C7558b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C7558b<String, SavedStateProvider> f4389a = new C7558b<>();

    /* renamed from: b */
    private Bundle f4390b;

    /* renamed from: c */
    private boolean f4391c;

    /* renamed from: d */
    private C1159a f4392d;

    /* renamed from: e */
    boolean f4393e = true;

    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    public interface SavedStateProvider {
        Bundle saveState();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo5826a(String str) {
        if (this.f4391c) {
            Bundle bundle = this.f4390b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f4390b.remove(str);
            if (this.f4390b.isEmpty()) {
                this.f4390b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: a */
    public void mo5830a(String str, SavedStateProvider savedStateProvider) {
        if (((SavedStateProvider) this.f4389a.mo19443b(str, savedStateProvider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: a */
    public void mo5829a(Class<? extends AutoRecreated> cls) {
        if (this.f4393e) {
            if (this.f4392d == null) {
                this.f4392d = new C1159a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4392d.mo5825a(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5828a(C0862g gVar, Bundle bundle) {
        if (!this.f4391c) {
            if (bundle != null) {
                this.f4390b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            gVar.mo4446a(new GenericLifecycleObserver() {
                public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
                    if (aVar == C0863a.ON_START) {
                        SavedStateRegistry.this.f4393e = true;
                    } else if (aVar == C0863a.ON_STOP) {
                        SavedStateRegistry.this.f4393e = false;
                    }
                }
            });
            this.f4391c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5827a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4390b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C7562d b = this.f4389a.mo19449b();
        while (b.hasNext()) {
            Entry entry = (Entry) b.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateProvider) entry.getValue()).saveState());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
