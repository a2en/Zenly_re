package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements LifecycleOwner {

    /* renamed from: e */
    private final C0887t f3409e = new C0887t(this);

    public C0862g getLifecycle() {
        return this.f3409e.mo4491a();
    }

    public IBinder onBind(Intent intent) {
        this.f3409e.mo4492b();
        return null;
    }

    public void onCreate() {
        this.f3409e.mo4493c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3409e.mo4494d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3409e.mo4495e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
