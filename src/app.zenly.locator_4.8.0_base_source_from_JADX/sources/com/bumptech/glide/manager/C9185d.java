package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0540a;
import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;

/* renamed from: com.bumptech.glide.manager.d */
public class C9185d implements ConnectivityMonitorFactory {
    public ConnectivityMonitor build(Context context, ConnectivityListener connectivityListener) {
        boolean z = C0540a.m2537a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        String str = "ConnectivityMonitor";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new C9183c(context, connectivityListener);
        }
        return new C9187f();
    }
}
