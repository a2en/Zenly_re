package app.zenly.locator.map.mapbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.map.base.C3903b;
import app.zenly.locator.map.base.Map.C3901a;
import app.zenly.locator.map.base.Map.FinishCallback;
import app.zenly.locator.map.mapbox.MapBoxStyleLoader.C4123a;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import app.zenly.locator.p143s.p150n.C5464h;
import com.mapbox.mapboxsdk.camera.C11449a;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.C11448b;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.C11555r;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraIsChangingListener;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraWillChangeListener;
import com.mapbox.mapboxsdk.maps.MapView.OnDidFinishLoadingMapListener;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.maps.Style.OnStyleLoaded;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.RasterLayer;
import com.mapbox.mapboxsdk.style.sources.C11593a;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.Objects;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.map.mapbox.e */
public class C4129e extends C3903b implements OnMapReadyCallback {

    /* renamed from: A */
    private String f10815A;

    /* renamed from: i */
    private MapView f10816i = ((MapView) getMapContainer());

    /* renamed from: j */
    private MapboxMap f10817j;

    /* renamed from: k */
    private C5458c f10818k = null;

    /* renamed from: l */
    private int f10819l = -1;

    /* renamed from: m */
    private FinishCallback f10820m = null;

    /* renamed from: n */
    private final C5458c f10821n = new C5458c();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f10822o = true;

    /* renamed from: p */
    private final C5464h f10823p = new C5464h();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f10824q = true;

    /* renamed from: r */
    private double f10825r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f10826s = true;

    /* renamed from: t */
    private Handler f10827t = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f10828u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f10829v;

    /* renamed from: w */
    private MapBoxStyleLoader f10830w;

    /* renamed from: x */
    private C3901a f10831x = C3901a.ZENLY;

    /* renamed from: y */
    private boolean f10832y;

    /* renamed from: z */
    private C4123a f10833z = null;

    /* renamed from: app.zenly.locator.map.mapbox.e$a */
    class C4130a extends MapView {
        C4130a(Context context) {
            super(context);
        }

        public boolean gatherTransparentRegion(Region region) {
            return true;
        }

        public boolean isOpaque() {
            return true;
        }
    }

    /* renamed from: app.zenly.locator.map.mapbox.e$b */
    class C4131b implements CancelableCallback {

        /* renamed from: a */
        final /* synthetic */ int f10834a;

        /* renamed from: b */
        final /* synthetic */ FinishCallback f10835b;

        C4131b(int i, FinishCallback finishCallback) {
            this.f10834a = i;
            this.f10835b = finishCallback;
        }

        public void onCancel() {
            if (this.f10834a == C4129e.this.f10829v) {
                C4129e.this.f10828u = false;
            }
            FinishCallback finishCallback = this.f10835b;
            if (finishCallback != null) {
                finishCallback.onFinish(false);
            }
        }

        public void onFinish() {
            if (this.f10834a == C4129e.this.f10829v) {
                C4129e.this.f10828u = false;
            }
            FinishCallback finishCallback = this.f10835b;
            if (finishCallback != null) {
                finishCallback.onFinish(true);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.mapbox.e$c */
    class C4132c implements CancelableCallback {

        /* renamed from: a */
        final /* synthetic */ FinishCallback f10837a;

        C4132c(C4129e eVar, FinishCallback finishCallback) {
            this.f10837a = finishCallback;
        }

        public void onCancel() {
            FinishCallback finishCallback = this.f10837a;
            if (finishCallback != null) {
                finishCallback.onFinish(false);
            }
        }

        public void onFinish() {
            FinishCallback finishCallback = this.f10837a;
            if (finishCallback != null) {
                finishCallback.onFinish(true);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.mapbox.e$d */
    static /* synthetic */ class C4133d {

        /* renamed from: a */
        static final /* synthetic */ int[] f10838a = new int[C3901a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                app.zenly.locator.map.base.Map$a[] r0 = app.zenly.locator.map.base.Map.C3901a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10838a = r0
                int[] r0 = f10838a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.base.Map$a r1 = app.zenly.locator.map.base.Map.C3901a.STANDARD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10838a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.base.Map$a r1 = app.zenly.locator.map.base.Map.C3901a.HYBRID     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.mapbox.C4129e.C4133d.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.mapbox.e$e */
    private class C4134e implements OnCameraIsChangingListener, OnCameraDidChangeListener, OnCameraWillChangeListener, OnDidFinishLoadingMapListener {
        private C4134e() {
        }

        /* renamed from: a */
        private void m11895a() {
            C4129e.this.f10822o = true;
            C4129e.this.f10824q = true;
            C4129e.this.f10826s = true;
            C4129e.this.mo10572a();
        }

        public void onCameraDidChange(boolean z) {
            m11895a();
        }

        public void onCameraIsChanging() {
            m11895a();
        }

        public void onCameraWillChange(boolean z) {
            m11895a();
        }

        public void onDidFinishLoadingMap() {
            m11895a();
        }

        /* synthetic */ C4134e(C4129e eVar, C4130a aVar) {
            this();
        }
    }

    public C4129e(Context context) {
        super(new C4130a(context));
        this.f10816i.setOnTouchListener(this.f10345b);
        C4134e eVar = new C4134e(this, null);
        this.f10816i.mo33491a((OnCameraWillChangeListener) eVar);
        this.f10816i.mo33490a((OnCameraIsChangingListener) eVar);
        this.f10816i.mo33489a((OnCameraDidChangeListener) eVar);
        this.f10816i.mo33493a((OnDidFinishLoadingMapListener) eVar);
        this.f10830w = new MapBoxStyleLoader(context);
    }

    /* renamed from: e */
    private void m11891e() {
        C4123a aVar = this.f10833z;
        if (aVar != null) {
            this.f10830w.mo10799a(aVar, new C4127c(this));
        }
    }

    public void addOverlay(View view) {
        view.setLayoutParams(new LayoutParams(-1, -1));
        this.f10816i.addView(view);
    }

    public C5462f addPolyline(C5463g gVar) {
        if (this.f10817j == null) {
            return null;
        }
        C4135f fVar = new C4135f(gVar);
        fVar.mo10823a(this.f10817j);
        return fVar;
    }

    public void animateCamera(C5458c cVar, int i, FinishCallback finishCallback) {
        int i2 = 0;
        if (this.f10817j != null) {
            int i3 = this.f10829v;
            if (i3 != Integer.MAX_VALUE) {
                i2 = i3 + 1;
            }
            this.f10829v = i2;
            int i4 = this.f10829v;
            this.f10828u = true;
            this.f10817j.mo33553a(C11449a.m29559a(m11884a(cVar)), i, new C4131b(i4, finishCallback));
            return;
        }
        FinishCallback finishCallback2 = this.f10820m;
        if (finishCallback2 != null) {
            finishCallback2.onFinish(false);
        }
        this.f10818k = cVar;
        this.f10819l = i;
        this.f10820m = finishCallback;
    }

    public void fromScreenLocation(PointF pointF, C5459d dVar) {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap != null) {
            LatLng a = mapboxMap.mo33570g().mo33889a(pointF);
            dVar.mo13061b(a.mo33334a());
            dVar.mo13063c(a.mo33336b());
            return;
        }
        dVar.mo13061b(0.0d);
        dVar.mo13063c(0.0d);
    }

    public C5458c getCameraPosition() {
        if (this.f10822o) {
            MapboxMap mapboxMap = this.f10817j;
            if (mapboxMap != null) {
                CameraPosition a = mapboxMap.mo33541a();
                this.f10821n.f14041b = a.target.mo33334a();
                this.f10821n.f14042c = a.target.mo33336b();
                C5458c cVar = this.f10821n;
                cVar.f14040a = a.bearing;
                cVar.f14043d = a.tilt;
                cVar.f14044e = a.zoom;
                this.f10822o = false;
            }
        }
        return this.f10821n;
    }

    public double getDistanceBetween(int i, int i2, int i3, int i4) {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap == null) {
            return 0.0d;
        }
        C11555r g = mapboxMap.mo33570g();
        LatLng a = g.mo33889a(new PointF((float) i, (float) i2));
        LatLng a2 = g.mo33889a(new PointF((float) i3, (float) i4));
        return (double) C3225m.m10225a(a.mo33334a(), a.mo33336b(), a2.mo33334a(), a2.mo33336b());
    }

    public double getHorizontalDistanceAtCenter() {
        int i = this.f10347d;
        int mapViewHeight = this.f10346c + (getMapViewHeight() / 2);
        return getDistanceBetween(i, mapViewHeight, getMapViewWidth() + i, mapViewHeight);
    }

    public double getHorizontalPixelsPerDegreeAtCenter() {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap == null) {
            return -1.0d;
        }
        if (this.f10826s) {
            this.f10826s = false;
            C11555r g = mapboxMap.mo33570g();
            this.f10825r = ((double) getMapViewWidth()) / (g.mo33889a(new PointF((float) getMapViewWidth(), (float) (getMapViewHeight() / 2))).mo33336b() - g.mo33889a(new PointF(0.0f, (float) (getMapViewHeight() / 2))).mo33336b());
        }
        return this.f10825r;
    }

    public C3901a getMapStyle() {
        return this.f10831x;
    }

    public int getMapTileSize() {
        return C3200e0.m10182a(512);
    }

    public int getMapViewHeight() {
        return (this.f10816i.getHeight() - this.f10349f) - this.f10346c;
    }

    public int getMapViewWidth() {
        return (this.f10816i.getWidth() - this.f10347d) - this.f10348e;
    }

    public double getMaxZoom() {
        return 20.0d;
    }

    public double getMetersPerPixelAtLatitude(double d) {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap == null) {
            return 0.0d;
        }
        return mapboxMap.mo33570g().mo33886a(d);
    }

    public double getMinZoom() {
        return 0.0d;
    }

    public double getVerticalDistanceAtCenter() {
        int mapViewWidth = this.f10347d + (getMapViewWidth() / 2);
        int i = this.f10346c;
        return getDistanceBetween(mapViewWidth, i, mapViewWidth, getMapViewHeight() + i);
    }

    public C5464h getVisibleRegion() {
        if (this.f10824q && this.f10817j != null) {
            this.f10824q = false;
            int i = this.f10347d;
            int mapViewWidth = getMapViewWidth() + i;
            int i2 = this.f10346c;
            int mapViewHeight = getMapViewHeight() + i2;
            C11555r g = this.f10817j.mo33570g();
            float f = (float) i;
            float f2 = (float) i2;
            LatLng a = g.mo33889a(new PointF(f, f2));
            this.f10823p.f14060a.mo13061b(a.mo33334a());
            this.f10823p.f14060a.mo13063c(a.mo33336b());
            float f3 = (float) mapViewWidth;
            LatLng a2 = g.mo33889a(new PointF(f3, f2));
            this.f10823p.f14061b.mo13061b(a2.mo33334a());
            this.f10823p.f14061b.mo13063c(a2.mo33336b());
            float f4 = (float) mapViewHeight;
            LatLng a3 = g.mo33889a(new PointF(f3, f4));
            this.f10823p.f14063d.mo13061b(a3.mo33334a());
            this.f10823p.f14063d.mo13063c(a3.mo33336b());
            LatLng a4 = g.mo33889a(new PointF(f, f4));
            this.f10823p.f14062c.mo13061b(a4.mo33334a());
            this.f10823p.f14062c.mo13063c(a4.mo33336b());
        }
        return this.f10823p;
    }

    public boolean isNightModeEnabled() {
        return this.f10832y;
    }

    public boolean isReady() {
        return this.f10817j != null;
    }

    public void moveCamera(C5458c cVar, FinishCallback finishCallback) {
        if (this.f10817j != null) {
            this.f10817j.mo33554a(C11449a.m29559a(m11884a(cVar)), (CancelableCallback) new C4132c(this, finishCallback));
            return;
        }
        FinishCallback finishCallback2 = this.f10820m;
        if (finishCallback2 != null) {
            finishCallback2.onFinish(false);
        }
        this.f10818k = cVar;
        this.f10819l = -1;
        this.f10820m = finishCallback;
    }

    public void onCreate(Bundle bundle) {
        this.f10816i.mo33488a(bundle);
        this.f10816i.mo33496a((OnMapReadyCallback) this);
    }

    public void onDestroy() {
        this.f10817j = null;
        this.f10816i.mo33486a();
    }

    public void onLowMemory() {
        this.f10816i.mo33497b();
    }

    public void onMapReady(MapboxMap mapboxMap) {
        C12143a.m32027a("onMapReady", new Object[0]);
        this.f10817j = mapboxMap;
        this.f10817j.mo33563b(0.0d);
        this.f10817j.mo33542a(20.0d);
        this.f10817j.mo33544a(this.f10347d, this.f10346c, this.f10348e, this.f10349f);
        this.f10817j.mo33572i().mo33978b(false);
        this.f10817j.mo33572i().mo33995i(false);
        this.f10817j.mo33572i().mo33973a(false);
        m11889d();
        mo10574b();
        C5458c cVar = this.f10818k;
        if (cVar != null) {
            int i = this.f10819l;
            if (i > -1) {
                animateCamera(cVar, i, this.f10820m);
            } else {
                moveCamera(cVar, this.f10820m);
            }
            this.f10818k = null;
            this.f10819l = -1;
            this.f10820m = null;
        }
    }

    public void onPause() {
        this.f10816i.mo33505c();
    }

    public void onResume() {
        this.f10816i.mo33506d();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f10816i.mo33498b(bundle);
    }

    public void onStart() {
        this.f10816i.mo33507e();
    }

    public void onStop() {
        this.f10816i.mo33508f();
    }

    public void setMapPadding(int i, int i2, int i3, int i4) {
        super.setMapPadding(i, i2, i3, i4);
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap != null) {
            mapboxMap.mo33544a(i, i2, i3, i4);
            if (!this.f10828u) {
                this.f10827t.post(new C4126b(this));
            }
        }
    }

    public void setMapStyle(C3901a aVar) {
        if (aVar != this.f10831x) {
            this.f10831x = aVar;
            m11889d();
        }
    }

    public void setNightModeEnabled(boolean z) {
        if (this.f10832y != z) {
            this.f10832y = z;
            m11889d();
        }
    }

    public void setTileOverlay(String str) {
        if (!Objects.equals(this.f10815A, str)) {
            this.f10815A = str;
            m11891e();
        }
    }

    public void toScreenLocation(C5459d dVar, PointF pointF) {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap != null) {
            PointF a = mapboxMap.mo33570g().mo33888a(new LatLng(dVar.mo13060b(), dVar.mo13062c()));
            pointF.set(a.x, a.y);
            return;
        }
        pointF.set(0.0f, 0.0f);
    }

    /* renamed from: d */
    private void m11889d() {
        if (this.f10817j != null) {
            int i = C4133d.f10838a[this.f10831x.ordinal()];
            C4123a aVar = i != 1 ? i != 2 ? this.f10832y ? C4123a.NIGHT : C4123a.ZENLY : C4123a.HYBRID : this.f10832y ? C4123a.NIGHT : C4123a.STANDARD;
            if (aVar != this.f10833z) {
                this.f10833z = aVar;
                m11891e();
            }
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo10813c() {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap != null && !this.f10828u) {
            mapboxMap.mo33551a(mapboxMap.mo33541a());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo10811a(C4123a aVar, String str, String str2) {
        MapboxMap mapboxMap = this.f10817j;
        if (mapboxMap != null && aVar == this.f10833z) {
            mapboxMap.mo33560a(str2, (OnStyleLoaded) new C4128d(this));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo10812a(Style style) {
        String str = "zenly-tile-overlay";
        Layer a = style.mo33751a(str);
        String str2 = this.f10815A;
        String str3 = "zenly-tile-overlay-source";
        if (str2 != null && a == null) {
            style.mo33757a((Source) new RasterSource(str3, new C11593a("tileset", str2), 256));
            style.mo33753a((Layer) new RasterLayer(str, str3));
        } else if (this.f10815A == null && a != null) {
            try {
                style.mo33763c(str3);
                style.mo33761b(str);
            } catch (Exception e) {
                C12143a.m32032b(e, "refreshSkiSlopes: disableSkiSlope failed", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private CameraPosition m11884a(C5458c cVar) {
        C11448b bVar = new C11448b();
        C5458c cameraPosition = getCameraPosition();
        if (Double.isNaN(cVar.f14041b)) {
            cVar.f14041b = cameraPosition.f14041b;
        }
        if (Double.isNaN(cVar.f14042c)) {
            cVar.f14042c = cameraPosition.f14042c;
        }
        if (!Double.isNaN(cVar.f14041b) && !Double.isNaN(cVar.f14042c)) {
            bVar.mo33322a(new LatLng(cVar.f14041b, cVar.f14042c));
        }
        double d = cVar.f14040a;
        if (d > -1.0d) {
            bVar.mo33321a((double) ((float) d));
        } else {
            double d2 = cameraPosition.f14040a;
            if (d2 > -1.0d) {
                bVar.mo33321a((double) ((float) d2));
            }
        }
        double d3 = cVar.f14043d;
        if (d3 > -1.0d) {
            bVar.mo33324b((double) ((float) d3));
        } else {
            double d4 = cameraPosition.f14043d;
            if (d4 > -1.0d) {
                bVar.mo33324b((double) ((float) d4));
            }
        }
        double d5 = cVar.f14044e;
        if (d5 > -1.0d) {
            bVar.mo33325c((double) ((float) d5));
        } else {
            double d6 = cameraPosition.f14044e;
            if (d6 > -1.0d) {
                bVar.mo33325c((double) ((float) d6));
            }
        }
        return bVar.mo33323a();
    }
}
