package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.dynamic.C10184a;
import com.google.android.gms.dynamic.C10186b;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.C10620i;
import com.google.android.gms.maps.internal.C10621j;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {

    /* renamed from: e */
    private final C10602b f27582e;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C10601a implements MapLifecycleDelegate {

        /* renamed from: a */
        private final ViewGroup f27583a;

        /* renamed from: b */
        private final IMapViewDelegate f27584b;

        /* renamed from: c */
        private View f27585c;

        public C10601a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            C10123l.m25505a(iMapViewDelegate);
            this.f27584b = iMapViewDelegate;
            C10123l.m25505a(viewGroup);
            this.f27583a = viewGroup;
        }

        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f27584b.getMapAsync(new C10608f(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onCreate(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C10620i.m27085a(bundle, bundle2);
                this.f27584b.onCreate(bundle2);
                C10620i.m27085a(bundle2, bundle);
                this.f27585c = (View) C10186b.m25716a(this.f27584b.getView());
                this.f27583a.removeAllViews();
                this.f27583a.addView(this.f27585c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public final void onDestroy() {
            try {
                this.f27584b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public final void onLowMemory() {
            try {
                this.f27584b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onPause() {
            try {
                this.f27584b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onResume() {
            try {
                this.f27584b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C10620i.m27085a(bundle, bundle2);
                this.f27584b.onSaveInstanceState(bundle2);
                C10620i.m27085a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.f27584b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.f27584b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C10602b extends C10184a<C10601a> {

        /* renamed from: e */
        private final ViewGroup f27586e;

        /* renamed from: f */
        private final Context f27587f;

        /* renamed from: g */
        private OnDelegateCreatedListener<C10601a> f27588g;

        /* renamed from: h */
        private final GoogleMapOptions f27589h;

        /* renamed from: i */
        private final List<OnMapReadyCallback> f27590i = new ArrayList();

        C10602b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f27586e = viewGroup;
            this.f27587f = context;
            this.f27589h = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo27641a(OnDelegateCreatedListener<C10601a> onDelegateCreatedListener) {
            this.f27588g = onDelegateCreatedListener;
            if (this.f27588g != null && mo27639a() == null) {
                try {
                    C10605c.m27078a(this.f27587f);
                    IMapViewDelegate zza = C10621j.m27087a(this.f27587f).zza(C10186b.m25715a(this.f27587f), this.f27589h);
                    if (zza != null) {
                        this.f27588g.onDelegateCreated(new C10601a(this.f27586e, zza));
                        for (OnMapReadyCallback mapAsync : this.f27590i) {
                            ((C10601a) mo27639a()).getMapAsync(mapAsync);
                        }
                        this.f27590i.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo28813a(OnMapReadyCallback onMapReadyCallback) {
            if (mo27639a() != null) {
                ((C10601a) mo27639a()).getMapAsync(onMapReadyCallback);
            } else {
                this.f27590i.add(onMapReadyCallback);
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f27582e = new C10602b(this, context, null);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo28804a(Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            this.f27582e.mo27640a(bundle);
            if (this.f27582e.mo27639a() == null) {
                C10184a.m25702a((FrameLayout) this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: b */
    public final void mo28806b() {
        this.f27582e.mo27644c();
    }

    /* renamed from: c */
    public final void mo28808c() {
        this.f27582e.mo27645d();
    }

    /* renamed from: d */
    public final void mo28809d() {
        this.f27582e.mo27646e();
    }

    /* renamed from: e */
    public final void mo28810e() {
        this.f27582e.mo27647f();
    }

    /* renamed from: f */
    public final void mo28811f() {
        this.f27582e.mo27648g();
    }

    /* renamed from: b */
    public final void mo28807b(Bundle bundle) {
        this.f27582e.mo27643b(bundle);
    }

    /* renamed from: a */
    public final void mo28803a() {
        this.f27582e.mo27642b();
    }

    /* renamed from: a */
    public void mo28805a(OnMapReadyCallback onMapReadyCallback) {
        C10123l.m25511a("getMapAsync() must be called on the main thread");
        this.f27582e.mo28813a(onMapReadyCallback);
    }
}
