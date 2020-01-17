package com.mapbox.mapboxsdk.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import com.mapbox.android.core.location.C11274f;
import com.mapbox.android.core.location.C11274f.C11276b;
import com.mapbox.android.core.location.C11277g;
import com.mapbox.android.core.location.LocationEngine;
import com.mapbox.android.core.location.LocationEngineCallback;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.Style;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mapbox.mapboxsdk.location.c */
public final class C11474c {

    /* renamed from: A */
    private CompassListener f29684A;

    /* renamed from: a */
    private final MapboxMap f29685a;

    /* renamed from: b */
    private Style f29686b;

    /* renamed from: c */
    private LocationComponentOptions f29687c;

    /* renamed from: d */
    private LocationEngine f29688d;

    /* renamed from: e */
    private C11274f f29689e;

    /* renamed from: f */
    private LocationEngineCallback<C11277g> f29690f = new C11484j(this);

    /* renamed from: g */
    private LocationEngineCallback<C11277g> f29691g = new C11486l(this);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11488e f29692h;

    /* renamed from: i */
    private C11473b f29693i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C11472a f29694j;

    /* renamed from: k */
    private Location f29695k;

    /* renamed from: l */
    private CameraPosition f29696l;

    /* renamed from: m */
    private boolean f29697m;

    /* renamed from: n */
    private boolean f29698n;

    /* renamed from: o */
    private boolean f29699o;

    /* renamed from: p */
    private boolean f29700p;

    /* renamed from: q */
    private C11490g f29701q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<OnLocationStaleListener> f29702r = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final CopyOnWriteArrayList<OnLocationClickListener> f29703s = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final CopyOnWriteArrayList<OnLocationLongClickListener> f29704t = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final CopyOnWriteArrayList<OnCameraTrackingChangedListener> f29705u = new CopyOnWriteArrayList<>();

    /* renamed from: v */
    private final CopyOnWriteArrayList<OnRenderModeChangedListener> f29706v = new CopyOnWriteArrayList<>();

    /* renamed from: w */
    private long f29707w;

    /* renamed from: x */
    private long f29708x;

    /* renamed from: y */
    private OnCameraMoveListener f29709y = new C11475a();

    /* renamed from: z */
    private OnCameraIdleListener f29710z = new C11476b();

    /* renamed from: com.mapbox.mapboxsdk.location.c$a */
    class C11475a implements OnCameraMoveListener {
        C11475a() {
        }

        public void onCameraMove() {
            C11474c.this.m29648a(false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$b */
    class C11476b implements OnCameraIdleListener {
        C11476b() {
        }

        public void onCameraIdle() {
            C11474c.this.m29648a(false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$c */
    class C11477c implements OnMapClickListener {
        C11477c() {
        }

        public boolean onMapClick(LatLng latLng) {
            if (C11474c.this.f29703s.isEmpty()) {
                return false;
            }
            C11474c.this.f29692h.mo33470a(latLng);
            throw null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$d */
    class C11478d implements OnMapLongClickListener {
        C11478d() {
        }

        public boolean onMapLongClick(LatLng latLng) {
            if (C11474c.this.f29704t.isEmpty()) {
                return false;
            }
            C11474c.this.f29692h.mo33470a(latLng);
            throw null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$e */
    class C11479e implements OnLocationStaleListener {
        C11479e() {
        }

        public void onStaleStateChange(boolean z) {
            C11474c.this.f29692h.mo33469a(z);
            throw null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$f */
    class C11480f implements C11489f {
        C11480f(C11474c cVar) {
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$g */
    class C11481g implements CompassListener {
        C11481g() {
        }

        public void onCompassAccuracyChange(int i) {
        }

        public void onCompassChanged(float f) {
            C11474c.m29645a(C11474c.this, f);
            throw null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$h */
    class C11482h implements OnCameraTrackingChangedListener {
        C11482h() {
        }

        public void onCameraTrackingChanged(int i) {
            C11474c.this.f29694j.mo33449a();
            throw null;
        }

        public void onCameraTrackingDismissed() {
            Iterator it = C11474c.this.f29705u.iterator();
            while (it.hasNext()) {
                ((OnCameraTrackingChangedListener) it.next()).onCameraTrackingDismissed();
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$i */
    class C11483i implements OnRenderModeChangedListener {
        C11483i() {
        }

        public void onRenderModeChanged(int i) {
            C11474c.m29650b(C11474c.this);
            throw null;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$j */
    static final class C11484j implements LocationEngineCallback<C11277g> {

        /* renamed from: a */
        private final WeakReference<C11474c> f29719a;

        C11484j(C11474c cVar) {
            this.f29719a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void onSuccess(C11277g gVar) {
            C11474c cVar = (C11474c) this.f29719a.get();
            if (cVar != null) {
                cVar.m29649b(gVar.mo32714a(), false);
            }
        }

        public void onFailure(Exception exc) {
            Logger.m29681e("Mbgl-LocationComponent", "Failed to obtain location update", exc);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$k */
    static class C11485k {
        C11485k() {
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.c$l */
    static final class C11486l implements LocationEngineCallback<C11277g> {

        /* renamed from: a */
        private final WeakReference<C11474c> f29720a;

        C11486l(C11474c cVar) {
            this.f29720a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void onSuccess(C11277g gVar) {
            C11474c cVar = (C11474c) this.f29720a.get();
            if (cVar != null) {
                cVar.m29649b(gVar.mo32714a(), true);
            }
        }

        public void onFailure(Exception exc) {
            Logger.m29681e("Mbgl-LocationComponent", "Failed to obtain last location update", exc);
        }
    }

    public C11474c(MapboxMap mapboxMap) {
        new C11485k();
        C11276b bVar = new C11276b(1000);
        bVar.mo32711a(1000);
        bVar.mo32710a(0);
        this.f29689e = bVar.mo32712a();
        new C11477c();
        new C11478d();
        new C11479e();
        new C11480f(this);
        this.f29684A = new C11481g();
        new C11482h();
        new C11483i();
        this.f29685a = mapboxMap;
    }

    /* renamed from: b */
    static /* synthetic */ void m29650b(C11474c cVar) {
        cVar.m29659k();
        throw null;
    }

    /* renamed from: g */
    private void m29655g() {
        if (!this.f29697m) {
            throw new C11487d();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: h */
    private void m29656h() {
        if (this.f29697m && this.f29699o && this.f29685a.mo33571h() != null) {
            if (!this.f29700p) {
                this.f29700p = true;
                this.f29685a.mo33557a(this.f29709y);
                this.f29685a.mo33556a(this.f29710z);
                if (this.f29687c.mo33425o()) {
                    this.f29701q.mo33473a();
                    throw null;
                }
            }
            if (this.f29698n) {
                LocationEngine locationEngine = this.f29688d;
                if (locationEngine != null) {
                    try {
                        locationEngine.requestLocationUpdates(this.f29689e, this.f29690f, Looper.getMainLooper());
                    } catch (SecurityException e) {
                        Logger.m29681e("Mbgl-LocationComponent", "Unable to request location updates", e);
                    }
                }
                this.f29693i.mo33452a();
                throw null;
            }
        }
    }

    /* renamed from: i */
    private void m29657i() {
        if (this.f29697m && this.f29700p && this.f29699o) {
            this.f29700p = false;
            this.f29692h.mo33471b();
            throw null;
        }
    }

    /* renamed from: j */
    private void m29658j() {
        this.f29692h.mo33472c();
        throw null;
    }

    /* renamed from: k */
    private void m29659k() {
        new HashSet();
        this.f29692h.mo33465a();
        throw null;
    }

    /* renamed from: b */
    public void mo33454b() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29649b(Location location, boolean z) {
        if (location != null) {
            if (!this.f29700p) {
                this.f29695k = location;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f29708x >= this.f29707w) {
                this.f29708x = elapsedRealtime;
                m29658j();
                throw null;
            }
        }
    }

    /* renamed from: c */
    public void mo33455c() {
        if (this.f29697m) {
            this.f29686b = this.f29685a.mo33571h();
            this.f29692h.mo33468a(this.f29686b, this.f29687c);
            throw null;
        }
    }

    /* renamed from: d */
    public void mo33456d() {
        this.f29699o = true;
        m29656h();
    }

    /* renamed from: e */
    public void mo33457e() {
        m29657i();
    }

    /* renamed from: f */
    public void mo33458f() {
        m29657i();
        this.f29699o = false;
    }

    /* renamed from: a */
    static /* synthetic */ void m29645a(C11474c cVar, float f) {
        cVar.m29643a(f);
        throw null;
    }

    /* renamed from: a */
    public Location mo33453a() {
        m29655g();
        return this.f29695k;
    }

    /* renamed from: a */
    private void m29643a(float f) {
        this.f29694j.mo33450a(f, this.f29685a.mo33541a());
        throw null;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public void m29648a(boolean z) {
        CameraPosition a = this.f29685a.mo33541a();
        CameraPosition cameraPosition = this.f29696l;
        if (cameraPosition == null || z) {
            this.f29696l = a;
            this.f29692h.mo33467a((float) a.bearing);
            throw null;
        }
        double d = a.bearing;
        if (d == cameraPosition.bearing) {
            double d2 = a.tilt;
            if (d2 != cameraPosition.tilt) {
                this.f29692h.mo33466a(d2);
                throw null;
            } else if (a.zoom == cameraPosition.zoom) {
                this.f29696l = a;
            } else {
                m29644a(mo33453a(), true);
                throw null;
            }
        } else {
            this.f29692h.mo33467a((float) d);
            throw null;
        }
    }

    /* renamed from: a */
    private void m29644a(Location location, boolean z) {
        this.f29694j.mo33451a(C11491h.m29677a(this.f29685a, location), z);
        throw null;
    }

    C11474c() {
        new C11485k();
        C11276b bVar = new C11276b(1000);
        bVar.mo32711a(1000);
        bVar.mo32710a(0);
        this.f29689e = bVar.mo32712a();
        new C11477c();
        new C11478d();
        new C11479e();
        new C11480f(this);
        this.f29684A = new C11481g();
        new C11482h();
        new C11483i();
        this.f29685a = null;
    }
}
