package com.mapbox.mapboxsdk.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mapbox.mapboxsdk.log.Logger;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectivityReceiver extends BroadcastReceiver {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    private static ConnectivityReceiver f30040e;

    /* renamed from: a */
    private List<ConnectivityListener> f30041a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private Context f30042b;

    /* renamed from: c */
    private int f30043c;

    /* renamed from: d */
    private Boolean f30044d;

    private ConnectivityReceiver(Context context) {
        this.f30042b = context;
    }

    /* renamed from: a */
    public static synchronized ConnectivityReceiver m30311a(Context context) {
        ConnectivityReceiver connectivityReceiver;
        synchronized (ConnectivityReceiver.class) {
            if (f30040e == null) {
                f30040e = new ConnectivityReceiver(context.getApplicationContext());
                f30040e.mo34038a((ConnectivityListener) new NativeConnectivityListener());
            }
            connectivityReceiver = f30040e;
        }
        return connectivityReceiver;
    }

    /* renamed from: d */
    private boolean m30313d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f30042b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public void mo34039b() {
        this.f30043c--;
        if (this.f30043c == 0) {
            this.f30042b.unregisterReceiver(f30040e);
        }
    }

    /* renamed from: c */
    public boolean mo34040c() {
        Boolean bool = this.f30044d;
        return bool != null ? bool.booleanValue() : m30313d();
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f30044d == null) {
            m30312a(m30313d());
        }
    }

    /* renamed from: a */
    public void mo34037a() {
        if (this.f30043c == 0) {
            this.f30042b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f30043c++;
    }

    /* renamed from: a */
    private void m30312a(boolean z) {
        Logger.m29684v("Mbgl-ConnectivityReceiver", z ? "connected - true" : "connected - false");
        for (ConnectivityListener onNetworkStateChanged : this.f30041a) {
            onNetworkStateChanged.onNetworkStateChanged(z);
        }
    }

    /* renamed from: a */
    public void mo34038a(ConnectivityListener connectivityListener) {
        this.f30041a.add(connectivityListener);
    }
}
