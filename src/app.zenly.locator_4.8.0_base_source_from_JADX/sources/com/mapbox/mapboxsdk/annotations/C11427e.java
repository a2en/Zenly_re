package com.mapbox.mapboxsdk.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.mapbox.mapboxsdk.C11454g;
import com.mapbox.mapboxsdk.C11467i;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowLongClickListener;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: com.mapbox.mapboxsdk.annotations.e */
public class C11427e {

    /* renamed from: a */
    private WeakReference<Marker> f29574a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<MapboxMap> f29575b;

    /* renamed from: c */
    protected WeakReference<View> f29576c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f29577d;

    /* renamed from: e */
    private float f29578e;

    /* renamed from: f */
    private float f29579f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f29580g;

    /* renamed from: h */
    private PointF f29581h;

    /* renamed from: i */
    private boolean f29582i;

    /* renamed from: j */
    private int f29583j;

    /* renamed from: com.mapbox.mapboxsdk.annotations.e$a */
    class C11428a implements OnClickListener {
        C11428a() {
        }

        public void onClick(View view) {
            MapboxMap mapboxMap = (MapboxMap) C11427e.this.f29575b.get();
            if (mapboxMap != null) {
                OnInfoWindowClickListener d = mapboxMap.mo33567d();
                boolean z = false;
                if (d != null) {
                    z = d.onInfoWindowClick(C11427e.this.mo33279b());
                }
                if (!z) {
                    C11427e.this.m29487d();
                }
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.annotations.e$b */
    class C11429b implements OnLongClickListener {
        C11429b() {
        }

        public boolean onLongClick(View view) {
            MapboxMap mapboxMap = (MapboxMap) C11427e.this.f29575b.get();
            if (mapboxMap != null) {
                OnInfoWindowLongClickListener f = mapboxMap.mo33569f();
                if (f != null) {
                    f.onInfoWindowLongClick(C11427e.this.mo33279b());
                }
            }
            return true;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.annotations.e$c */
    class C11430c implements OnGlobalLayoutListener {
        C11430c() {
        }

        public void onGlobalLayout() {
            View view = (View) C11427e.this.f29576c.get();
            if (view != null) {
                if (VERSION.SDK_INT >= 16) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                C11427e.this.f29580g = ((float) (-view.getMeasuredHeight())) + C11427e.this.f29577d;
                C11427e.this.mo33280c();
            }
        }
    }

    C11427e(MapView mapView, int i, MapboxMap mapboxMap) {
        new C11430c();
        this.f29583j = i;
        m29484a(LayoutInflater.from(mapView.getContext()).inflate(i, mapView, false), mapboxMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m29487d() {
        MapboxMap mapboxMap = (MapboxMap) this.f29575b.get();
        Marker marker = (Marker) this.f29574a.get();
        if (!(marker == null || mapboxMap == null)) {
            mapboxMap.mo33547a(marker);
        }
        mo33275a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Marker mo33279b() {
        WeakReference<Marker> weakReference = this.f29574a;
        if (weakReference == null) {
            return null;
        }
        return (Marker) weakReference.get();
    }

    /* renamed from: c */
    public void mo33280c() {
        MapboxMap mapboxMap = (MapboxMap) this.f29575b.get();
        Marker marker = (Marker) this.f29574a.get();
        View view = (View) this.f29576c.get();
        if (mapboxMap != null && marker != null && view != null) {
            this.f29581h = mapboxMap.mo33570g().mo33888a(marker.mo33191e());
            if (view instanceof BubbleLayout) {
                view.setX((this.f29581h.x + this.f29579f) - this.f29578e);
            } else {
                view.setX((this.f29581h.x - ((float) (view.getMeasuredWidth() / 2))) - this.f29578e);
            }
            view.setY(this.f29581h.y + this.f29580g);
        }
    }

    /* renamed from: a */
    private void m29484a(View view, MapboxMap mapboxMap) {
        this.f29575b = new WeakReference<>(mapboxMap);
        this.f29582i = false;
        this.f29576c = new WeakReference<>(view);
        view.setOnClickListener(new C11428a());
        view.setOnLongClickListener(new C11429b());
    }

    C11427e(View view, MapboxMap mapboxMap) {
        new C11430c();
        m29484a(view, mapboxMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11427e mo33277a(MapView mapView, Marker marker, LatLng latLng, int i, int i2) {
        float f;
        boolean z;
        float f2;
        boolean z2;
        int i3 = i;
        int i4 = i2;
        mo33276a(marker);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        MapboxMap mapboxMap = (MapboxMap) this.f29575b.get();
        View view = (View) this.f29576c.get();
        if (!(view == null || mapboxMap == null)) {
            view.measure(0, 0);
            float f3 = (float) i4;
            this.f29577d = f3;
            this.f29578e = (float) (-i3);
            this.f29581h = mapboxMap.mo33570g().mo33888a(latLng);
            float f4 = (float) i3;
            float measuredWidth = (this.f29581h.x - ((float) (view.getMeasuredWidth() / 2))) + f4;
            float measuredHeight = (this.f29581h.y - ((float) view.getMeasuredHeight())) + f3;
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) + measuredWidth;
                float right = (float) mapView.getRight();
                float left = (float) mapView.getLeft();
                float dimension = resources.getDimension(C11454g.mapbox_infowindow_margin);
                float dimension2 = resources.getDimension(C11454g.mapbox_infowindow_tipview_width) / 2.0f;
                float measuredWidth3 = ((float) (view.getMeasuredWidth() / 2)) - dimension2;
                float f5 = this.f29581h.x;
                if (f5 >= 0.0f && f5 <= ((float) mapView.getWidth())) {
                    float f6 = this.f29581h.y;
                    if (f6 >= 0.0f && f6 <= ((float) mapView.getHeight())) {
                        if (measuredWidth2 > right) {
                            float f7 = measuredWidth2 - right;
                            f2 = measuredWidth - f7;
                            measuredWidth3 += f7 + dimension2;
                            f = ((float) view.getMeasuredWidth()) + f2;
                            z = true;
                        } else {
                            f2 = measuredWidth;
                            f = measuredWidth2;
                            z = false;
                        }
                        if (measuredWidth < left) {
                            float f8 = left - measuredWidth;
                            f2 += f8;
                            measuredWidth3 -= f8 + dimension2;
                            measuredWidth = f2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            float f9 = right - f;
                            if (f9 < dimension) {
                                float f10 = dimension - f9;
                                f2 -= f10;
                                measuredWidth3 += f10 - dimension2;
                                measuredWidth = f2;
                            }
                        }
                        if (z2) {
                            float f11 = measuredWidth - left;
                            if (f11 < dimension) {
                                float f12 = dimension - f11;
                                f2 += f12;
                                measuredWidth3 -= f12 - dimension2;
                            }
                        }
                        measuredWidth = f2;
                    }
                }
                ((BubbleLayout) view).mo33177a(measuredWidth3);
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            this.f29579f = (measuredWidth - this.f29581h.x) - f4;
            this.f29580g = (float) ((-view.getMeasuredHeight()) + i4);
            mo33275a();
            mapView.addView(view, layoutParams);
            this.f29582i = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11427e mo33275a() {
        MapboxMap mapboxMap = (MapboxMap) this.f29575b.get();
        if (this.f29582i && mapboxMap != null) {
            this.f29582i = false;
            View view = (View) this.f29576c.get();
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            Marker b = mo33279b();
            OnInfoWindowCloseListener e = mapboxMap.mo33568e();
            if (e != null) {
                e.onInfoWindowClose(b);
            }
            mo33276a((Marker) null);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33278a(Marker marker, MapboxMap mapboxMap, MapView mapView) {
        View view = (View) this.f29576c.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.f29583j, mapView, false);
            m29484a(view, mapboxMap);
        }
        this.f29575b = new WeakReference<>(mapboxMap);
        String g = marker.mo33193g();
        TextView textView = (TextView) view.findViewById(C11467i.infowindow_title);
        if (!TextUtils.isEmpty(g)) {
            textView.setText(g);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        String f = marker.mo33192f();
        TextView textView2 = (TextView) view.findViewById(C11467i.infowindow_description);
        if (!TextUtils.isEmpty(f)) {
            textView2.setText(f);
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11427e mo33276a(Marker marker) {
        this.f29574a = new WeakReference<>(marker);
        return this;
    }
}
