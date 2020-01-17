package com.mapbox.mapboxsdk.annotations;

import android.view.View;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11468j;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;

@Deprecated
public class Marker extends C11423a {

    /* renamed from: g */
    private String f29550g;

    /* renamed from: h */
    private C11426d f29551h;

    /* renamed from: i */
    private String f29552i;
    @Keep
    private String iconId;

    /* renamed from: j */
    private C11427e f29553j;

    /* renamed from: k */
    private boolean f29554k;

    /* renamed from: l */
    private int f29555l;

    /* renamed from: m */
    private int f29556m;
    @Keep
    private LatLng position;

    Marker() {
    }

    /* renamed from: b */
    private C11427e m29412b(MapView mapView) {
        if (this.f29553j == null && mapView.getContext() != null) {
            this.f29553j = new C11427e(mapView, C11468j.mapbox_infowindow_content, mo33256b());
        }
        return this.f29553j;
    }

    /* renamed from: a */
    public C11427e mo33188a(MapboxMap mapboxMap, MapView mapView) {
        mo33255a(mapboxMap);
        mo33254a(mapView);
        InfoWindowAdapter c = mo33256b().mo33566c();
        if (c != null) {
            View infoWindow = c.getInfoWindow(this);
            if (infoWindow != null) {
                this.f29553j = new C11427e(infoWindow, mapboxMap);
                m29411a(this.f29553j, mapView);
                return this.f29553j;
            }
        }
        C11427e b = m29412b(mapView);
        if (mapView.getContext() != null) {
            b.mo33278a(this, mapboxMap, mapView);
        }
        m29411a(b, mapView);
        return b;
    }

    /* renamed from: d */
    public C11426d mo33190d() {
        return this.f29551h;
    }

    /* renamed from: e */
    public LatLng mo33191e() {
        return this.position;
    }

    /* renamed from: f */
    public String mo33192f() {
        return this.f29550g;
    }

    /* renamed from: g */
    public String mo33193g() {
        return this.f29552i;
    }

    /* renamed from: h */
    public void mo33194h() {
        C11427e eVar = this.f29553j;
        if (eVar != null) {
            eVar.mo33275a();
        }
        this.f29554k = false;
    }

    /* renamed from: i */
    public boolean mo33195i() {
        return this.f29554k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marker [position[");
        sb.append(mo33191e());
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    private C11427e m29411a(C11427e eVar, MapView mapView) {
        eVar.mo33277a(mapView, this, mo33191e(), this.f29556m, this.f29555l);
        this.f29554k = true;
        return eVar;
    }

    /* renamed from: a */
    public void mo33189a(int i) {
        this.f29555l = i;
    }
}
