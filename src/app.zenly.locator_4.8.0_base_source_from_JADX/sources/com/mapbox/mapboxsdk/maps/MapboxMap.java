package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.ShoveGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.annotations.C11423a;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.camera.C11449a;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.C11448b;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.C11474c;
import com.mapbox.mapboxsdk.maps.Style.C11511c;
import com.mapbox.mapboxsdk.maps.Style.OnStyleLoaded;
import java.util.ArrayList;
import java.util.List;

public final class MapboxMap {

    /* renamed from: a */
    private final NativeMapView f29756a;

    /* renamed from: b */
    private final C11573v f29757b;

    /* renamed from: c */
    private final C11555r f29758c;

    /* renamed from: d */
    private final C11568u f29759d;

    /* renamed from: e */
    private final C11529e f29760e;

    /* renamed from: f */
    private final List<OnStyleLoaded> f29761f = new ArrayList();

    /* renamed from: g */
    private C11474c f29762g;

    /* renamed from: h */
    private C11518b f29763h;

    /* renamed from: i */
    private Style f29764i;

    /* renamed from: j */
    private boolean f29765j;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    @Deprecated
    public interface InfoWindowAdapter {
        View getInfoWindow(Marker marker);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        void onCameraMoveStarted(int i);
    }

    public interface OnCompassAnimationListener {
        void onCompassAnimation();

        void onCompassAnimationFinished();
    }

    public interface OnFlingListener {
        void onFling();
    }

    public interface OnFpsChangedListener {
        void onFpsChanged(double d);
    }

    public interface OnInfoWindowClickListener {
        boolean onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapClickListener {
        boolean onMapClick(LatLng latLng);
    }

    public interface OnMapLongClickListener {
        boolean onMapLongClick(LatLng latLng);
    }

    @Deprecated
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMoveListener {
        void onMove(MoveGestureDetector moveGestureDetector);

        void onMoveBegin(MoveGestureDetector moveGestureDetector);

        void onMoveEnd(MoveGestureDetector moveGestureDetector);
    }

    @Deprecated
    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    @Deprecated
    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface OnRotateListener {
        void onRotate(RotateGestureDetector rotateGestureDetector);

        void onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector);
    }

    public interface OnScaleListener {
        void onScale(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector);
    }

    public interface OnShoveListener {
        void onShove(ShoveGestureDetector shoveGestureDetector);

        void onShoveBegin(ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(ShoveGestureDetector shoveGestureDetector);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapboxMap$a */
    interface C11505a {
    }

    MapboxMap(NativeMapView nativeMapView, C11568u uVar, C11573v vVar, C11555r rVar, C11505a aVar, C11529e eVar) {
        this.f29756a = nativeMapView;
        this.f29757b = vVar;
        this.f29758c = rVar;
        this.f29759d = uVar;
        this.f29760e = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33545a(Context context, MapboxMapOptions mapboxMapOptions) {
        this.f29759d.mo33940a(this, mapboxMapOptions);
        this.f29757b.mo33968a(context, mapboxMapOptions);
        mo33561a(mapboxMapOptions.mo33657m());
        m29755a(mapboxMapOptions);
        m29756b(mapboxMapOptions);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33564b(Bundle bundle) {
        bundle.putParcelable("mapbox_cameraPosition", this.f29759d.mo33943b());
        bundle.putBoolean("mapbox_debugActive", mo33574k());
        this.f29757b.mo33977b(bundle);
    }

    @Deprecated
    /* renamed from: c */
    public InfoWindowAdapter mo33566c() {
        return this.f29763h.mo33794b().mo33818a();
    }

    /* renamed from: d */
    public OnInfoWindowClickListener mo33567d() {
        return this.f29763h.mo33794b().mo33821b();
    }

    /* renamed from: e */
    public OnInfoWindowCloseListener mo33568e() {
        return this.f29763h.mo33794b().mo33822c();
    }

    /* renamed from: f */
    public OnInfoWindowLongClickListener mo33569f() {
        return this.f29763h.mo33794b().mo33823d();
    }

    /* renamed from: g */
    public C11555r mo33570g() {
        return this.f29758c;
    }

    /* renamed from: h */
    public Style mo33571h() {
        Style style = this.f29764i;
        if (style == null || !style.mo33762c()) {
            return null;
        }
        return this.f29764i;
    }

    /* renamed from: i */
    public C11573v mo33572i() {
        return this.f29757b;
    }

    /* renamed from: j */
    public float mo33573j() {
        return (float) this.f29756a.mo33724g();
    }

    /* renamed from: k */
    public boolean mo33574k() {
        return this.f29765j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo33575l() {
        if (!this.f29756a.mo33719d()) {
            Style style = this.f29764i;
            if (style != null) {
                style.mo33764d();
                this.f29762g.mo33455c();
                for (OnStyleLoaded onStyleLoaded : this.f29761f) {
                    onStyleLoaded.onStyleLoaded(this.f29764i);
                }
            } else {
                C11445b.m29550a("No style to provide.");
            }
            this.f29761f.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo33576m() {
        this.f29762g.mo33454b();
        Style style = this.f29764i;
        if (style != null) {
            style.mo33752a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo33577n() {
        this.f29761f.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo33578o() {
        mo33575l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo33579p() {
        this.f29759d.mo33949f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo33580q() {
        this.f29759d.mo33949f();
        this.f29763h.mo33796c();
        this.f29763h.mo33791a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo33581r() {
        this.f29756a.mo33732i();
        this.f29762g.mo33456d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo33582s() {
        this.f29762g.mo33458f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo33583t() {
        CameraPosition f = this.f29759d.mo33949f();
        if (f != null) {
            this.f29757b.mo33972a(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo33584u() {
        this.f29763h.mo33797d();
    }

    /* renamed from: b */
    private void m29756b(MapboxMapOptions mapboxMapOptions) {
        mo33565b(mapboxMapOptions.mo33668v());
    }

    /* renamed from: b */
    public void mo33565b(boolean z) {
        this.f29756a.mo33714c(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33546a(Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable("mapbox_cameraPosition");
        this.f29757b.mo33971a(bundle);
        if (cameraPosition != null) {
            mo33552a(C11449a.m29559a(new C11448b(cameraPosition).mo33323a()));
        }
        this.f29756a.mo33708b(bundle.getBoolean("mapbox_debugActive"));
    }

    /* renamed from: b */
    public void mo33563b(double d) {
        this.f29759d.mo33944b(d);
    }

    /* renamed from: b */
    public float mo33562b() {
        return (float) this.f29756a.mo33722f();
    }

    /* renamed from: a */
    public void mo33542a(double d) {
        this.f29759d.mo33933a(d);
    }

    /* renamed from: a */
    public final CameraPosition mo33541a() {
        return this.f29759d.mo33943b();
    }

    /* renamed from: a */
    public void mo33551a(CameraPosition cameraPosition) {
        mo33554a(C11449a.m29559a(cameraPosition), (CancelableCallback) null);
    }

    /* renamed from: a */
    public final void mo33552a(CameraUpdate cameraUpdate) {
        mo33554a(cameraUpdate, (CancelableCallback) null);
    }

    /* renamed from: a */
    public final void mo33554a(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        this.f29759d.mo33939a(this, cameraUpdate, cancelableCallback);
    }

    /* renamed from: a */
    public final void mo33553a(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        if (i > 0) {
            this.f29759d.mo33938a(this, cameraUpdate, i, cancelableCallback);
            return;
        }
        throw new IllegalArgumentException("Null duration passed into animateCamera");
    }

    /* renamed from: a */
    public void mo33543a(double d, float f, float f2, long j) {
        this.f29759d.mo33936a(d, f, f2, j);
    }

    /* renamed from: a */
    public void mo33561a(boolean z) {
        this.f29765j = z;
        this.f29756a.mo33708b(z);
    }

    /* renamed from: a */
    private void m29755a(MapboxMapOptions mapboxMapOptions) {
        String a = mapboxMapOptions.mo33621a();
        if (!TextUtils.isEmpty(a)) {
            this.f29756a.mo33731h(a);
        }
    }

    /* renamed from: a */
    public void mo33560a(String str, OnStyleLoaded onStyleLoaded) {
        C11511c cVar = new C11511c();
        cVar.mo33769a(str);
        mo33558a(cVar, onStyleLoaded);
    }

    /* renamed from: a */
    public void mo33558a(C11511c cVar, OnStyleLoaded onStyleLoaded) {
        this.f29762g.mo33457e();
        Style style = this.f29764i;
        if (style != null) {
            style.mo33752a();
        }
        if (onStyleLoaded != null) {
            this.f29761f.add(onStyleLoaded);
        }
        this.f29764i = cVar.mo33770a((C11550m) this.f29756a);
        if (!TextUtils.isEmpty(cVar.mo33772b())) {
            this.f29756a.mo33734j(cVar.mo33772b());
        } else if (!TextUtils.isEmpty(cVar.mo33771a())) {
            this.f29756a.mo33733i(cVar.mo33771a());
        } else {
            this.f29756a.mo33733i("{}");
        }
    }

    @Deprecated
    /* renamed from: a */
    public Polyline mo33540a(PolylineOptions polylineOptions) {
        return this.f29763h.mo33783a(polylineOptions, this);
    }

    @Deprecated
    /* renamed from: a */
    public void mo33549a(Polyline polyline) {
        this.f29763h.mo33789a(polyline);
    }

    @Deprecated
    /* renamed from: a */
    public void mo33548a(Polygon polygon) {
        this.f29763h.mo33788a(polygon);
    }

    @Deprecated
    /* renamed from: a */
    public void mo33550a(C11423a aVar) {
        this.f29763h.mo33790a(aVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo33547a(Marker marker) {
        this.f29763h.mo33787a(marker);
    }

    /* renamed from: a */
    public void mo33544a(int i, int i2, int i3, int i4) {
        this.f29758c.mo33890a(new int[]{i, i2, i3, i4});
        this.f29757b.mo34015v();
    }

    /* renamed from: a */
    public void mo33556a(OnCameraIdleListener onCameraIdleListener) {
        this.f29760e.mo33809a(onCameraIdleListener);
    }

    /* renamed from: a */
    public void mo33557a(OnCameraMoveListener onCameraMoveListener) {
        this.f29760e.mo33810a(onCameraMoveListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33555a(C11474c cVar) {
        this.f29762g = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33559a(C11518b bVar) {
        bVar.mo33793b(this);
        this.f29763h = bVar;
    }
}
