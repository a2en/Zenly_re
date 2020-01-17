package app.zenly.locator;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class AppLifecycleDispatcher_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final AppLifecycleDispatcher f5309a;

    AppLifecycleDispatcher_LifecycleAdapter(AppLifecycleDispatcher appLifecycleDispatcher) {
        this.f5309a = appLifecycleDispatcher;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_CREATE) {
                if (!z2 || mVar.mo4453a("onCreate", 1)) {
                    this.f5309a.onCreate();
                }
            } else if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onStart", 1)) {
                    this.f5309a.onStart();
                }
            } else if (aVar == C0863a.ON_STOP) {
                if (!z2 || mVar.mo4453a("onStop", 1)) {
                    this.f5309a.onStop();
                }
            } else {
                if (aVar == C0863a.ON_DESTROY && (!z2 || mVar.mo4453a("onDestroy", 1))) {
                    this.f5309a.onDestroy();
                }
            }
        }
    }
}
