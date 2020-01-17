package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.p310o.C10178a;
import com.google.android.gms.internal.firebase_messaging.C10451a;
import com.google.android.gms.internal.firebase_messaging.C10455e;
import com.google.android.gms.internal.firebase_messaging.zzb;
import java.util.concurrent.ExecutorService;

public abstract class zzc extends Service {
    private final Object lock;
    final ExecutorService zzt;
    private Binder zzu;
    private int zzv;
    private int zzw;

    public zzc() {
        zzb a = C10451a.m26841a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.zzt = a.zza(new C10178a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), C10455e.f27375a);
        this.lock = new Object();
        this.zzw = 0;
    }

    /* access modifiers changed from: private */
    public final void zza(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m3975a(intent);
        }
        synchronized (this.lock) {
            this.zzw--;
            if (this.zzw == 0) {
                stopSelfResult(this.zzv);
            }
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.zzu == null) {
            this.zzu = new C11060f0(this);
        }
        return this.zzu;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.zzv = i2;
            this.zzw++;
        }
        Intent zzb = zzb(intent);
        if (zzb == null) {
            zza(intent);
            return 2;
        } else if (zzc(zzb)) {
            zza(intent);
            return 2;
        } else {
            this.zzt.execute(new C11050a0(this, zzb, intent));
            return 3;
        }
    }

    /* access modifiers changed from: protected */
    public Intent zzb(Intent intent) {
        return intent;
    }

    public boolean zzc(Intent intent) {
        return false;
    }

    public abstract void zzd(Intent intent);
}
