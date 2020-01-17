package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.mapbox.android.core.location.a */
class C11267a implements C11271c<LocationListener> {

    /* renamed from: a */
    final LocationManager f29099a;

    /* renamed from: b */
    String f29100b = "passive";

    C11267a(Context context) {
        this.f29099a = (LocationManager) context.getSystemService("location");
    }

    /* renamed from: b */
    static Criteria m28923b(int i) {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(m28924c(i));
        criteria.setCostAllowed(true);
        criteria.setPowerRequirement(m28925d(i));
        return criteria;
    }

    /* renamed from: c */
    private static int m28924c(int i) {
        return (i == 0 || i == 1) ? 1 : 2;
    }

    /* renamed from: d */
    private static int m28925d(int i) {
        if (i != 0) {
            return i != 1 ? 1 : 2;
        }
        return 3;
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f29099a.removeUpdates(pendingIntent);
        }
    }

    public void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException {
        this.f29100b = m28922a(fVar.mo32709e());
        this.f29099a.requestLocationUpdates(this.f29100b, fVar.mo32707c(), fVar.mo32705a(), pendingIntent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Location mo32691a(String str) throws SecurityException {
        try {
            return this.f29099a.getLastKnownLocation(str);
        } catch (IllegalArgumentException e) {
            Log.e("AndroidLocationEngine", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public void mo32693a(C11274f fVar, LocationListener locationListener, Looper looper) throws SecurityException {
        this.f29100b = m28922a(fVar.mo32709e());
        this.f29099a.requestLocationUpdates(this.f29100b, fVar.mo32707c(), fVar.mo32705a(), locationListener, looper);
    }

    /* renamed from: a */
    public void mo32694a(LocationListener locationListener) {
        if (locationListener != null) {
            this.f29099a.removeUpdates(locationListener);
        }
    }

    /* renamed from: a */
    private String m28922a(int i) {
        String bestProvider = i != 3 ? this.f29099a.getBestProvider(m28923b(i), true) : null;
        return bestProvider != null ? bestProvider : "passive";
    }
}
