package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.crashlytics.android.core.v */
class C9416v {

    /* renamed from: f */
    private static final IntentFilter f24381f = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: g */
    private static final IntentFilter f24382g = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    /* renamed from: h */
    private static final IntentFilter f24383h = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");

    /* renamed from: a */
    private final AtomicBoolean f24384a = new AtomicBoolean(false);

    /* renamed from: b */
    private final Context f24385b;

    /* renamed from: c */
    private final BroadcastReceiver f24386c = new C9418b();

    /* renamed from: d */
    private final BroadcastReceiver f24387d = new C9417a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f24388e;

    /* renamed from: com.crashlytics.android.core.v$a */
    class C9417a extends BroadcastReceiver {
        C9417a() {
        }

        public void onReceive(Context context, Intent intent) {
            C9416v.this.f24388e = true;
        }
    }

    /* renamed from: com.crashlytics.android.core.v$b */
    class C9418b extends BroadcastReceiver {
        C9418b() {
        }

        public void onReceive(Context context, Intent intent) {
            C9416v.this.f24388e = false;
        }
    }

    public C9416v(Context context) {
        this.f24385b = context;
    }

    /* renamed from: b */
    public void mo25228b() {
        boolean z = true;
        if (!this.f24384a.getAndSet(true)) {
            Intent registerReceiver = this.f24385b.registerReceiver(null, f24381f);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.f24388e = z;
            this.f24385b.registerReceiver(this.f24387d, f24382g);
            this.f24385b.registerReceiver(this.f24386c, f24383h);
        }
    }

    /* renamed from: c */
    public boolean mo25229c() {
        return this.f24388e;
    }

    /* renamed from: a */
    public void mo25227a() {
        if (this.f24384a.getAndSet(false)) {
            this.f24385b.unregisterReceiver(this.f24387d);
            this.f24385b.unregisterReceiver(this.f24386c);
        }
    }
}
