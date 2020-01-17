package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.os.Looper;

/* renamed from: com.mapbox.android.core.location.c */
interface C11271c<T> {
    /* renamed from: a */
    T mo32697a(LocationEngineCallback<C11277g> locationEngineCallback);

    /* renamed from: a */
    void mo32700a(C11274f fVar, T t, Looper looper) throws SecurityException;

    /* renamed from: a */
    void mo32694a(T t);

    void getLastLocation(LocationEngineCallback<C11277g> locationEngineCallback) throws SecurityException;

    void removeLocationUpdates(PendingIntent pendingIntent);

    void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException;
}
