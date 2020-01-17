package app.zenly.locator.core.helper;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class AuthenticatedSessionLifecycleOwner_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final AuthenticatedSessionLifecycleOwner f7499a;

    AuthenticatedSessionLifecycleOwner_LifecycleAdapter(AuthenticatedSessionLifecycleOwner authenticatedSessionLifecycleOwner) {
        this.f7499a = authenticatedSessionLifecycleOwner;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onStart", 1)) {
                    this.f7499a.onStart();
                }
                return;
            }
            if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onStop", 1))) {
                this.f7499a.onStop();
            }
        }
    }
}
