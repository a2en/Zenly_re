package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import com.mapbox.mapboxsdk.camera.C11449a;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback;

/* renamed from: com.mapbox.mapboxsdk.maps.u */
final class C11568u implements OnCameraDidChangeListener {

    /* renamed from: a */
    private final C11550m f29990a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MapView f29991b;

    /* renamed from: c */
    private final Handler f29992c = new Handler();

    /* renamed from: d */
    private CameraPosition f29993d;

    /* renamed from: e */
    private CancelableCallback f29994e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11529e f29995f;

    /* renamed from: g */
    private final OnCameraDidChangeListener f29996g = new C11569a();

    /* renamed from: com.mapbox.mapboxsdk.maps.u$a */
    class C11569a implements OnCameraDidChangeListener {
        C11569a() {
        }

        public void onCameraDidChange(boolean z) {
            if (z) {
                C11568u.this.f29995f.onCameraIdle();
                C11568u.this.f29991b.mo33499b((OnCameraDidChangeListener) this);
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.u$b */
    class C11570b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CancelableCallback f29998e;

        C11570b(C11568u uVar, CancelableCallback cancelableCallback) {
            this.f29998e = cancelableCallback;
        }

        public void run() {
            this.f29998e.onFinish();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.u$c */
    class C11571c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CancelableCallback f29999e;

        C11571c(C11568u uVar, CancelableCallback cancelableCallback) {
            this.f29999e = cancelableCallback;
        }

        public void run() {
            CancelableCallback cancelableCallback = this.f29999e;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.u$d */
    class C11572d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CancelableCallback f30000e;

        C11572d(C11568u uVar, CancelableCallback cancelableCallback) {
            this.f30000e = cancelableCallback;
        }

        public void run() {
            this.f30000e.onCancel();
        }
    }

    C11568u(MapView mapView, C11550m mVar, C11529e eVar) {
        this.f29991b = mapView;
        this.f29990a = mVar;
        this.f29995f = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public double mo33946c() {
        return this.f29990a.getBearing();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public double mo33947d() {
        return this.f29990a.getZoom();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public double mo33948e() {
        return this.f29990a.mo33712c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public CameraPosition mo33949f() {
        C11550m mVar = this.f29990a;
        if (mVar != null) {
            CameraPosition cameraPosition = mVar.getCameraPosition();
            CameraPosition cameraPosition2 = this.f29993d;
            if (cameraPosition2 != null && !cameraPosition2.equals(cameraPosition)) {
                this.f29995f.onCameraMove();
            }
            this.f29993d = cameraPosition;
        }
        return this.f29993d;
    }

    public void onCameraDidChange(boolean z) {
        if (z) {
            mo33949f();
            CancelableCallback cancelableCallback = this.f29994e;
            if (cancelableCallback != null) {
                this.f29994e = null;
                this.f29992c.post(new C11570b(this, cancelableCallback));
            }
            this.f29995f.onCameraIdle();
            this.f29991b.mo33499b((OnCameraDidChangeListener) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33940a(MapboxMap mapboxMap, MapboxMapOptions mapboxMapOptions) {
        CameraPosition f = mapboxMapOptions.mo33640f();
        if (f != null && !f.equals(CameraPosition.f29621e)) {
            mo33939a(mapboxMap, C11449a.m29559a(f), (CancelableCallback) null);
        }
        mo33944b(mapboxMapOptions.mo33667u());
        mo33933a(mapboxMapOptions.mo33666t());
    }

    /* renamed from: b */
    public final CameraPosition mo33943b() {
        if (this.f29993d == null) {
            this.f29993d = mo33949f();
        }
        return this.f29993d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33945b(double d, PointF pointF) {
        mo33937a(this.f29990a.getZoom() + d, pointF);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33944b(double d) {
        if (d < 0.0d || d > 25.5d) {
            String str = "Mbgl-Transform";
            Logger.m29680e(str, String.format("Not setting minZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d)}));
            return;
        }
        this.f29990a.mo33705b(d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33939a(MapboxMap mapboxMap, CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (m30188a(cameraPosition)) {
            mo33932a();
            this.f29995f.onCameraMoveStarted(3);
            this.f29990a.mo33691a(cameraPosition.target, cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
            this.f29995f.onCameraIdle();
            mo33949f();
            this.f29992c.post(new C11571c(this, cancelableCallback));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33938a(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (m30188a(cameraPosition)) {
            mo33932a();
            this.f29995f.onCameraMoveStarted(3);
            if (cancelableCallback != null) {
                this.f29994e = cancelableCallback;
            }
            this.f29991b.mo33489a((OnCameraDidChangeListener) this);
            this.f29990a.mo33692a(cameraPosition.target, cameraPosition.zoom, cameraPosition.bearing, cameraPosition.tilt, (long) i);
        }
    }

    /* renamed from: a */
    private boolean m30188a(CameraPosition cameraPosition) {
        return cameraPosition != null && !cameraPosition.equals(this.f29993d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33932a() {
        this.f29995f.onCameraMoveCanceled();
        CancelableCallback cancelableCallback = this.f29994e;
        if (cancelableCallback != null) {
            this.f29995f.onCameraIdle();
            this.f29994e = null;
            this.f29992c.post(new C11572d(this, cancelableCallback));
        }
        this.f29990a.mo33681a();
        this.f29995f.onCameraIdle();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33937a(double d, PointF pointF) {
        this.f29990a.mo33686a(d, pointF, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33935a(double d, float f, float f2) {
        this.f29990a.mo33683a(d, (double) f, (double) f2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33936a(double d, float f, float f2, long j) {
        this.f29990a.mo33683a(d, (double) f, (double) f2, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33941a(Double d) {
        this.f29990a.mo33685a(d.doubleValue(), 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33942a(boolean z) {
        this.f29990a.mo33699a(z);
        if (!z) {
            mo33949f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33934a(double d, double d2, long j) {
        if (j > 0) {
            this.f29991b.mo33489a(this.f29996g);
        }
        this.f29990a.mo33684a(d, d2, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33933a(double d) {
        if (d < 0.0d || d > 25.5d) {
            String str = "Mbgl-Transform";
            Logger.m29680e(str, String.format("Not setting maxZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d)}));
            return;
        }
        this.f29990a.mo33682a(d);
    }
}
