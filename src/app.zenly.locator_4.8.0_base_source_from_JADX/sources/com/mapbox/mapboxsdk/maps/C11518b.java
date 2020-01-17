package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.C11454g;
import com.mapbox.mapboxsdk.annotations.C11423a;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMarkerClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolygonClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolylineClickListener;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.b */
class C11518b {

    /* renamed from: a */
    private final MapView f29827a;

    /* renamed from: b */
    private final C11531f f29828b;

    /* renamed from: c */
    private final C11532g f29829c = new C11532g();

    /* renamed from: d */
    private final C7576d<C11423a> f29830d;

    /* renamed from: e */
    private final List<Marker> f29831e = new ArrayList();

    /* renamed from: f */
    private MapboxMap f29832f;

    /* renamed from: g */
    private OnMarkerClickListener f29833g;

    /* renamed from: h */
    private OnPolygonClickListener f29834h;

    /* renamed from: i */
    private OnPolylineClickListener f29835i;

    /* renamed from: j */
    private C11523c f29836j;

    /* renamed from: k */
    private C11567t f29837k;

    /* renamed from: l */
    private C11549l f29838l;

    /* renamed from: m */
    private C11552o f29839m;

    /* renamed from: n */
    private C11554q f29840n;

    /* renamed from: com.mapbox.mapboxsdk.maps.b$a */
    private static class C11519a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final RectF f29841a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Marker> f29842b;

        C11519a(RectF rectF, List<Marker> list) {
            this.f29841a = rectF;
            this.f29842b = list;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo33798a() {
            return this.f29841a.centerX();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo33799b() {
            return this.f29841a.centerY();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.b$b */
    private static class C11520b {

        /* renamed from: a */
        private final C11555r f29843a;

        /* renamed from: b */
        private final int f29844b;

        /* renamed from: c */
        private Bitmap f29845c;

        /* renamed from: d */
        private int f29846d;

        /* renamed from: e */
        private int f29847e;

        /* renamed from: f */
        private PointF f29848f;

        /* renamed from: g */
        private RectF f29849g = new RectF();

        /* renamed from: h */
        private RectF f29850h = new RectF();

        /* renamed from: i */
        private long f29851i = -1;

        C11520b(MapboxMap mapboxMap) {
            new Rect();
            this.f29843a = mapboxMap.mo33570g();
            this.f29844b = (int) (C11451d.m29567b().getResources().getDisplayMetrics().density * 32.0f);
        }

        /* renamed from: b */
        private void m29978b(C11519a aVar) {
            for (Marker a : aVar.f29842b) {
                m29975a(aVar, a);
            }
        }

        /* renamed from: a */
        public long mo33800a(C11519a aVar) {
            m29978b(aVar);
            return this.f29851i;
        }

        /* renamed from: a */
        private void m29975a(C11519a aVar, Marker marker) {
            this.f29848f = this.f29843a.mo33888a(marker.mo33191e());
            this.f29845c = marker.mo33190d().mo33269a();
            this.f29847e = this.f29845c.getHeight();
            int i = this.f29847e;
            int i2 = this.f29844b;
            if (i < i2) {
                this.f29847e = i2;
            }
            this.f29846d = this.f29845c.getWidth();
            int i3 = this.f29846d;
            int i4 = this.f29844b;
            if (i3 < i4) {
                this.f29846d = i4;
            }
            this.f29849g.set(0.0f, 0.0f, (float) this.f29846d, (float) this.f29847e);
            RectF rectF = this.f29849g;
            PointF pointF = this.f29848f;
            rectF.offsetTo(pointF.x - ((float) (this.f29846d / 2)), pointF.y - ((float) (this.f29847e / 2)));
            m29976a(aVar, marker, this.f29849g);
        }

        /* renamed from: a */
        private void m29976a(C11519a aVar, Marker marker, RectF rectF) {
            if (rectF.contains(aVar.mo33798a(), aVar.mo33799b())) {
                rectF.intersect(aVar.f29841a);
                if (m29977a(rectF)) {
                    this.f29850h = new RectF(rectF);
                    this.f29851i = marker.mo33252a();
                }
            }
        }

        /* renamed from: a */
        private boolean m29977a(RectF rectF) {
            return rectF.width() * rectF.height() > this.f29850h.width() * this.f29850h.height();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.b$c */
    private static class C11521c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final RectF f29852a;

        C11521c(RectF rectF) {
            this.f29852a = rectF;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.b$d */
    private static class C11522d {

        /* renamed from: a */
        private C11567t f29853a;

        C11522d(C11567t tVar) {
            this.f29853a = tVar;
        }

        /* renamed from: a */
        public C11423a mo33801a(C11521c cVar) {
            List a = this.f29853a.mo33931a(cVar.f29852a);
            if (a.size() > 0) {
                return (C11423a) a.get(0);
            }
            return null;
        }
    }

    C11518b(MapView mapView, C7576d<C11423a> dVar, C11531f fVar, C11523c cVar, C11549l lVar, C11552o oVar, C11554q qVar, C11567t tVar) {
        this.f29827a = mapView;
        this.f29830d = dVar;
        this.f29828b = fVar;
        this.f29836j = cVar;
        this.f29838l = lVar;
        this.f29839m = oVar;
        this.f29840n = qVar;
        this.f29837k = tVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11423a mo33784a(long j) {
        return this.f29836j.mo33780a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11518b mo33793b(MapboxMap mapboxMap) {
        this.f29832f = mapboxMap;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo33796c() {
        this.f29838l.mo33882a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo33797d() {
        this.f29829c.mo33825f();
    }

    /* renamed from: c */
    private boolean m29953c(C11423a aVar) {
        return (aVar == null || aVar.mo33252a() == -1 || this.f29830d.mo19517d(aVar.mo33252a()) <= -1) ? false : true;
    }

    /* renamed from: d */
    private void m29955d(C11423a aVar) {
        Logger.m29686w("Mbgl-AnnotationManager", String.format("Attempting to update non-added %s with value %s", new Object[]{aVar.getClass().getCanonicalName(), aVar}));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33790a(C11423a aVar) {
        if (aVar instanceof Marker) {
            Marker marker = (Marker) aVar;
            marker.mo33194h();
            if (this.f29831e.contains(marker)) {
                this.f29831e.remove(marker);
            }
            this.f29828b.mo33816b(marker.mo33190d());
        }
        this.f29836j.mo33781a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33795b(Marker marker) {
        if (!this.f29831e.contains(marker)) {
            if (!this.f29829c.mo33824e()) {
                mo33786a();
            }
            if (this.f29829c.mo33820a(marker) || this.f29829c.mo33818a() != null) {
                this.f29829c.mo33819a(marker.mo33188a(this.f29832f, this.f29827a));
            }
            this.f29831e.add(marker);
        }
    }

    /* renamed from: c */
    private C11521c m29951c(PointF pointF) {
        float dimension = C11451d.m29567b().getResources().getDimension(C11454g.mapbox_eight_dp);
        float f = pointF.x;
        float f2 = f - dimension;
        float f3 = pointF.y;
        return new C11521c(new RectF(f2, f3 - dimension, f + dimension, f3 + dimension));
    }

    /* renamed from: d */
    private void m29954d(Marker marker) {
        if (!this.f29831e.contains(marker)) {
            mo33795b(marker);
        } else {
            mo33787a(marker);
        }
    }

    /* renamed from: c */
    private boolean m29952c(Marker marker) {
        OnMarkerClickListener onMarkerClickListener = this.f29833g;
        return onMarkerClickListener != null && onMarkerClickListener.onMarkerClick(marker);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11532g mo33794b() {
        return this.f29829c;
    }

    /* renamed from: b */
    private boolean m29950b(C11423a aVar) {
        if (aVar instanceof Polygon) {
            OnPolygonClickListener onPolygonClickListener = this.f29834h;
            if (onPolygonClickListener != null) {
                onPolygonClickListener.onPolygonClick((Polygon) aVar);
                return true;
            }
        }
        if (aVar instanceof Polyline) {
            OnPolylineClickListener onPolylineClickListener = this.f29835i;
            if (onPolylineClickListener != null) {
                onPolylineClickListener.onPolylineClick((Polyline) aVar);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<Marker> mo33785a(RectF rectF) {
        return this.f29838l.mo33881a(rectF);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33788a(Polygon polygon) {
        if (!m29953c((C11423a) polygon)) {
            m29955d((C11423a) polygon);
        } else {
            this.f29839m.mo33883a(polygon);
        }
    }

    /* renamed from: b */
    private C11519a m29948b(PointF pointF) {
        int a = (int) (((double) this.f29828b.mo33813a()) * 1.5d);
        int b = (int) (((double) this.f29828b.mo33815b()) * 1.5d);
        float f = pointF.x;
        float f2 = (float) a;
        float f3 = f - f2;
        float f4 = pointF.y;
        float f5 = (float) b;
        RectF rectF = new RectF(f3, f4 - f5, f + f2, f4 + f5);
        return new C11519a(rectF, mo33785a(rectF));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Polyline mo33783a(PolylineOptions polylineOptions, MapboxMap mapboxMap) {
        return this.f29840n.mo33884a(polylineOptions, mapboxMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33789a(Polyline polyline) {
        if (!m29953c((C11423a) polyline)) {
            m29955d((C11423a) polyline);
        } else {
            this.f29840n.mo33885a(polyline);
        }
    }

    /* renamed from: b */
    private boolean m29949b(long j) {
        Marker marker = (Marker) mo33784a(j);
        if (!m29952c(marker)) {
            m29954d(marker);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33786a() {
        if (!this.f29831e.isEmpty()) {
            for (Marker marker : this.f29831e) {
                if (marker != null && marker.mo33195i()) {
                    marker.mo33194h();
                }
            }
            this.f29831e.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33787a(Marker marker) {
        if (this.f29831e.contains(marker)) {
            if (marker.mo33195i()) {
                marker.mo33194h();
            }
            this.f29831e.remove(marker);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33791a(MapboxMap mapboxMap) {
        int a = this.f29830d.mo19504a();
        for (int i = 0; i < a; i++) {
            C11423a aVar = (C11423a) this.f29830d.mo19513c((long) i);
            if (aVar instanceof Marker) {
                Marker marker = (Marker) aVar;
                marker.mo33189a(this.f29828b.mo33814a(marker.mo33190d()));
            }
        }
        for (Marker marker2 : this.f29831e) {
            if (marker2.mo33195i()) {
                marker2.mo33194h();
                marker2.mo33188a(mapboxMap, this.f29827a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33792a(PointF pointF) {
        long a = new C11520b(this.f29832f).mo33800a(m29948b(pointF));
        boolean z = true;
        if (a != -1 && m29949b(a)) {
            return true;
        }
        C11423a a2 = new C11522d(this.f29837k).mo33801a(m29951c(pointF));
        if (a2 == null || !m29950b(a2)) {
            z = false;
        }
        return z;
    }
}
