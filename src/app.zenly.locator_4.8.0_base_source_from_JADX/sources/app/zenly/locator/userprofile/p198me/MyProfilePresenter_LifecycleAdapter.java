package app.zenly.locator.userprofile.p198me;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0873m;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: app.zenly.locator.userprofile.me.MyProfilePresenter_LifecycleAdapter */
public class MyProfilePresenter_LifecycleAdapter implements GeneratedAdapter {

    /* renamed from: a */
    final MyProfilePresenter f15219a;

    MyProfilePresenter_LifecycleAdapter(MyProfilePresenter myProfilePresenter) {
        this.f15219a = myProfilePresenter;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, C0863a aVar, boolean z, C0873m mVar) {
        boolean z2 = mVar != null;
        if (!z) {
            if (aVar == C0863a.ON_START) {
                if (!z2 || mVar.mo4453a("onStart", 1)) {
                    this.f15219a.onStart();
                }
            } else if (aVar == C0863a.ON_RESUME) {
                if (!z2 || mVar.mo4453a("onResume", 1)) {
                    this.f15219a.onResume();
                }
            } else if (aVar == C0863a.ON_PAUSE) {
                if (!z2 || mVar.mo4453a("onPause", 1)) {
                    this.f15219a.onPause();
                }
            } else {
                if (aVar == C0863a.ON_STOP && (!z2 || mVar.mo4453a("onStop", 1))) {
                    this.f15219a.onStop();
                }
            }
        }
    }
}
