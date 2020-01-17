package com.evernote.android.job.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.evernote.android.job.C9450h.C9454d;
import p214e.p234h.p239h.C7632a;

/* renamed from: com.evernote.android.job.util.b */
public final class C9468b {
    @TargetApi(17)
    /* renamed from: a */
    public static C9467a m23026a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return C9467a.f24525c;
        }
        float intExtra = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = false;
        int intExtra2 = registerReceiver.getIntExtra("plugged", 0);
        if (intExtra2 == 1 || intExtra2 == 2 || (VERSION.SDK_INT >= 17 && intExtra2 == 4)) {
            z = true;
        }
        return new C9467a(z, intExtra);
    }

    /* renamed from: a */
    public static boolean m23027a() {
        return false;
    }

    /* renamed from: b */
    public static C9454d m23028b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return C9454d.ANY;
        }
        if (!C7632a.m18586a(connectivityManager)) {
            return C9454d.UNMETERED;
        }
        if (activeNetworkInfo.isRoaming()) {
            return C9454d.CONNECTED;
        }
        return C9454d.NOT_ROAMING;
    }

    /* renamed from: c */
    public static boolean m23029c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i >= 23) {
            if (!powerManager.isDeviceIdleMode() && powerManager.isInteractive()) {
                z = false;
            }
            return z;
        } else if (i >= 20) {
            return !powerManager.isInteractive();
        } else {
            return !powerManager.isScreenOn();
        }
    }
}
