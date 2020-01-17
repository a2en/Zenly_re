package com.mapbox.mapboxsdk.maps;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.annotations.C11427e;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowLongClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mapbox.mapboxsdk.maps.g */
class C11532g {

    /* renamed from: a */
    private final List<C11427e> f29873a = new ArrayList();

    /* renamed from: b */
    private InfoWindowAdapter f29874b;

    /* renamed from: c */
    private boolean f29875c;

    /* renamed from: d */
    private OnInfoWindowClickListener f29876d;

    /* renamed from: e */
    private OnInfoWindowLongClickListener f29877e;

    /* renamed from: f */
    private OnInfoWindowCloseListener f29878f;

    C11532g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public InfoWindowAdapter mo33818a() {
        return this.f29874b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public OnInfoWindowClickListener mo33821b() {
        return this.f29876d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public OnInfoWindowCloseListener mo33822c() {
        return this.f29878f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public OnInfoWindowLongClickListener mo33823d() {
        return this.f29877e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo33824e() {
        return this.f29875c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo33825f() {
        if (!this.f29873a.isEmpty()) {
            for (C11427e c : this.f29873a) {
                c.mo33280c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33820a(Marker marker) {
        return marker != null && (!TextUtils.isEmpty(marker.mo33193g()) || !TextUtils.isEmpty(marker.mo33192f()));
    }

    /* renamed from: a */
    public void mo33819a(C11427e eVar) {
        this.f29873a.add(eVar);
    }
}
