package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.mapbox.android.core.location.h */
class C11278h extends C11267a {

    /* renamed from: com.mapbox.android.core.location.h$a */
    private static final class C11279a implements LocationListener {

        /* renamed from: a */
        private final LocationEngineCallback<C11277g> f29117a;

        /* renamed from: b */
        private Location f29118b;

        C11279a(LocationEngineCallback<C11277g> locationEngineCallback) {
            this.f29117a = locationEngineCallback;
        }

        public void onLocationChanged(Location location) {
            if (C11280i.m28975a(location, this.f29118b)) {
                this.f29118b = location;
            }
            LocationEngineCallback<C11277g> locationEngineCallback = this.f29117a;
            if (locationEngineCallback != null) {
                locationEngineCallback.onSuccess(C11277g.m28961a(this.f29118b));
            }
        }

        public void onProviderDisabled(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onProviderDisabled: ");
            sb.append(str);
            Log.d("MapboxLocationEngine", sb.toString());
        }

        public void onProviderEnabled(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onProviderEnabled: ");
            sb.append(str);
            Log.d("MapboxLocationEngine", sb.toString());
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("onStatusChanged: ");
            sb.append(str);
            Log.d("MapboxLocationEngine", sb.toString());
        }
    }

    C11278h(Context context) {
        super(context);
    }

    public void getLastLocation(LocationEngineCallback<C11277g> locationEngineCallback) throws SecurityException {
        Location a = m28968a();
        if (a != null) {
            locationEngineCallback.onSuccess(C11277g.m28961a(a));
        } else {
            locationEngineCallback.onFailure(new Exception("Last location unavailable"));
        }
    }

    public void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException {
        super.requestLocationUpdates(fVar, pendingIntent);
        if (m28969a(fVar.mo32709e())) {
            try {
                this.f29099a.requestLocationUpdates("network", fVar.mo32707c(), fVar.mo32705a(), pendingIntent);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public LocationListener m28971a(LocationEngineCallback<C11277g> locationEngineCallback) {
        return new C11279a(locationEngineCallback);
    }

    /* renamed from: a */
    public void mo32700a(C11274f fVar, LocationListener locationListener, Looper looper) throws SecurityException {
        super.mo32693a(fVar, locationListener, looper);
        if (m28969a(fVar.mo32709e())) {
            try {
                this.f29099a.requestLocationUpdates("network", fVar.mo32707c(), fVar.mo32705a(), locationListener, looper);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private Location m28968a() {
        Location location = null;
        for (String a : this.f29099a.getAllProviders()) {
            Location a2 = mo32691a(a);
            if (a2 != null && C11280i.m28975a(a2, location)) {
                location = a2;
            }
        }
        return location;
    }

    /* renamed from: a */
    private boolean m28969a(int i) {
        if ((i == 0 || i == 1) && this.f29100b.equals("gps")) {
            return true;
        }
        return false;
    }
}
