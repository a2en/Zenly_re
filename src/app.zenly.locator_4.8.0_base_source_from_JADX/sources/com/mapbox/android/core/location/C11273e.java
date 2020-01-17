package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mapbox.android.core.location.e */
class C11273e<T> implements LocationEngine {

    /* renamed from: a */
    private final C11271c<T> f29104a;

    /* renamed from: b */
    private Map<LocationEngineCallback<C11277g>, T> f29105b;

    C11273e(C11271c<T> cVar) {
        this.f29104a = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo32703a(LocationEngineCallback<C11277g> locationEngineCallback) {
        if (this.f29105b == null) {
            this.f29105b = new ConcurrentHashMap();
        }
        T t = this.f29105b.get(locationEngineCallback);
        if (t == null) {
            t = this.f29104a.mo32697a(locationEngineCallback);
        }
        this.f29105b.put(locationEngineCallback, t);
        return t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public T mo32704b(LocationEngineCallback<C11277g> locationEngineCallback) {
        Map<LocationEngineCallback<C11277g>, T> map = this.f29105b;
        if (map != null) {
            return map.remove(locationEngineCallback);
        }
        return null;
    }

    public void getLastLocation(LocationEngineCallback<C11277g> locationEngineCallback) throws SecurityException {
        C11280i.m28974a(locationEngineCallback, "callback == null");
        this.f29104a.getLastLocation(locationEngineCallback);
    }

    public void removeLocationUpdates(LocationEngineCallback<C11277g> locationEngineCallback) {
        C11280i.m28974a(locationEngineCallback, "callback == null");
        this.f29104a.mo32694a(mo32704b(locationEngineCallback));
    }

    public void requestLocationUpdates(C11274f fVar, LocationEngineCallback<C11277g> locationEngineCallback, Looper looper) throws SecurityException {
        C11280i.m28974a(fVar, "request == null");
        C11280i.m28974a(locationEngineCallback, "callback == null");
        C11271c<T> cVar = this.f29104a;
        Object a = mo32703a(locationEngineCallback);
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        cVar.mo32700a(fVar, a, looper);
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        this.f29104a.removeLocationUpdates(pendingIntent);
    }

    public void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException {
        C11280i.m28974a(fVar, "request == null");
        this.f29104a.requestLocationUpdates(fVar, pendingIntent);
    }
}
