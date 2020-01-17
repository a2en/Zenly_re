package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.l0 */
public final class C10507l0 implements FusedLocationProviderApi {
    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.mo27045b(new C10517q0(this, googleApiClient));
    }

    public final Location getLastLocation(GoogleApiClient googleApiClient) {
        C10568e.m27016a(googleApiClient);
        throw null;
    }

    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        C10568e.m27016a(googleApiClient);
        throw null;
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.mo27045b(new C10486b(this, googleApiClient, pendingIntent));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.mo27045b(new C10525u0(this, googleApiClient, locationListener));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, C10566d dVar) {
        return googleApiClient.mo27045b(new C10511n0(this, googleApiClient, dVar));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.mo27045b(new C10523t0(this, googleApiClient, locationRequest, pendingIntent));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        C10123l.m25506a(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
        return googleApiClient.mo27045b(new C10509m0(this, googleApiClient, locationRequest, locationListener));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        C10519r0 r0Var = new C10519r0(this, googleApiClient, locationRequest, locationListener, looper);
        return googleApiClient.mo27045b(r0Var);
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, C10566d dVar, Looper looper) {
        C10521s0 s0Var = new C10521s0(this, googleApiClient, locationRequest, dVar, looper);
        return googleApiClient.mo27045b(s0Var);
    }

    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.mo27045b(new C10515p0(this, googleApiClient, location));
    }

    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.mo27045b(new C10513o0(this, googleApiClient, z));
    }
}
