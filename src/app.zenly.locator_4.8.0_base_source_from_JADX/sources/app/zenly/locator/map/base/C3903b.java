package app.zenly.locator.map.base;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import app.zenly.locator.map.base.Map.MapListener;
import app.zenly.locator.map.base.Map.OnMapReadyCallback;

/* renamed from: app.zenly.locator.map.base.b */
public abstract class C3903b implements Map {

    /* renamed from: a */
    private final FrameLayout f10344a;

    /* renamed from: b */
    protected final OnTouchListener f10345b = new C3902a(this);

    /* renamed from: c */
    protected int f10346c;

    /* renamed from: d */
    protected int f10347d;

    /* renamed from: e */
    protected int f10348e;

    /* renamed from: f */
    protected int f10349f;

    /* renamed from: g */
    private OnMapReadyCallback f10350g;

    /* renamed from: h */
    private MapListener f10351h;

    public C3903b(FrameLayout frameLayout) {
        this.f10344a = frameLayout;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo10573a(View view, MotionEvent motionEvent) {
        MapListener mapListener = this.f10351h;
        if (mapListener != null) {
            return mapListener.onMapTouch(view, motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10574b() {
        OnMapReadyCallback onMapReadyCallback = this.f10350g;
        if (onMapReadyCallback != null) {
            onMapReadyCallback.onMapReady(this);
        }
    }

    public double getCurrentZoom() {
        return getCameraPosition().f14044e;
    }

    public float getCurrentZoomRatio() {
        double minZoom = getMinZoom();
        return Math.max(0.0f, Math.min(1.0f, (float) ((getCurrentZoom() - minZoom) / (getMaxZoom() - minZoom))));
    }

    public double getHorizontalMetersPerPixelAtCenter() {
        return getMetersPerPixelAtLatitude(getCameraPosition().f14041b);
    }

    public FrameLayout getMapContainer() {
        return this.f10344a;
    }

    public void setListener(MapListener mapListener) {
        this.f10351h = mapListener;
    }

    public void setMapPadding(int i, int i2, int i3, int i4) {
        this.f10347d = i;
        this.f10346c = i2;
        this.f10348e = i3;
        this.f10349f = i4;
    }

    public void setOnMapReadyCallback(OnMapReadyCallback onMapReadyCallback) {
        this.f10350g = onMapReadyCallback;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10572a() {
        MapListener mapListener = this.f10351h;
        if (mapListener != null) {
            mapListener.onMapCameraMove();
        }
    }
}
