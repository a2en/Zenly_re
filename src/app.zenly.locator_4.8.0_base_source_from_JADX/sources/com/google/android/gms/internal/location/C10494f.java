package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.C10557a;
import com.google.android.gms.location.zzal;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.f */
public final class C10494f implements GeofencingApi {
    /* renamed from: a */
    private final PendingResult<Status> m26873a(GoogleApiClient googleApiClient, zzal zzal) {
        return googleApiClient.mo27045b(new C10498h(this, googleApiClient, zzal));
    }

    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.mo27045b(new C10496g(this, googleApiClient, geofencingRequest, pendingIntent));
    }

    @Deprecated
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        C10557a aVar = new C10557a();
        aVar.mo28633a(list);
        aVar.mo28631a(5);
        return addGeofences(googleApiClient, aVar.mo28634a(), pendingIntent);
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return m26873a(googleApiClient, zzal.m27032a(pendingIntent));
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        return m26873a(googleApiClient, zzal.m27033a(list));
    }
}
