package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.v */
public final class C10526v extends C10499h0 {

    /* renamed from: E */
    private final C10512o f27433E;

    public C10526v(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, C10103d dVar) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, dVar);
        this.f27433E = new C10512o(context, this.f27406D);
    }

    /* renamed from: a */
    public final void mo28378a(PendingIntent pendingIntent, zzaj zzaj) throws RemoteException {
        this.f27433E.mo28362a(pendingIntent, zzaj);
    }

    /* renamed from: a */
    public final void mo28379a(Location location) throws RemoteException {
        this.f27433E.mo28363a(location);
    }

    /* renamed from: a */
    public final void mo28380a(C10006a<LocationListener> aVar, zzaj zzaj) throws RemoteException {
        this.f27433E.mo28364a(aVar, zzaj);
    }

    /* renamed from: a */
    public final void mo28381a(zzaj zzaj) throws RemoteException {
        this.f27433E.mo28365a(zzaj);
    }

    /* renamed from: a */
    public final void mo28382a(zzbd zzbd, ListenerHolder<C10566d> listenerHolder, zzaj zzaj) throws RemoteException {
        synchronized (this.f27433E) {
            this.f27433E.mo28366a(zzbd, listenerHolder, zzaj);
        }
    }

    /* renamed from: a */
    public final void mo28383a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation$ResultHolder<Status> baseImplementation$ResultHolder) throws RemoteException {
        mo27355a();
        C10123l.m25506a(geofencingRequest, (Object) "geofencingRequest can't be null.");
        C10123l.m25506a(pendingIntent, (Object) "PendingIntent must be specified.");
        C10123l.m25506a(baseImplementation$ResultHolder, (Object) "ResultHolder not provided.");
        ((zzao) mo27380i()).zza(geofencingRequest, pendingIntent, (zzam) new C10528x(baseImplementation$ResultHolder));
    }

    /* renamed from: a */
    public final void mo28384a(LocationRequest locationRequest, PendingIntent pendingIntent, zzaj zzaj) throws RemoteException {
        this.f27433E.mo28367a(locationRequest, pendingIntent, zzaj);
    }

    /* renamed from: a */
    public final void mo28385a(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzaj zzaj) throws RemoteException {
        synchronized (this.f27433E) {
            this.f27433E.mo28368a(locationRequest, listenerHolder, zzaj);
        }
    }

    /* renamed from: a */
    public final void mo28386a(LocationSettingsRequest locationSettingsRequest, BaseImplementation$ResultHolder<LocationSettingsResult> baseImplementation$ResultHolder, String str) throws RemoteException {
        mo27355a();
        boolean z = true;
        C10123l.m25513a(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (baseImplementation$ResultHolder == null) {
            z = false;
        }
        C10123l.m25513a(z, (Object) "listener can't be null.");
        ((zzao) mo27380i()).zza(locationSettingsRequest, (zzaq) new C10530z(baseImplementation$ResultHolder), str);
    }

    /* renamed from: a */
    public final void mo28387a(zzal zzal, BaseImplementation$ResultHolder<Status> baseImplementation$ResultHolder) throws RemoteException {
        mo27355a();
        C10123l.m25506a(zzal, (Object) "removeGeofencingRequest can't be null.");
        C10123l.m25506a(baseImplementation$ResultHolder, (Object) "ResultHolder not provided.");
        ((zzao) mo27380i()).zza(zzal, (zzam) new C10529y(baseImplementation$ResultHolder));
    }

    /* renamed from: a */
    public final void mo28388a(boolean z) throws RemoteException {
        this.f27433E.mo28369a(z);
    }

    /* renamed from: b */
    public final void mo28389b(C10006a<C10566d> aVar, zzaj zzaj) throws RemoteException {
        this.f27433E.mo28371b(aVar, zzaj);
    }

    public final void disconnect() {
        synchronized (this.f27433E) {
            if (isConnected()) {
                try {
                    this.f27433E.mo28370b();
                    this.f27433E.mo28372c();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: n */
    public final Location mo27501n() throws RemoteException {
        return this.f27433E.mo28361a();
    }
}
