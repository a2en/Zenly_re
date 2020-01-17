package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;

public abstract class DaggerApplication extends Application implements HasActivityInjector, HasFragmentInjector, HasServiceInjector, HasBroadcastReceiverInjector, HasContentProviderInjector {

    /* renamed from: e */
    DispatchingAndroidInjector<Activity> f31300e;

    /* renamed from: f */
    DispatchingAndroidInjector<BroadcastReceiver> f31301f;

    /* renamed from: g */
    DispatchingAndroidInjector<Fragment> f31302g;

    /* renamed from: h */
    DispatchingAndroidInjector<Service> f31303h;

    /* renamed from: i */
    DispatchingAndroidInjector<ContentProvider> f31304i;

    /* renamed from: j */
    private volatile boolean f31305j = true;

    /* renamed from: b */
    private void m31661b() {
        if (this.f31305j) {
            synchronized (this) {
                if (this.f31305j) {
                    mo35636a().inject(this);
                    if (this.f31305j) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AndroidInjector<? extends DaggerApplication> mo35636a();

    public AndroidInjector<ContentProvider> contentProviderInjector() {
        m31661b();
        return this.f31304i;
    }

    public void onCreate() {
        super.onCreate();
        m31661b();
    }

    public DispatchingAndroidInjector<Activity> activityInjector() {
        return this.f31300e;
    }

    public DispatchingAndroidInjector<BroadcastReceiver> broadcastReceiverInjector() {
        return this.f31301f;
    }

    public DispatchingAndroidInjector<Fragment> fragmentInjector() {
        return this.f31302g;
    }

    public DispatchingAndroidInjector<Service> serviceInjector() {
        return this.f31303h;
    }
}
