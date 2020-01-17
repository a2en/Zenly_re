package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.manager.c */
final class C9183c implements ConnectivityMonitor {

    /* renamed from: e */
    private final Context f23833e;

    /* renamed from: f */
    final ConnectivityListener f23834f;

    /* renamed from: g */
    boolean f23835g;

    /* renamed from: h */
    private boolean f23836h;

    /* renamed from: i */
    private final BroadcastReceiver f23837i = new C9184a();

    /* renamed from: com.bumptech.glide.manager.c$a */
    class C9184a extends BroadcastReceiver {
        C9184a() {
        }

        public void onReceive(Context context, Intent intent) {
            C9183c cVar = C9183c.this;
            boolean z = cVar.f23835g;
            cVar.f23835g = cVar.mo24758a(context);
            if (z != C9183c.this.f23835g) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C9183c.this.f23835g);
                    Log.d(str, sb.toString());
                }
                C9183c cVar2 = C9183c.this;
                cVar2.f23834f.onConnectivityChanged(cVar2.f23835g);
            }
        }
    }

    C9183c(Context context, ConnectivityListener connectivityListener) {
        this.f23833e = context.getApplicationContext();
        this.f23834f = connectivityListener;
    }

    /* renamed from: a */
    private void m22002a() {
        if (!this.f23836h) {
            this.f23835g = mo24758a(this.f23833e);
            try {
                this.f23833e.registerReceiver(this.f23837i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f23836h = true;
            } catch (SecurityException e) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: b */
    private void m22003b() {
        if (this.f23836h) {
            this.f23833e.unregisterReceiver(this.f23837i);
            this.f23836h = false;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        m22002a();
    }

    public void onStop() {
        m22003b();
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean mo24758a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C9216j.m22083a(connectivityManager);
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (RuntimeException e) {
            String str = "ConnectivityMonitor";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
