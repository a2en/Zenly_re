package app.zenly.locator.inbox;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class InboxPresenter_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final InboxPresenter f10208a;

    InboxPresenter_LifecycleAdapter(InboxPresenter inboxPresenter) {
        this.f10208a = inboxPresenter;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onStart", 1)) {
                    this.f10208a.onStart();
                }
            } else if (aVar == C0863a.ON_RESUME) {
                if (!z2 || mVar.mo4453a("onResume", 1)) {
                    this.f10208a.onResume();
                }
            } else if (aVar == C0863a.ON_PAUSE) {
                if (!z2 || mVar.mo4453a("onPause", 1)) {
                    this.f10208a.onPause();
                }
            } else {
                if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onStop", 1))) {
                    this.f10208a.onStop();
                }
            }
        }
    }
}
