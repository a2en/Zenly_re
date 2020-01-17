package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.evernote.android.job.C9441d;
import com.evernote.android.job.JobProxy.C9433a;
import com.evernote.android.job.util.C9469c;
import java.util.HashSet;
import java.util.Set;

public final class PlatformAlarmServiceExact extends Service {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C9469c f24550h = new C9469c("PlatformAlarmServiceExact");

    /* renamed from: e */
    private final Object f24551e = new Object();

    /* renamed from: f */
    private volatile Set<Integer> f24552f;

    /* renamed from: g */
    private volatile int f24553g;

    /* renamed from: com.evernote.android.job.v14.PlatformAlarmServiceExact$a */
    class C9474a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Intent f24554e;

        /* renamed from: f */
        final /* synthetic */ int f24555f;

        C9474a(Intent intent, int i) {
            this.f24554e = intent;
            this.f24555f = i;
        }

        public void run() {
            try {
                PlatformAlarmService.m23094a(this.f24554e, (Service) PlatformAlarmServiceExact.this, PlatformAlarmServiceExact.f24550h);
            } finally {
                C9433a.m22820a(this.f24554e);
                PlatformAlarmServiceExact.this.m23098a(this.f24555f);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f24552f = new HashSet();
    }

    public void onDestroy() {
        synchronized (this.f24551e) {
            this.f24552f = null;
            this.f24553g = 0;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f24551e) {
            this.f24552f.add(Integer.valueOf(i2));
            this.f24553g = i2;
        }
        C9441d.m22855b().execute(new C9474a(intent, i2));
        return 2;
    }

    /* renamed from: a */
    public static Intent m23096a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent(context, PlatformAlarmServiceExact.class);
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23098a(int i) {
        synchronized (this.f24551e) {
            Set<Integer> set = this.f24552f;
            if (set != null) {
                set.remove(Integer.valueOf(i));
                if (set.isEmpty()) {
                    stopSelfResult(this.f24553g);
                }
            }
        }
    }
}
