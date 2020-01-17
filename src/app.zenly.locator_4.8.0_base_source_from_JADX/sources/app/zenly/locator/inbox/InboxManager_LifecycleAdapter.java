package app.zenly.locator.inbox;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class InboxManager_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final InboxManager f10181a;

    InboxManager_LifecycleAdapter(InboxManager inboxManager) {
        this.f10181a = inboxManager;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onForeground", 1)) {
                    this.f10181a.onForeground();
                }
                return;
            }
            if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onBackground", 1))) {
                this.f10181a.onBackground();
            }
        }
    }
}
