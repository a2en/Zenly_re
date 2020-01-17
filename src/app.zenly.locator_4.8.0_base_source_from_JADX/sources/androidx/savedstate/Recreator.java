package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements GenericLifecycleObserver {

    /* renamed from: e */
    private final SavedStateRegistryOwner f4387e;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C1159a implements SavedStateProvider {

        /* renamed from: a */
        final Set<String> f4388a = new HashSet();

        C1159a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo5830a("androidx.savedstate.Restarter", (SavedStateProvider) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5825a(String str) {
            this.f4388a.add(str);
        }

        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4388a));
            return bundle;
        }
    }

    Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f4387e = savedStateRegistryOwner;
    }

    /* renamed from: a */
    private void m5676a(String str) {
        try {
            Class asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(AutoRecreated.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((AutoRecreated) declaredConstructor.newInstance(new Object[0])).onRecreated(this.f4387e);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e3);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        if (aVar == C0863a.ON_CREATE) {
            lifecycleOwner.getLifecycle().mo4447b(this);
            Bundle a = this.f4387e.getSavedStateRegistry().mo5826a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m5676a((String) it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
