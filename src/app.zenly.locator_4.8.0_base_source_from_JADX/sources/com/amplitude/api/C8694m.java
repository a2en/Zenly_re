package com.amplitude.api;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.amplitude.api.m */
public class C8694m extends HandlerThread {

    /* renamed from: e */
    private Handler f22387e;

    public C8694m(String str) {
        super(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23477a(Runnable runnable) {
        m20454a();
        this.f22387e.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23478a(Runnable runnable, long j) {
        m20454a();
        this.f22387e.postDelayed(runnable, j);
    }

    /* renamed from: a */
    private synchronized void m20454a() {
        if (this.f22387e == null) {
            this.f22387e = new Handler(getLooper());
        }
    }
}
