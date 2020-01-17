package com.mapbox.android.telemetry.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.content.C0540a;
import com.mapbox.android.core.location.C11274f;
import com.mapbox.android.core.location.C11274f.C11276b;
import com.mapbox.android.core.location.LocationEngine;

/* renamed from: com.mapbox.android.telemetry.location.c */
class C11374c implements C11373b {

    /* renamed from: a */
    private final Context f29467a;

    /* renamed from: b */
    private final LocationEngine f29468b;

    /* renamed from: c */
    private final LocationUpdatesBroadcastReceiver f29469c;

    C11374c(Context context, LocationEngine locationEngine, LocationUpdatesBroadcastReceiver locationUpdatesBroadcastReceiver) {
        this.f29467a = context;
        this.f29468b = locationEngine;
        this.f29469c = locationUpdatesBroadcastReceiver;
    }

    /* renamed from: a */
    private boolean m29287a() {
        return C0540a.m2537a(this.f29467a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* renamed from: b */
    private PendingIntent m29288b() {
        return PendingIntent.getBroadcast(this.f29467a, 0, new Intent("com.mapbox.android.telemetry.location.locationupdatespendingintent.action.LOCATION_UPDATED"), 134217728);
    }

    /* renamed from: c */
    private void m29289c() {
        try {
            this.f29467a.registerReceiver(this.f29469c, new IntentFilter("com.mapbox.android.telemetry.location.locationupdatespendingintent.action.LOCATION_UPDATED"));
        } catch (IllegalArgumentException e) {
            Log.e("LocationController", e.toString());
        }
    }

    /* renamed from: d */
    private void m29290d() {
        this.f29468b.removeLocationUpdates(m29288b());
    }

    /* renamed from: e */
    private void m29291e() {
        String str = "LocationController";
        if (!m29287a()) {
            Log.w(str, "Location permissions are not granted");
            return;
        }
        try {
            this.f29468b.requestLocationUpdates(m29286a(1000), m29288b());
        } catch (SecurityException e) {
            Log.e(str, e.toString());
        }
    }

    /* renamed from: f */
    private void m29292f() {
        try {
            this.f29467a.unregisterReceiver(this.f29469c);
        } catch (IllegalArgumentException e) {
            Log.e("LocationController", e.toString());
        }
    }

    public void onDestroy() {
        m29290d();
        m29292f();
    }

    public void onResume() {
        m29289c();
        m29291e();
    }

    /* renamed from: a */
    private static C11274f m29286a(long j) {
        C11276b bVar = new C11276b(j);
        bVar.mo32710a(3);
        bVar.mo32713b(5000);
        return bVar.mo32712a();
    }
}
