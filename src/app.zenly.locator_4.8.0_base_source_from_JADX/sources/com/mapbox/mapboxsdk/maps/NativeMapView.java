package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.C11448b;
import com.mapbox.mapboxsdk.exceptions.CalledFromWorkerThreadException;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap.SnapshotReadyCallback;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.style.layers.CannotAddLayerException;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.CannotAddSourceException;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.mapboxsdk.utils.C11594a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class NativeMapView implements C11550m {

    /* renamed from: a */
    private final FileSource f29797a;

    /* renamed from: b */
    private final MapRenderer f29798b;

    /* renamed from: c */
    private final Thread f29799c;

    /* renamed from: d */
    private ViewCallback f29800d;

    /* renamed from: e */
    private C11507a f29801e;

    /* renamed from: f */
    private final float f29802f;

    /* renamed from: g */
    private boolean f29803g = false;

    /* renamed from: h */
    private SnapshotReadyCallback f29804h;
    @Keep
    private long nativePtr = 0;

    public interface ViewCallback {
        int getHeight();

        Bitmap getViewContent();

        int getWidth();
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.NativeMapView$a */
    interface C11507a extends C11508b {
        /* renamed from: a */
        void mo33738a(String str);

        void onCameraDidChange(boolean z);

        void onCameraIsChanging();

        void onCameraWillChange(boolean z);

        void onDidBecomeIdle();

        void onDidFailLoadingMap(String str);

        void onDidFinishLoadingMap();

        void onDidFinishRenderingFrame(boolean z);

        void onDidFinishRenderingMap(boolean z);

        void onWillStartRenderingFrame();

        void onWillStartRenderingMap();
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.NativeMapView$b */
    interface C11508b {
        void onDidFinishLoadingStyle();

        void onWillStartLoadingMap();
    }

    static {
        C11419a.m29393a();
    }

    public NativeMapView(Context context, float f, boolean z, ViewCallback viewCallback, C11507a aVar, MapRenderer mapRenderer) {
        this.f29798b = mapRenderer;
        this.f29800d = viewCallback;
        this.f29797a = FileSource.m30346d(context);
        this.f29802f = f;
        this.f29799c = Thread.currentThread();
        this.f29801e = aVar;
        nativeInitialize(this, this.f29797a, mapRenderer, f, z);
    }

    /* renamed from: k */
    private boolean m29863k(String str) {
        if (this.f29799c == Thread.currentThread()) {
            if (this.f29803g && !TextUtils.isEmpty(str)) {
                String format = String.format("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", new Object[]{str});
                Logger.m29680e("Mbgl-NativeMapView", format);
                C11445b.m29550a(format);
            }
            return this.f29803g;
        }
        throw new CalledFromWorkerThreadException(String.format("Map interactions should happen on the UI thread. Method invoked from wrong thread is %s.", new Object[]{str}));
    }

    @Keep
    private native void nativeAddAnnotationIcon(String str, int i, int i2, float f, byte[] bArr);

    @Keep
    private native void nativeAddImage(String str, Bitmap bitmap, float f, boolean z);

    @Keep
    private native void nativeAddImages(Image[] imageArr);

    @Keep
    private native void nativeAddLayer(long j, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAbove(long j, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAt(long j, int i) throws CannotAddLayerException;

    @Keep
    private native long[] nativeAddMarkers(Marker[] markerArr);

    @Keep
    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    @Keep
    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    @Keep
    private native void nativeAddSource(Source source, long j) throws CannotAddSourceException;

    @Keep
    private native void nativeCancelTransitions();

    @Keep
    private native void nativeCycleDebugOptions();

    @Keep
    private native void nativeDestroy();

    @Keep
    private native void nativeEaseTo(double d, double d2, double d3, long j, double d4, double d5, boolean z);

    @Keep
    private native void nativeFlyTo(double d, double d2, double d3, long j, double d4, double d5);

    @Keep
    private native double nativeGetBearing();

    @Keep
    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d, double d2, double d3, double d4, double d5, double d6);

    @Keep
    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d, double d2, double d3, double d4, double d5, double d6);

    @Keep
    private native CameraPosition nativeGetCameraPosition();

    @Keep
    private native float[] nativeGetContentPadding();

    @Keep
    private native boolean nativeGetDebug();

    @Keep
    private native Bitmap nativeGetImage(String str);

    @Keep
    private native LatLng nativeGetLatLng();

    @Keep
    private native Layer nativeGetLayer(String str);

    @Keep
    private native Layer[] nativeGetLayers();

    @Keep
    private native Light nativeGetLight();

    @Keep
    private native double nativeGetMaxZoom();

    @Keep
    private native double nativeGetMetersPerPixelAtLatitude(double d, double d2);

    @Keep
    private native double nativeGetMinZoom();

    @Keep
    private native double nativeGetPitch();

    @Keep
    private native boolean nativeGetPrefetchTiles();

    @Keep
    private native Source nativeGetSource(String str);

    @Keep
    private native Source[] nativeGetSources();

    @Keep
    private native String nativeGetStyleJson();

    @Keep
    private native String nativeGetStyleUrl();

    @Keep
    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    @Keep
    private native long nativeGetTransitionDelay();

    @Keep
    private native long nativeGetTransitionDuration();

    @Keep
    private native TransitionOptions nativeGetTransitionOptions();

    @Keep
    private native double nativeGetZoom();

    @Keep
    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, float f, boolean z);

    @Keep
    private native boolean nativeIsFullyLoaded();

    @Keep
    private native void nativeJumpTo(double d, double d2, double d3, double d4, double d5);

    @Keep
    private native LatLng nativeLatLngForPixel(float f, float f2);

    @Keep
    private native LatLng nativeLatLngForProjectedMeters(double d, double d2);

    @Keep
    private native void nativeMoveBy(double d, double d2, long j);

    @Keep
    private native void nativeOnLowMemory();

    @Keep
    private native PointF nativePixelForLatLng(double d, double d2);

    @Keep
    private native ProjectedMeters nativeProjectedMetersForLatLng(double d, double d2);

    @Keep
    private native long[] nativeQueryPointAnnotations(RectF rectF);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForBox(float f, float f2, float f3, float f4, String[] strArr, Object[] objArr);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f, float f2, String[] strArr, Object[] objArr);

    @Keep
    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    @Keep
    private native void nativeRemoveAnnotationIcon(String str);

    @Keep
    private native void nativeRemoveAnnotations(long[] jArr);

    @Keep
    private native void nativeRemoveImage(String str);

    @Keep
    private native boolean nativeRemoveLayer(long j);

    @Keep
    private native boolean nativeRemoveLayerAt(int i);

    @Keep
    private native boolean nativeRemoveSource(Source source, long j);

    @Keep
    private native void nativeResetNorth();

    @Keep
    private native void nativeResetPosition();

    @Keep
    private native void nativeResetZoom();

    @Keep
    private native void nativeResizeView(int i, int i2);

    @Keep
    private native void nativeRotateBy(double d, double d2, double d3, double d4, long j);

    @Keep
    private native void nativeSetBearing(double d, long j);

    @Keep
    private native void nativeSetBearingXY(double d, double d2, double d3, long j);

    @Keep
    private native void nativeSetContentPadding(float f, float f2, float f3, float f4);

    @Keep
    private native void nativeSetDebug(boolean z);

    @Keep
    private native void nativeSetGestureInProgress(boolean z);

    @Keep
    private native void nativeSetLatLng(double d, double d2, long j);

    @Keep
    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeSetMaxZoom(double d);

    @Keep
    private native void nativeSetMinZoom(double d);

    @Keep
    private native void nativeSetPitch(double d, long j);

    @Keep
    private native void nativeSetPrefetchTiles(boolean z);

    @Keep
    private native void nativeSetReachability(boolean z);

    @Keep
    private native void nativeSetStyleJson(String str);

    @Keep
    private native void nativeSetStyleUrl(String str);

    @Keep
    private native void nativeSetTransitionDelay(long j);

    @Keep
    private native void nativeSetTransitionDuration(long j);

    @Keep
    private native void nativeSetTransitionOptions(TransitionOptions transitionOptions);

    @Keep
    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j);

    @Keep
    private native void nativeSetZoom(double d, double d2, double d3, long j);

    @Keep
    private native void nativeTakeSnapshot();

    @Keep
    private native void nativeUpdateMarker(long j, double d, double d2, String str);

    @Keep
    private native void nativeUpdatePolygon(long j, Polygon polygon);

    @Keep
    private native void nativeUpdatePolyline(long j, Polyline polyline);

    @Keep
    private void onCameraDidChange(boolean z) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onCameraDidChange(z);
        }
    }

    @Keep
    private void onCameraIsChanging() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onCameraIsChanging();
        }
    }

    @Keep
    private void onCameraWillChange(boolean z) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onCameraWillChange(z);
        }
    }

    @Keep
    private void onDidBecomeIdle() {
        this.f29801e.onDidBecomeIdle();
    }

    @Keep
    private void onDidFailLoadingMap(String str) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onDidFailLoadingMap(str);
        }
    }

    @Keep
    private void onDidFinishLoadingMap() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onDidFinishLoadingMap();
        }
    }

    @Keep
    private void onDidFinishLoadingStyle() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onDidFinishLoadingStyle();
        }
    }

    @Keep
    private void onDidFinishRenderingFrame(boolean z) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onDidFinishRenderingFrame(z);
        }
    }

    @Keep
    private void onDidFinishRenderingMap(boolean z) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onDidFinishRenderingMap(z);
        }
    }

    @Keep
    private void onSourceChanged(String str) {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.mo33738a(str);
        }
    }

    @Keep
    private void onWillStartLoadingMap() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onWillStartLoadingMap();
        }
    }

    @Keep
    private void onWillStartRenderingFrame() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onWillStartRenderingFrame();
        }
    }

    @Keep
    private void onWillStartRenderingMap() {
        C11507a aVar = this.f29801e;
        if (aVar != null) {
            aVar.onWillStartRenderingMap();
        }
    }

    /* renamed from: a */
    public void mo33687a(int i, int i2) {
        if (!m29863k("resizeView")) {
            int ceil = (int) Math.ceil((double) (((float) i) / this.f29802f));
            int ceil2 = (int) Math.ceil((double) (((float) i2) / this.f29802f));
            if (ceil < 0) {
                throw new IllegalArgumentException("width cannot be negative.");
            } else if (ceil2 >= 0) {
                String str = "Mbgl-NativeMapView";
                if (ceil > 65535) {
                    Logger.m29680e(str, String.format("Device returned an out of range width size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil)}));
                    ceil = 65535;
                }
                if (ceil2 > 65535) {
                    Logger.m29680e(str, String.format("Device returned an out of range height size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil2)}));
                    ceil2 = 65535;
                }
                nativeResizeView(ceil, ceil2);
            } else {
                throw new IllegalArgumentException("height cannot be negative.");
            }
        }
    }

    /* renamed from: b */
    public void mo33705b(double d) {
        if (!m29863k("setMinZoom")) {
            nativeSetMinZoom(d);
        }
    }

    /* renamed from: c */
    public double mo33712c() {
        if (m29863k("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    /* renamed from: d */
    public void mo33718d(boolean z) {
        if (!m29863k("setReachability")) {
            nativeSetReachability(z);
        }
    }

    /* renamed from: e */
    public void mo33720e() {
        this.f29803g = true;
        this.f29800d = null;
        nativeDestroy();
    }

    /* renamed from: f */
    public boolean mo33723f(String str) {
        if (m29863k("removeLayer")) {
            return false;
        }
        Layer d = mo33717d(str);
        if (d != null) {
            return mo33709b(d);
        }
        return false;
    }

    /* renamed from: g */
    public Source mo33725g(String str) {
        if (m29863k("getSource")) {
            return null;
        }
        return nativeGetSource(str);
    }

    public double getBearing() {
        if (m29863k("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    public CameraPosition getCameraPosition() {
        if (m29863k("getCameraValues")) {
            return new C11448b().mo33323a();
        }
        return nativeGetCameraPosition();
    }

    public float getPixelRatio() {
        return this.f29802f;
    }

    public double getZoom() {
        if (m29863k("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    /* renamed from: h */
    public void mo33730h() {
        if (!m29863k("onLowMemory")) {
            nativeOnLowMemory();
        }
    }

    /* renamed from: i */
    public void mo33732i() {
        if (!m29863k("update")) {
            this.f29798b.requestRender();
        }
    }

    /* renamed from: j */
    public void mo33734j(String str) {
        if (!m29863k("setStyleUrl")) {
            nativeSetStyleUrl(str);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotReady(Bitmap bitmap) {
        if (!m29863k("OnSnapshotReady")) {
            Bitmap viewContent = this.f29800d.getViewContent();
            SnapshotReadyCallback snapshotReadyCallback = this.f29804h;
            if (!(snapshotReadyCallback == null || bitmap == null || viewContent == null)) {
                snapshotReadyCallback.onSnapshotReady(C11594a.m30366a(bitmap, viewContent));
            }
        }
    }

    /* renamed from: b */
    public long mo33703b(Polyline polyline) {
        if (m29863k("addPolyline")) {
            return 0;
        }
        return nativeAddPolylines(new Polyline[]{polyline})[0];
    }

    /* renamed from: c */
    public long[] mo33716c(RectF rectF) {
        if (m29863k("queryShapeAnnotations")) {
            return new long[0];
        }
        return nativeQueryShapeAnnotations(rectF);
    }

    /* renamed from: d */
    public Layer mo33717d(String str) {
        if (m29863k("getLayer")) {
            return null;
        }
        return nativeGetLayer(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo33724g() {
        if (!m29863k("")) {
            ViewCallback viewCallback = this.f29800d;
            if (viewCallback != null) {
                return viewCallback.getWidth();
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo33731h(String str) {
        if (!m29863k("setApiBaseUrl")) {
            this.f29797a.setApiBaseUrl(str);
        }
    }

    /* renamed from: i */
    public void mo33733i(String str) {
        if (!m29863k("setStyleJson")) {
            nativeSetStyleJson(str);
        }
    }

    /* renamed from: e */
    public void mo33721e(String str) {
        if (!m29863k("removeAnnotationIcon")) {
            nativeRemoveAnnotationIcon(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo33722f() {
        if (!m29863k("")) {
            ViewCallback viewCallback = this.f29800d;
            if (viewCallback != null) {
                return viewCallback.getHeight();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public long[] mo33711b(RectF rectF) {
        if (m29863k("queryPointAnnotations")) {
            return new long[0];
        }
        return nativeQueryPointAnnotations(rectF);
    }

    /* renamed from: c */
    public double mo33713c(double d) {
        if (m29863k("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        return nativeGetMetersPerPixelAtLatitude(d, getZoom()) / ((double) this.f29802f);
    }

    /* renamed from: d */
    public boolean mo33719d() {
        return this.f29803g;
    }

    /* renamed from: b */
    public void mo33708b(boolean z) {
        if (!m29863k("setDebug")) {
            nativeSetDebug(z);
        }
    }

    /* renamed from: c */
    public void mo33714c(boolean z) {
        if (!m29863k("setPrefetchTiles")) {
            nativeSetPrefetchTiles(z);
        }
    }

    /* renamed from: b */
    public void mo33706b(Layer layer, String str) {
        if (!m29863k("addLayerBelow")) {
            nativeAddLayer(layer.mo34131c(), str);
        }
    }

    /* renamed from: c */
    public boolean mo33715c(String str) {
        if (m29863k("removeSource")) {
            return false;
        }
        Source g = mo33725g(str);
        if (g != null) {
            return mo33710b(g);
        }
        return false;
    }

    /* renamed from: a */
    public void mo33681a() {
        if (!m29863k("cancelTransitions")) {
            nativeCancelTransitions();
        }
    }

    /* renamed from: b */
    public boolean mo33709b(Layer layer) {
        if (m29863k("removeLayer")) {
            return false;
        }
        return nativeRemoveLayer(layer.mo34131c());
    }

    /* renamed from: a */
    public void mo33699a(boolean z) {
        if (!m29863k("setGestureInProgress")) {
            nativeSetGestureInProgress(z);
        }
    }

    /* renamed from: b */
    public List<Source> mo33704b() {
        if (m29863k("getSources")) {
            return new ArrayList();
        }
        return Arrays.asList(nativeGetSources());
    }

    /* renamed from: a */
    public void mo33684a(double d, double d2, long j) {
        if (!m29863k("moveBy")) {
            float f = this.f29802f;
            nativeMoveBy(d / ((double) f), d2 / ((double) f), j);
        }
    }

    /* renamed from: b */
    public boolean mo33710b(Source source) {
        if (m29863k("removeSource")) {
            return false;
        }
        return nativeRemoveSource(source, source.getNativePtr());
    }

    /* renamed from: a */
    public void mo33685a(double d, long j) {
        if (!m29863k("setPitch")) {
            nativeSetPitch(d, j);
        }
    }

    /* renamed from: b */
    public void mo33707b(String str) {
        if (!m29863k("removeImage")) {
            nativeRemoveImage(str);
        }
    }

    /* renamed from: a */
    public void mo33686a(double d, PointF pointF, long j) {
        if (!m29863k("setZoom")) {
            float f = pointF.x;
            float f2 = this.f29802f;
            nativeSetZoom(d, (double) (f / f2), (double) (pointF.y / f2), j);
        }
    }

    /* renamed from: a */
    public void mo33682a(double d) {
        if (!m29863k("setMaxZoom")) {
            nativeSetMaxZoom(d);
        }
    }

    /* renamed from: a */
    public void mo33700a(float[] fArr) {
        if (!m29863k("setContentPadding")) {
            float f = fArr[1];
            float f2 = this.f29802f;
            nativeSetContentPadding(f / f2, fArr[0] / f2, fArr[3] / f2, fArr[2] / f2);
        }
    }

    /* renamed from: a */
    public void mo33683a(double d, double d2, double d3, long j) {
        if (!m29863k("setBearing")) {
            float f = this.f29802f;
            nativeSetBearingXY(d, d2 / ((double) f), d3 / ((double) f), j);
        }
    }

    /* renamed from: a */
    public long mo33677a(Marker marker) {
        if (m29863k("addMarker")) {
            return 0;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    /* renamed from: a */
    public void mo33689a(Polygon polygon) {
        if (!m29863k("updatePolygon")) {
            nativeUpdatePolygon(polygon.mo33252a(), polygon);
        }
    }

    /* renamed from: a */
    public void mo33690a(Polyline polyline) {
        if (!m29863k("updatePolyline")) {
            nativeUpdatePolyline(polyline.mo33252a(), polyline);
        }
    }

    /* renamed from: a */
    public void mo33688a(long j) {
        if (!m29863k("removeAnnotation")) {
            mo33701a(new long[]{j});
        }
    }

    /* renamed from: a */
    public void mo33701a(long[] jArr) {
        if (!m29863k("removeAnnotations")) {
            nativeRemoveAnnotations(jArr);
        }
    }

    /* renamed from: a */
    public void mo33698a(String str, int i, int i2, float f, byte[] bArr) {
        if (!m29863k("addAnnotationIcon")) {
            nativeAddAnnotationIcon(str, i, i2, f, bArr);
        }
    }

    /* renamed from: a */
    public PointF mo33678a(LatLng latLng) {
        if (m29863k("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(latLng.mo33334a(), latLng.mo33336b());
        float f = nativePixelForLatLng.x;
        float f2 = this.f29802f;
        nativePixelForLatLng.set(f * f2, nativePixelForLatLng.y * f2);
        return nativePixelForLatLng;
    }

    /* renamed from: a */
    public LatLng mo33680a(PointF pointF) {
        if (m29863k("latLngForPixel")) {
            return new LatLng();
        }
        float f = pointF.x;
        float f2 = this.f29802f;
        return nativeLatLngForPixel(f / f2, pointF.y / f2);
    }

    /* renamed from: a */
    public double mo33676a(String str) {
        if (m29863k("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    /* renamed from: a */
    public void mo33691a(LatLng latLng, double d, double d2, double d3) {
        if (!m29863k("jumpTo")) {
            nativeJumpTo(d3, latLng.mo33334a(), latLng.mo33336b(), d2, d);
        }
    }

    /* renamed from: a */
    public void mo33692a(LatLng latLng, double d, double d2, double d3, long j) {
        if (!m29863k("flyTo")) {
            nativeFlyTo(d2, latLng.mo33334a(), latLng.mo33336b(), j, d3, d);
        }
    }

    /* renamed from: a */
    public void mo33696a(TransitionOptions transitionOptions) {
        nativeSetTransitionOptions(transitionOptions);
    }

    /* renamed from: a */
    public void mo33693a(Layer layer) {
        if (!m29863k("addLayer")) {
            nativeAddLayer(layer.mo34131c(), null);
        }
    }

    /* renamed from: a */
    public void mo33695a(Layer layer, String str) {
        if (!m29863k("addLayerAbove")) {
            nativeAddLayerAbove(layer.mo34131c(), str);
        }
    }

    /* renamed from: a */
    public void mo33694a(Layer layer, int i) {
        if (!m29863k("addLayerAt")) {
            nativeAddLayerAt(layer.mo34131c(), i);
        }
    }

    /* renamed from: a */
    public void mo33697a(Source source) {
        if (!m29863k("addSource")) {
            nativeAddSource(source, source.getNativePtr());
        }
    }

    /* renamed from: a */
    public void mo33702a(Image[] imageArr) {
        if (!m29863k("addImages")) {
            nativeAddImages(imageArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public RectF mo33679a(RectF rectF) {
        float f = rectF.left;
        float f2 = this.f29802f;
        return new RectF(f / f2, rectF.top / f2, rectF.right / f2, rectF.bottom / f2);
    }
}
