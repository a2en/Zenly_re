package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C10166c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C10162a {

    /* renamed from: a */
    private static final Object f26722a = new Object();

    /* renamed from: b */
    private static volatile C10162a f26723b;

    private C10162a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public static C10162a m25644a() {
        if (f26723b == null) {
            synchronized (f26722a) {
                if (f26723b == null) {
                    f26723b = new C10162a();
                }
            }
        }
        return f26723b;
    }

    /* renamed from: a */
    public final boolean mo27589a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C10166c.m25660c(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: a */
    public boolean mo27588a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo27589a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo27587a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
