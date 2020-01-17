package app.zenly.locator.core.store;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class SuggestedStore_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final SuggestedStore f8315a;

    SuggestedStore_LifecycleAdapter(SuggestedStore suggestedStore) {
        this.f8315a = suggestedStore;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onStart", 1)) {
                    this.f8315a.onStart();
                }
                return;
            }
            if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onStop", 1))) {
                this.f8315a.onStop();
            }
        }
    }
}
