package com.mapbox.mapboxsdk.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;

public class MapSnapshot {

    /* renamed from: a */
    private Bitmap f30045a;

    /* renamed from: b */
    private String[] f30046b;

    /* renamed from: c */
    private boolean f30047c;
    @Keep
    private long nativePtr = 0;

    @Keep
    private MapSnapshot(long j, Bitmap bitmap, String[] strArr, boolean z) {
        this.nativePtr = j;
        this.f30045a = bitmap;
        this.f30046b = strArr;
        this.f30047c = z;
    }

    @Keep
    private native void initialize();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String[] mo34079a() {
        return this.f30046b;
    }

    /* renamed from: b */
    public Bitmap mo34080b() {
        return this.f30045a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo34081c() {
        return this.f30047c;
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    @Keep
    public native LatLng latLngForPixel(PointF pointF);

    @Keep
    public native PointF pixelForLatLng(LatLng latLng);
}
