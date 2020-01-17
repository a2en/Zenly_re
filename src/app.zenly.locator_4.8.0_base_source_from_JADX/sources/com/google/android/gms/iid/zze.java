package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.p310o.C10178a;
import com.google.android.gms.internal.gcm.C10470c;
import java.util.concurrent.ExecutorService;

public abstract class zze extends Service {

    /* renamed from: e */
    final ExecutorService f26857e = C10470c.m26856a().zzd(new C10178a("EnhancedIntentService"), 9);

    /* renamed from: f */
    private Binder f26858f;

    /* renamed from: g */
    private final Object f26859g = new Object();

    /* renamed from: h */
    private int f26860h;

    /* renamed from: i */
    private int f26861i = 0;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25872a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m3975a(intent);
        }
        synchronized (this.f26859g) {
            this.f26861i--;
            if (this.f26861i == 0) {
                stopSelfResult(this.f26860h);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f26858f == null) {
            this.f26858f = new C10235k(this);
        }
        return this.f26858f;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f26859g) {
            this.f26860h = i2;
            this.f26861i++;
        }
        if (intent == null) {
            m25872a(intent);
            return 2;
        }
        this.f26857e.execute(new C10232h(this, intent, intent));
        return 3;
    }
}
