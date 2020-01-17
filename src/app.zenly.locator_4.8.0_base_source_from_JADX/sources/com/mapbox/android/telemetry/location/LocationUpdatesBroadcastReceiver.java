package com.mapbox.android.telemetry.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import com.mapbox.android.core.location.C11277g;
import com.mapbox.android.telemetry.C11354i0;
import com.mapbox.android.telemetry.Event;

public class LocationUpdatesBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static boolean m29275a(Location location) {
        return Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isInfinite(location.getAltitude()) || Float.isInfinite(location.getAccuracy());
    }

    /* renamed from: b */
    private static boolean m29276b(Location location) {
        return Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isNaN(location.getAltitude()) || Float.isNaN(location.getAccuracy());
    }

    public void onReceive(Context context, Intent intent) {
        String str = "LocationUpdateReceiver";
        if (intent == null) {
            try {
                Log.w(str, "intent == null");
            } catch (Throwable unused) {
            }
        } else {
            if ("com.mapbox.android.telemetry.location.locationupdatespendingintent.action.LOCATION_UPDATED".equals(intent.getAction())) {
                C11277g c = C11277g.m28964c(intent);
                if (c == null) {
                    Log.w(str, "LocationEngineResult == null");
                    return;
                }
                C11371a d = C11371a.m29279d();
                C11354i0 b = d.mo33018b();
                String a = d.mo33014a();
                for (Location location : c.mo32715b()) {
                    if (!m29276b(location)) {
                        if (!m29275a(location)) {
                            b.mo32998a((Event) C11375d.m29295a(location, a));
                        }
                    }
                }
            }
        }
    }
}
