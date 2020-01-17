package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder.C10006a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.o */
public final class C10512o {

    /* renamed from: a */
    private final zzbj<zzao> f27411a;

    /* renamed from: b */
    private final Context f27412b;

    /* renamed from: c */
    private boolean f27413c = false;

    /* renamed from: d */
    private final Map<C10006a<LocationListener>, C10522t> f27414d = new HashMap();

    /* renamed from: e */
    private final Map<C10006a<Object>, C10520s> f27415e = new HashMap();

    /* renamed from: f */
    private final Map<C10006a<C10566d>, C10514p> f27416f = new HashMap();

    public C10512o(Context context, zzbj<zzao> zzbj) {
        this.f27412b = context;
        this.f27411a = zzbj;
    }

    /* renamed from: a */
    private final C10522t m26893a(ListenerHolder<LocationListener> listenerHolder) {
        C10522t tVar;
        synchronized (this.f27414d) {
            tVar = (C10522t) this.f27414d.get(listenerHolder.mo27135b());
            if (tVar == null) {
                tVar = new C10522t(listenerHolder);
            }
            this.f27414d.put(listenerHolder.mo27135b(), tVar);
        }
        return tVar;
    }

    /* renamed from: b */
    private final C10514p m26894b(ListenerHolder<C10566d> listenerHolder) {
        C10514p pVar;
        synchronized (this.f27416f) {
            pVar = (C10514p) this.f27416f.get(listenerHolder.mo27135b());
            if (pVar == null) {
                pVar = new C10514p(listenerHolder);
            }
            this.f27416f.put(listenerHolder.mo27135b(), pVar);
        }
        return pVar;
    }

    /* renamed from: a */
    public final Location mo28361a() throws RemoteException {
        this.f27411a.checkConnected();
        return ((zzao) this.f27411a.getService()).zza(this.f27412b.getPackageName());
    }

    /* renamed from: a */
    public final void mo28362a(PendingIntent pendingIntent, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        zzao zzao = (zzao) this.f27411a.getService();
        zzbf zzbf = new zzbf(2, null, null, pendingIntent, null, zzaj != null ? zzaj.asBinder() : null);
        zzao.zza(zzbf);
    }

    /* renamed from: a */
    public final void mo28363a(Location location) throws RemoteException {
        this.f27411a.checkConnected();
        ((zzao) this.f27411a.getService()).zza(location);
    }

    /* renamed from: a */
    public final void mo28364a(C10006a<LocationListener> aVar, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        C10123l.m25506a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f27414d) {
            C10522t tVar = (C10522t) this.f27414d.remove(aVar);
            if (tVar != null) {
                tVar.mo28376a();
                ((zzao) this.f27411a.getService()).zza(zzbf.m26933a((zzx) tVar, zzaj));
            }
        }
    }

    /* renamed from: a */
    public final void mo28365a(zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        ((zzao) this.f27411a.getService()).zza(zzaj);
    }

    /* renamed from: a */
    public final void mo28366a(zzbd zzbd, ListenerHolder<C10566d> listenerHolder, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        zzao zzao = (zzao) this.f27411a.getService();
        zzbf zzbf = new zzbf(1, zzbd, null, null, m26894b(listenerHolder).asBinder(), zzaj != null ? zzaj.asBinder() : null);
        zzao.zza(zzbf);
    }

    /* renamed from: a */
    public final void mo28367a(LocationRequest locationRequest, PendingIntent pendingIntent, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        zzao zzao = (zzao) this.f27411a.getService();
        zzbf zzbf = new zzbf(1, zzbd.m26931a(locationRequest), null, pendingIntent, null, zzaj != null ? zzaj.asBinder() : null);
        zzao.zza(zzbf);
    }

    /* renamed from: a */
    public final void mo28368a(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        zzao zzao = (zzao) this.f27411a.getService();
        zzbf zzbf = new zzbf(1, zzbd.m26931a(locationRequest), m26893a(listenerHolder).asBinder(), null, null, zzaj != null ? zzaj.asBinder() : null);
        zzao.zza(zzbf);
    }

    /* renamed from: a */
    public final void mo28369a(boolean z) throws RemoteException {
        this.f27411a.checkConnected();
        ((zzao) this.f27411a.getService()).zza(z);
        this.f27413c = z;
    }

    /* renamed from: b */
    public final void mo28370b() throws RemoteException {
        synchronized (this.f27414d) {
            for (C10522t tVar : this.f27414d.values()) {
                if (tVar != null) {
                    ((zzao) this.f27411a.getService()).zza(zzbf.m26933a((zzx) tVar, (zzaj) null));
                }
            }
            this.f27414d.clear();
        }
        synchronized (this.f27416f) {
            for (C10514p pVar : this.f27416f.values()) {
                if (pVar != null) {
                    ((zzao) this.f27411a.getService()).zza(zzbf.m26932a((zzu) pVar, (zzaj) null));
                }
            }
            this.f27416f.clear();
        }
        synchronized (this.f27415e) {
            for (C10520s sVar : this.f27415e.values()) {
                if (sVar != null) {
                    ((zzao) this.f27411a.getService()).zza(new zzo(2, null, sVar.asBinder(), null));
                }
            }
            this.f27415e.clear();
        }
    }

    /* renamed from: b */
    public final void mo28371b(C10006a<C10566d> aVar, zzaj zzaj) throws RemoteException {
        this.f27411a.checkConnected();
        C10123l.m25506a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f27416f) {
            C10514p pVar = (C10514p) this.f27416f.remove(aVar);
            if (pVar != null) {
                pVar.mo28373a();
                ((zzao) this.f27411a.getService()).zza(zzbf.m26932a((zzu) pVar, zzaj));
            }
        }
    }

    /* renamed from: c */
    public final void mo28372c() throws RemoteException {
        if (this.f27413c) {
            mo28369a(false);
        }
    }
}
