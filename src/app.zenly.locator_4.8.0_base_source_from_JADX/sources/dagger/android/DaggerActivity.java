package dagger.android;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public abstract class DaggerActivity extends Activity implements HasFragmentInjector {

    /* renamed from: e */
    DispatchingAndroidInjector<Fragment> f31299e;

    public AndroidInjector<Fragment> fragmentInjector() {
        return this.f31299e;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C12018a.m31663a((Activity) this);
        super.onCreate(bundle);
    }
}
