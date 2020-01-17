package app.zenly.locator.dashboard;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

public class DashboardPresenter_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final DashboardPresenter f9170a;

    DashboardPresenter_LifecycleAdapter(DashboardPresenter dashboardPresenter) {
        this.f9170a = dashboardPresenter;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onTargetStart", 1)) {
                    this.f9170a.onTargetStart();
                }
            } else if (aVar == C0863a.ON_RESUME) {
                if (!z2 || mVar.mo4453a("onTargetResume", 1)) {
                    this.f9170a.onTargetResume();
                }
            } else if (aVar == C0863a.ON_PAUSE) {
                if (!z2 || mVar.mo4453a("onTargetPause", 1)) {
                    this.f9170a.onTargetPause();
                }
            } else {
                if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onTargetStop", 1))) {
                    this.f9170a.onTargetStop();
                }
            }
        }
    }
}
