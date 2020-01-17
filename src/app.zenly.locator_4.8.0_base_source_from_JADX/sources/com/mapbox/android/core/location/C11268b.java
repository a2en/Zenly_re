package com.mapbox.android.core.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.C10559a;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.mapbox.android.core.location.b */
class C11268b implements C11271c<C10566d> {

    /* renamed from: a */
    private final C10559a f29101a;

    /* renamed from: com.mapbox.android.core.location.b$a */
    static final class C11269a implements OnSuccessListener<Location>, OnFailureListener {

        /* renamed from: a */
        private final LocationEngineCallback<C11277g> f29102a;

        C11269a(LocationEngineCallback<C11277g> locationEngineCallback) {
            this.f29102a = locationEngineCallback;
        }

        /* renamed from: a */
        public void onSuccess(Location location) {
            C11277g gVar;
            LocationEngineCallback<C11277g> locationEngineCallback = this.f29102a;
            if (location != null) {
                gVar = C11277g.m28961a(location);
            } else {
                gVar = C11277g.m28962a(Collections.emptyList());
            }
            locationEngineCallback.onSuccess(gVar);
        }

        public void onFailure(Exception exc) {
            this.f29102a.onFailure(exc);
        }
    }

    /* renamed from: com.mapbox.android.core.location.b$b */
    private static final class C11270b extends C10566d {

        /* renamed from: a */
        private final LocationEngineCallback<C11277g> f29103a;

        C11270b(LocationEngineCallback<C11277g> locationEngineCallback) {
            this.f29103a = locationEngineCallback;
        }

        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            List b = locationResult.mo28662b();
            if (!b.isEmpty()) {
                this.f29103a.onSuccess(C11277g.m28962a(b));
            } else {
                this.f29103a.onFailure(new Exception("Unavailable location"));
            }
        }
    }

    C11268b(Context context) {
        this.f29101a = C10568e.m27017a(context);
    }

    /* renamed from: a */
    private static int m28930a(int i) {
        if (i == 0) {
            return 100;
        }
        if (i != 1) {
            return i != 2 ? 105 : 104;
        }
        return 102;
    }

    public void getLastLocation(LocationEngineCallback<C11277g> locationEngineCallback) throws SecurityException {
        C11269a aVar = new C11269a(locationEngineCallback);
        C10693c f = this.f29101a.mo28685f();
        f.mo29301a((OnSuccessListener<? super TResult>) aVar);
        f.mo29300a((OnFailureListener) aVar);
    }

    public void removeLocationUpdates(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f29101a.mo28680a(pendingIntent);
        }
    }

    public void requestLocationUpdates(C11274f fVar, PendingIntent pendingIntent) throws SecurityException {
        this.f29101a.mo28681a(m28931a(fVar), pendingIntent);
    }

    /* renamed from: a */
    public C10566d m28933a(LocationEngineCallback<C11277g> locationEngineCallback) {
        return new C11270b(locationEngineCallback);
    }

    /* renamed from: a */
    public void mo32700a(C11274f fVar, C10566d dVar, Looper looper) throws SecurityException {
        this.f29101a.mo28682a(m28931a(fVar), dVar, looper);
    }

    /* renamed from: a */
    public void mo32694a(C10566d dVar) {
        if (dVar != null) {
            this.f29101a.mo28683a(dVar);
        }
    }

    /* renamed from: a */
    private static LocationRequest m28931a(C11274f fVar) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(fVar.mo32707c());
        locationRequest.setFastestInterval(fVar.mo32706b());
        locationRequest.setSmallestDisplacement(fVar.mo32705a());
        locationRequest.setMaxWaitTime(fVar.mo32708d());
        locationRequest.setPriority(m28930a(fVar.mo32709e()));
        return locationRequest;
    }
}
