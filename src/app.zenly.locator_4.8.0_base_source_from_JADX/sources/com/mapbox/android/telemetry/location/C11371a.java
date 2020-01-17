package com.mapbox.android.telemetry.location;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.mapbox.android.core.location.C11272d;
import com.mapbox.android.telemetry.C11354i0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.mapbox.android.telemetry.location.a */
public class C11371a implements OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private static final Object f29458g = new Object();

    /* renamed from: h */
    private static C11371a f29459h;

    /* renamed from: a */
    final C11373b f29460a;

    /* renamed from: b */
    private final AtomicBoolean f29461b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicReference<C11376e> f29462c = new AtomicReference<>();

    /* renamed from: d */
    private final HandlerThread f29463d;

    /* renamed from: e */
    private final C11354i0 f29464e;

    /* renamed from: f */
    private Handler f29465f;

    /* renamed from: com.mapbox.android.telemetry.location.a$a */
    class C11372a extends Handler {
        C11372a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C11371a.this.mo33016a(message);
        }
    }

    C11371a(C11373b bVar, HandlerThread handlerThread, C11376e eVar, SharedPreferences sharedPreferences, C11354i0 i0Var) {
        this.f29460a = bVar;
        this.f29463d = handlerThread;
        this.f29462c.set(eVar);
        this.f29464e = i0Var;
        this.f29463d.start();
        this.f29465f = new C11372a(handlerThread.getLooper());
        m29278a(sharedPreferences);
    }

    /* renamed from: a */
    public static C11371a m29277a(Context context, long j) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f29458g) {
            if (f29459h == null) {
                C11371a aVar = new C11371a(new C11374c(context, C11272d.m28942a(context), new LocationUpdatesBroadcastReceiver()), new HandlerThread("LocationSettingsChangeThread"), new C11376e(j), context.getSharedPreferences("MapboxSharedPreferences", 0), new C11354i0(context, "", String.format("%s/%s", new Object[]{"mapbox-android-location", "4.3.0"})));
                f29459h = aVar;
            }
        }
        return f29459h;
    }

    /* renamed from: d */
    static C11371a m29279d() {
        C11371a aVar;
        synchronized (f29458g) {
            if (f29459h != null) {
                aVar = f29459h;
            } else {
                throw new IllegalStateException("LocationCollectionClient is not installed.");
            }
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11354i0 mo33018b() {
        return this.f29464e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33019c() {
        return this.f29461b.get();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "mapboxSessionRotationInterval";
        String str3 = "mapboxTelemetryLocationState";
        try {
            if (str3.equals(str)) {
                mo33017a(sharedPreferences.getBoolean(str3, false));
            } else if (str2.equals(str)) {
                mo33015a(sharedPreferences.getLong(str2, TimeUnit.HOURS.toMillis(24)));
            }
        } catch (Exception e) {
            Log.e("LocationCollectionCli", e.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33015a(long j) {
        this.f29462c.set(new C11376e(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo33014a() {
        return ((C11376e) this.f29462c.get()).mo33025b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33017a(boolean z) {
        if (this.f29461b.compareAndSet(!z, z)) {
            this.f29465f.sendEmptyMessage(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33016a(Message message) {
        if (message.what == 0) {
            if (mo33019c()) {
                this.f29460a.onResume();
                this.f29464e.mo33001b();
                return;
            }
            this.f29460a.onDestroy();
            this.f29464e.mo32997a();
        }
    }

    /* renamed from: a */
    private void m29278a(SharedPreferences sharedPreferences) {
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("mapboxTelemetryLocationState", this.f29461b.get());
        edit.putLong("mapboxSessionRotationInterval", ((C11376e) this.f29462c.get()).mo33024a());
        edit.apply();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }
}
