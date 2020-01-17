package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.List;

/* renamed from: com.mapbox.mapboxsdk.maps.m */
interface C11550m {
    /* renamed from: a */
    double mo33676a(String str);

    /* renamed from: a */
    void mo33681a();

    /* renamed from: a */
    void mo33682a(double d);

    /* renamed from: a */
    void mo33683a(double d, double d2, double d3, long j);

    /* renamed from: a */
    void mo33684a(double d, double d2, long j);

    /* renamed from: a */
    void mo33685a(double d, long j);

    /* renamed from: a */
    void mo33686a(double d, PointF pointF, long j);

    /* renamed from: a */
    void mo33688a(long j);

    /* renamed from: a */
    void mo33689a(Polygon polygon);

    /* renamed from: a */
    void mo33690a(Polyline polyline);

    /* renamed from: a */
    void mo33691a(LatLng latLng, double d, double d2, double d3);

    /* renamed from: a */
    void mo33692a(LatLng latLng, double d, double d2, double d3, long j);

    /* renamed from: a */
    void mo33693a(Layer layer);

    /* renamed from: a */
    void mo33694a(Layer layer, int i);

    /* renamed from: a */
    void mo33695a(Layer layer, String str);

    /* renamed from: a */
    void mo33696a(TransitionOptions transitionOptions);

    /* renamed from: a */
    void mo33697a(Source source);

    /* renamed from: a */
    void mo33698a(String str, int i, int i2, float f, byte[] bArr);

    /* renamed from: a */
    void mo33699a(boolean z);

    /* renamed from: a */
    void mo33702a(Image[] imageArr);

    /* renamed from: b */
    long mo33703b(Polyline polyline);

    /* renamed from: b */
    List<Source> mo33704b();

    /* renamed from: b */
    void mo33705b(double d);

    /* renamed from: b */
    void mo33706b(Layer layer, String str);

    /* renamed from: b */
    void mo33707b(String str);

    /* renamed from: b */
    boolean mo33709b(Layer layer);

    /* renamed from: b */
    boolean mo33710b(Source source);

    /* renamed from: c */
    double mo33712c();

    /* renamed from: c */
    boolean mo33715c(String str);

    /* renamed from: d */
    Layer mo33717d(String str);

    /* renamed from: d */
    boolean mo33719d();

    /* renamed from: e */
    void mo33721e(String str);

    /* renamed from: f */
    boolean mo33723f(String str);

    double getBearing();

    CameraPosition getCameraPosition();

    float getPixelRatio();

    double getZoom();
}
