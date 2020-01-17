package app.zenly.locator.map.p107g1;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3193b;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.map.base.C3903b;
import app.zenly.locator.map.base.Map.C3901a;
import app.zenly.locator.map.base.Map.FinishCallback;
import app.zenly.locator.map.p113l1.C4117b;
import app.zenly.locator.p143s.p150n.C5458c;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5462f;
import app.zenly.locator.p143s.p150n.C5463g;
import app.zenly.locator.p143s.p150n.C5464h;
import com.google.android.gms.maps.C10603a;
import com.google.android.gms.maps.C10604b;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.CancelableCallback;
import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener;
import com.google.android.gms.maps.GoogleMap.OnCameraMoveListener;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.C10647i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.C10631a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.util.Objects;

/* renamed from: app.zenly.locator.map.g1.c */
public class C3979c extends C3903b implements OnMapReadyCallback, TimeListener {

    /* renamed from: F */
    private static final ThreadLocal<C3193b<C5459d>> f10508F = new C3980a();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f10509A = -1;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public FinishCallback f10510B = null;

    /* renamed from: C */
    private int f10511C = 0;

    /* renamed from: D */
    private double f10512D;

    /* renamed from: E */
    private final Context f10513E;

    /* renamed from: i */
    private final MapView f10514i;

    /* renamed from: j */
    private final C3978b f10515j;

    /* renamed from: k */
    private GoogleMap f10516k;

    /* renamed from: l */
    private CameraPosition f10517l;

    /* renamed from: m */
    private final C5458c f10518m = new C5458c();

    /* renamed from: n */
    private final C5464h f10519n = new C5464h();

    /* renamed from: o */
    private C3901a f10520o = C3901a.ZENLY;

    /* renamed from: p */
    private boolean f10521p;

    /* renamed from: q */
    private String f10522q;

    /* renamed from: r */
    private C10647i f10523r;

    /* renamed from: s */
    private final C4117b f10524s;

    /* renamed from: t */
    private final TimeAnimator f10525t = new TimeAnimator();

    /* renamed from: u */
    private long f10526u;

    /* renamed from: v */
    private final Handler f10527v = new Handler();

    /* renamed from: w */
    private C3985e f10528w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f10529x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f10530y = 0;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C10603a f10531z = null;

    /* renamed from: app.zenly.locator.map.g1.c$a */
    static class C3980a extends ThreadLocal<C3193b<C5459d>> {

        /* renamed from: app.zenly.locator.map.g1.c$a$a */
        class C3981a extends C3193b<C5459d> {
            C3981a(C3980a aVar, int i) {
                super(i);
            }

            /* renamed from: a */
            public C5459d m11634a() {
                return new C5459d();
            }
        }

        C3980a() {
        }

        /* access modifiers changed from: protected */
        public C3193b<C5459d> initialValue() {
            return new C3981a(this, 5);
        }
    }

    /* renamed from: app.zenly.locator.map.g1.c$b */
    class C3982b extends FrameLayout {
        C3982b(Context context) {
            super(context);
        }

        public boolean gatherTransparentRegion(Region region) {
            return true;
        }

        public boolean isOpaque() {
            return true;
        }
    }

    /* renamed from: app.zenly.locator.map.g1.c$c */
    class C3983c implements CancelableCallback {

        /* renamed from: a */
        final /* synthetic */ int f10532a;

        /* renamed from: b */
        final /* synthetic */ FinishCallback f10533b;

        C3983c(int i, FinishCallback finishCallback) {
            this.f10532a = i;
            this.f10533b = finishCallback;
        }

        /* renamed from: a */
        public void mo10652a(boolean z) {
            if (!C3979c.this.f10529x) {
                if (this.f10532a == C3979c.this.f10530y) {
                    C3979c.this.f10531z = null;
                    C3979c.this.f10509A = -1;
                    C3979c.this.f10510B = null;
                }
                FinishCallback finishCallback = this.f10533b;
                if (finishCallback != null) {
                    finishCallback.onFinish(z);
                }
            }
        }

        public void onCancel() {
            mo10652a(false);
        }

        public void onFinish() {
            mo10652a(true);
        }
    }

    /* renamed from: app.zenly.locator.map.g1.c$d */
    static /* synthetic */ class C3984d {

        /* renamed from: a */
        static final /* synthetic */ int[] f10535a = new int[C3901a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.map.base.Map$a[] r0 = app.zenly.locator.map.base.Map.C3901a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10535a = r0
                int[] r0 = f10535a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.base.Map$a r1 = app.zenly.locator.map.base.Map.C3901a.ZENLY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10535a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.base.Map$a r1 = app.zenly.locator.map.base.Map.C3901a.STANDARD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10535a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.map.base.Map$a r1 = app.zenly.locator.map.base.Map.C3901a.HYBRID     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p107g1.C3979c.C3984d.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.g1.c$e */
    private class C3985e implements Runnable {
        private C3985e() {
        }

        public void run() {
            if (!C3979c.this.f10529x && C3979c.this.f10531z != null) {
                if (C3979c.this.f10509A > -1) {
                    C3979c cVar = C3979c.this;
                    cVar.m11619a(cVar.f10530y, C3979c.this.f10531z, C3979c.this.f10509A, C3979c.this.f10510B);
                } else {
                    C3979c cVar2 = C3979c.this;
                    cVar2.m11620a(cVar2.f10530y, C3979c.this.f10531z, C3979c.this.f10510B);
                }
            }
        }

        /* synthetic */ C3985e(C3979c cVar, C3980a aVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.g1.c$f */
    class C3986f implements OnCameraMoveListener, OnCameraIdleListener, OnCameraMoveCanceledListener {
        C3986f() {
        }

        /* renamed from: a */
        private void m11636a() {
            C3979c.this.m11631f();
        }

        public void onCameraIdle() {
            m11636a();
        }

        public void onCameraMove() {
            m11636a();
        }

        public void onCameraMoveCanceled() {
            m11636a();
        }
    }

    public C3979c(Context context) {
        super(new C3982b(context));
        getMapContainer().setBackgroundColor(C0540a.m2536a(context, (int) R.color.gray_light));
        this.f10514i = new MapView(context);
        getMapContainer().addView(this.f10514i);
        this.f10515j = new C3978b(context);
        this.f10515j.setOnTouchListener(this.f10345b);
        this.f10524s = new C4117b(C3200e0.m10183a(context, 256));
        this.f10525t.setTimeListener(this);
        this.f10513E = context;
    }

    public void addOverlay(View view) {
        view.setLayoutParams(new LayoutParams(-1, -1));
        this.f10514i.addView(view);
    }

    public C5462f addPolyline(C5463g gVar) {
        if (this.f10516k == null) {
            return null;
        }
        C3987d dVar = new C3987d(gVar);
        dVar.mo10661a(this.f10516k);
        return dVar;
    }

    public void animateCamera(C5458c cVar, int i, FinishCallback finishCallback) {
        int i2 = this.f10530y;
        m11619a(i2 < Integer.MAX_VALUE ? i2 + 1 : 0, m11618a(cVar), i, finishCallback);
    }

    public void fromScreenLocation(PointF pointF, C5459d dVar) {
        if (this.f10516k != null) {
            this.f10524s.mo10791a((double) pointF.x, (double) pointF.y, true, dVar);
            return;
        }
        dVar.mo13061b(0.0d);
        dVar.mo13063c(0.0d);
    }

    public C5458c getCameraPosition() {
        return this.f10518m;
    }

    public double getDistanceBetween(int i, int i2, int i3, int i4) {
        C3193b bVar = (C3193b) f10508F.get();
        C5459d a = this.f10524s.mo10791a((double) i, (double) i2, false, (C5459d) bVar.acquire());
        C5459d a2 = this.f10524s.mo10791a((double) i3, (double) i4, false, (C5459d) bVar.acquire());
        double a3 = (double) C3225m.m10225a(a.mo13060b(), a.mo13062c(), a2.mo13060b(), a2.mo13062c());
        bVar.release(a);
        bVar.release(a2);
        return a3;
    }

    public double getHorizontalDistanceAtCenter() {
        int mapViewHeight = getMapViewHeight() / 2;
        return getDistanceBetween(0, mapViewHeight, getMapViewWidth(), mapViewHeight);
    }

    public double getHorizontalPixelsPerDegreeAtCenter() {
        return this.f10512D;
    }

    public C3901a getMapStyle() {
        return this.f10520o;
    }

    public int getMapTileSize() {
        return C3200e0.m10182a(256);
    }

    public int getMapViewHeight() {
        return this.f10514i.getHeight() - (this.f10346c + this.f10349f);
    }

    public int getMapViewWidth() {
        return this.f10514i.getWidth() - (this.f10347d + this.f10348e);
    }

    public double getMaxZoom() {
        return 20.0d;
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return this.f10524s.mo10788a(d);
    }

    public double getMinZoom() {
        GoogleMap googleMap = this.f10516k;
        if (googleMap != null) {
            return (double) googleMap.mo28763c();
        }
        return 0.0d;
    }

    public double getVerticalDistanceAtCenter() {
        int mapViewWidth = getMapViewWidth() / 2;
        return getDistanceBetween(mapViewWidth, 0, mapViewWidth, getMapViewHeight());
    }

    public C5464h getVisibleRegion() {
        return this.f10519n;
    }

    public boolean isNightModeEnabled() {
        return this.f10521p;
    }

    public boolean isReady() {
        return this.f10516k != null;
    }

    public void moveCamera(C5458c cVar, FinishCallback finishCallback) {
        int i = this.f10530y;
        m11620a(i < Integer.MAX_VALUE ? i + 1 : 0, m11618a(cVar), finishCallback);
    }

    public void onCreate(Bundle bundle) {
        this.f10514i.mo28804a(bundle);
        this.f10515j.mo10644a(this.f10514i.getChildAt(0));
        this.f10514i.addView(this.f10515j);
        this.f10514i.mo28805a((OnMapReadyCallback) this);
    }

    public void onDestroy() {
        this.f10525t.end();
        this.f10516k = null;
        this.f10514i.mo28803a();
        f10508F.remove();
    }

    public void onLowMemory() {
        this.f10514i.mo28806b();
    }

    public void onMapReady(GoogleMap googleMap) {
        this.f10516k = googleMap;
        this.f10516k.mo28752a(20.0f);
        this.f10516k.mo28764d().mo28827a(false);
        this.f10516k.mo28764d().mo28828b(false);
        this.f10516k.mo28761a(false);
        C3986f fVar = new C3986f();
        this.f10516k.mo28757a((OnCameraMoveListener) fVar);
        this.f10516k.mo28755a((OnCameraIdleListener) fVar);
        this.f10516k.mo28756a((OnCameraMoveCanceledListener) fVar);
        mo10795c();
        m11630e();
        if (this.f10347d == 0 && this.f10346c == 0 && this.f10348e == 0 && this.f10349f == 0) {
            C10603a aVar = this.f10531z;
            if (aVar != null) {
                int i = this.f10509A;
                if (i > -1) {
                    m11619a(this.f10530y, aVar, i, this.f10510B);
                } else {
                    m11620a(this.f10530y, aVar, this.f10510B);
                }
            }
        } else {
            m11628d();
        }
        mo10574b();
    }

    public void onPause() {
        this.f10514i.mo28808c();
    }

    public void onResume() {
        this.f10514i.mo28809d();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f10514i.mo28807b(bundle);
    }

    public void onStart() {
        this.f10514i.mo28810e();
    }

    public void onStop() {
        this.f10514i.mo28811f();
    }

    public void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        C3979c cVar;
        CameraPosition cameraPosition = this.f10517l;
        if (cameraPosition != null) {
            C5458c cVar2 = this.f10518m;
            LatLng latLng = cameraPosition.f27612e;
            cVar2.f14041b = latLng.f27648e;
            cVar2.f14042c = latLng.f27649f;
            cVar2.f14040a = (double) cameraPosition.f27615h;
            cVar2.f14043d = (double) cameraPosition.f27614g;
            cVar2.f14044e = (double) cameraPosition.f27613f;
            int mapViewWidth = getMapViewWidth();
            int mapViewHeight = getMapViewHeight();
            C4117b bVar = this.f10524s;
            double d = (double) mapViewWidth;
            double d2 = (double) mapViewHeight;
            C5458c cVar3 = this.f10518m;
            int i = mapViewWidth;
            double d3 = d;
            if (bVar.mo10792a(d, d2, cVar3.f14041b, cVar3.f14042c, cVar3.f14044e, cVar3.f14040a, cVar3.f14043d)) {
                int i2 = i + 0;
                int i3 = mapViewHeight + 0;
                cVar = this;
                cVar.f10524s.mo10791a(0.0d, 0.0d, false, cVar.f10519n.f14060a);
                double d4 = (double) i2;
                cVar.f10524s.mo10791a(d4, 0.0d, false, cVar.f10519n.f14061b);
                double d5 = (double) i3;
                cVar.f10524s.mo10791a(d4, d5, false, cVar.f10519n.f14063d);
                cVar.f10524s.mo10791a(0.0d, d5, false, cVar.f10519n.f14062c);
                C3193b bVar2 = (C3193b) f10508F.get();
                C5459d dVar = (C5459d) bVar2.acquire();
                double d6 = (double) (mapViewHeight / 2);
                C5459d dVar2 = dVar;
                cVar.f10524s.mo10791a(0.0d, d6, false, dVar2);
                double c = dVar.mo13062c();
                cVar.f10524s.mo10791a(d3, d6, false, dVar2);
                cVar.f10512D = d3 / (dVar.mo13062c() - c);
                bVar2.release(dVar);
                mo10572a();
            } else {
                cVar = this;
            }
            if (System.currentTimeMillis() - cVar.f10526u > 5000) {
                cVar.f10525t.end();
            }
        }
    }

    public void setMapPadding(int i, int i2, int i3, int i4) {
        if (i != this.f10347d || i2 != this.f10346c || i3 != this.f10348e || i4 != this.f10349f) {
            super.setMapPadding(i, i2, i3, i4);
            m11628d();
        }
    }

    public void setMapStyle(C3901a aVar) {
        if (this.f10520o != aVar) {
            this.f10520o = aVar;
            mo10795c();
        }
    }

    public void setNightModeEnabled(boolean z) {
        if (this.f10521p != z) {
            this.f10521p = z;
            mo10795c();
        }
    }

    public void setTileOverlay(String str) {
        if (!Objects.equals(this.f10522q, str)) {
            this.f10522q = str;
            m11630e();
        }
    }

    public void toScreenLocation(C5459d dVar, PointF pointF) {
        if (this.f10516k != null) {
            this.f10524s.mo10790a(dVar, pointF);
        } else {
            pointF.set(0.0f, 0.0f);
        }
    }

    /* renamed from: c */
    private void mo10795c() {
        if (this.f10516k != null) {
            int i = C3984d.f10535a[this.f10520o.ordinal()];
            int i2 = R.raw.map_style_google_night;
            MapStyleOptions mapStyleOptions = null;
            int i3 = 1;
            if (i != 2) {
                if (i != 3) {
                    Context context = this.f10513E;
                    if (!this.f10521p) {
                        i2 = R.raw.map_style_google_zenly;
                    }
                    mapStyleOptions = MapStyleOptions.m27122a(context, i2);
                } else {
                    i3 = 4;
                }
            } else if (this.f10521p) {
                mapStyleOptions = MapStyleOptions.m27122a(this.f10513E, R.raw.map_style_google_night);
            }
            if (i3 != this.f10516k.mo28762b()) {
                this.f10516k.mo28753a(i3);
            }
            this.f10516k.mo28760a(mapStyleOptions);
        }
    }

    /* renamed from: d */
    private void m11628d() {
        if (this.f10516k != null) {
            C3985e eVar = this.f10528w;
            if (eVar != null) {
                this.f10527v.removeCallbacks(eVar);
            }
            this.f10529x = true;
            int i = this.f10511C;
            this.f10511C = i < Integer.MAX_VALUE ? 1 + i : 0;
            m11631f();
            this.f10516k.mo28765e();
            LatLng latLng = this.f10516k.mo28749a().f27612e;
            this.f10516k.mo28754a(this.f10347d, this.f10346c, this.f10348e, this.f10349f);
            this.f10516k.mo28758a(C10604b.m27074a(latLng));
            this.f10529x = false;
            if (this.f10531z != null) {
                this.f10528w = new C3985e(this, null);
                this.f10527v.postDelayed(this.f10528w, 100);
            }
        }
    }

    /* renamed from: e */
    private void m11630e() {
        GoogleMap googleMap = this.f10516k;
        if (googleMap == null) {
            return;
        }
        if (this.f10522q != null && this.f10523r == null) {
            this.f10523r = googleMap.mo28751a(new TileOverlayOptions().mo29181a(true).mo29180a((TileProvider) new C3976a(this.f10522q)));
        } else if (this.f10522q == null) {
            C10647i iVar = this.f10523r;
            if (iVar != null) {
                iVar.mo29206a();
                this.f10523r = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11631f() {
        if (this.f10516k != null) {
            this.f10526u = System.currentTimeMillis();
            this.f10517l = this.f10516k.mo28749a();
            if (!this.f10525t.isStarted()) {
                this.f10525t.start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11619a(int i, C10603a aVar, int i2, FinishCallback finishCallback) {
        FinishCallback finishCallback2 = this.f10530y != i ? this.f10510B : null;
        this.f10530y = i;
        this.f10531z = aVar;
        this.f10509A = i2;
        this.f10510B = finishCallback;
        GoogleMap googleMap = this.f10516k;
        if (googleMap != null && !this.f10529x) {
            googleMap.mo28759a(aVar, i2, new C3983c(i, finishCallback));
        } else if (finishCallback2 != null) {
            finishCallback2.onFinish(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11620a(int i, C10603a aVar, FinishCallback finishCallback) {
        FinishCallback finishCallback2 = this.f10530y != i ? this.f10510B : null;
        this.f10509A = i;
        GoogleMap googleMap = this.f10516k;
        if (googleMap == null || this.f10529x) {
            this.f10531z = aVar;
            this.f10509A = -1;
            this.f10510B = finishCallback;
            if (finishCallback2 != null) {
                finishCallback2.onFinish(false);
                return;
            }
            return;
        }
        this.f10531z = null;
        this.f10509A = -1;
        this.f10510B = null;
        googleMap.mo28758a(aVar);
        if (finishCallback != null) {
            finishCallback.onFinish(true);
        }
    }

    /* renamed from: a */
    private C10603a m11618a(C5458c cVar) {
        C5458c cameraPosition = getCameraPosition();
        double d = Double.isNaN(cVar.f14041b) ? cameraPosition.f14041b : cVar.f14041b;
        double d2 = Double.isNaN(cVar.f14042c) ? cameraPosition.f14042c : cVar.f14042c;
        double d3 = cVar.f14044e;
        if (d3 <= -1.0d) {
            d3 = cameraPosition.f14044e;
        }
        float f = (float) d3;
        double d4 = cVar.f14040a;
        if (d4 <= -1.0d) {
            d4 = cameraPosition.f14040a;
        }
        float f2 = (float) d4;
        double d5 = cVar.f14043d;
        if (d5 <= -1.0d) {
            d5 = cameraPosition.f14043d;
        }
        float f3 = (float) d5;
        LatLng latLng = new LatLng(d, d2);
        if (((double) f2) == cameraPosition.f14040a && ((double) f3) == cameraPosition.f14043d) {
            return C10604b.m27075a(latLng, f);
        }
        C10631a a = CameraPosition.m27096a();
        a.mo29071a(latLng);
        a.mo29074c(f);
        a.mo29070a(f2);
        a.mo29073b(f3);
        return C10604b.m27073a(a.mo29072a());
    }
}
