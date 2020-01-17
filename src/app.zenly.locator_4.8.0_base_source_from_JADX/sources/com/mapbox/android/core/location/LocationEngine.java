package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.os.Looper;

public interface LocationEngine {
    void getLastLocation(LocationEngineCallback<C11277g> locationEngineCallback) throws SecurityException;

    void removeLocationUpdates(PendingIntent pendingIntent);

    void removeLocationUpdates(LocationEngineCallback<C11277g> locationEngineCallback);

    void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException;

    void requestLocationUpdates(C11274f fVar, LocationEngineCallback<C11277g> locationEngineCallback, Looper looper) throws SecurityException;
}
