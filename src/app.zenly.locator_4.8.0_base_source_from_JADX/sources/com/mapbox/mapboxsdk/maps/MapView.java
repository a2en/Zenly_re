package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.C11451d;
import com.mapbox.mapboxsdk.C11462h;
import com.mapbox.mapboxsdk.C11467i;
import com.mapbox.mapboxsdk.C11468j;
import com.mapbox.mapboxsdk.C11469k;
import com.mapbox.mapboxsdk.location.C11474c;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener;
import com.mapbox.mapboxsdk.maps.NativeMapView.ViewCallback;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.p318a.C11556a;
import com.mapbox.mapboxsdk.maps.renderer.p319b.C11559a;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.C11594a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p214e.p228e.C7576d;

public class MapView extends FrameLayout implements ViewCallback {

    /* renamed from: e */
    private final C11533h f29722e = new C11533h();

    /* renamed from: f */
    private final C11504k f29723f = new C11504k();

    /* renamed from: g */
    private final C11503j f29724g = new C11503j();

    /* renamed from: h */
    private NativeMapView f29725h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MapboxMap f29726i;

    /* renamed from: j */
    private C11500g f29727j;

    /* renamed from: k */
    private MapboxMapOptions f29728k;

    /* renamed from: l */
    private MapRenderer f29729l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f29730m;

    /* renamed from: n */
    private boolean f29731n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public CompassView f29732o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public PointF f29733p;

    /* renamed from: q */
    private ImageView f29734q;

    /* renamed from: r */
    private ImageView f29735r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11534i f29736s;

    /* renamed from: t */
    private C11546j f29737t;

    /* renamed from: u */
    private Bundle f29738u;

    /* renamed from: v */
    private boolean f29739v;

    public interface OnCameraDidChangeListener {
        void onCameraDidChange(boolean z);
    }

    public interface OnCameraIsChangingListener {
        void onCameraIsChanging();
    }

    public interface OnCameraWillChangeListener {
        void onCameraWillChange(boolean z);
    }

    public interface OnDidBecomeIdleListener {
        void onDidBecomeIdle();
    }

    public interface OnDidFailLoadingMapListener {
        void onDidFailLoadingMap(String str);
    }

    public interface OnDidFinishLoadingMapListener {
        void onDidFinishLoadingMap();
    }

    public interface OnDidFinishLoadingStyleListener {
        void onDidFinishLoadingStyle();
    }

    public interface OnDidFinishRenderingFrameListener {
        void onDidFinishRenderingFrame(boolean z);
    }

    public interface OnDidFinishRenderingMapListener {
        void onDidFinishRenderingMap(boolean z);
    }

    public interface OnSourceChangedListener {
        void onSourceChangedListener(String str);
    }

    public interface OnWillStartLoadingMapListener {
        void onWillStartLoadingMap();
    }

    public interface OnWillStartRenderingFrameListener {
        void onWillStartRenderingFrame();
    }

    public interface OnWillStartRenderingMapListener {
        void onWillStartRenderingMap();
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$a */
    class C11494a implements FocalPointChangeListener {
        C11494a() {
        }

        public void onFocalPointChanged(PointF pointF) {
            MapView.this.f29733p = pointF;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$b */
    class C11495b implements OnCompassAnimationListener {

        /* renamed from: a */
        final /* synthetic */ C11529e f29741a;

        C11495b(C11529e eVar) {
            this.f29741a = eVar;
        }

        public void onCompassAnimation() {
            this.f29741a.onCameraMove();
        }

        public void onCompassAnimationFinished() {
            MapView.this.f29732o.mo34024b(false);
            this.f29741a.onCameraIdle();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$c */
    class C11496c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C11529e f29743e;

        C11496c(C11529e eVar) {
            this.f29743e = eVar;
        }

        public void onClick(View view) {
            if (MapView.this.f29726i != null && MapView.this.f29732o != null) {
                if (MapView.this.f29733p != null) {
                    MapView.this.f29726i.mo33543a(0.0d, MapView.this.f29733p.x, MapView.this.f29733p.y, 150);
                } else {
                    MapView.this.f29726i.mo33543a(0.0d, MapView.this.f29726i.mo33573j() / 2.0f, MapView.this.f29726i.mo33562b() / 2.0f, 150);
                }
                this.f29743e.onCameraMoveStarted(3);
                MapView.this.f29732o.mo34024b(true);
                MapView.this.f29732o.postDelayed(MapView.this.f29732o, 650);
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$d */
    class C11497d extends C11559a {
        C11497d(Context context, TextureView textureView, String str, boolean z) {
            super(context, textureView, str, z);
        }

        /* access modifiers changed from: protected */
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            MapView.this.m29722j();
            super.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$e */
    class C11498e extends C11556a {
        C11498e(Context context, GLSurfaceView gLSurfaceView, String str) {
            super(context, gLSurfaceView, str);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            MapView.this.m29722j();
            super.onSurfaceCreated(gl10, eGLConfig);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$f */
    class C11499f implements Runnable {
        C11499f() {
        }

        public void run() {
            if (!MapView.this.f29730m && MapView.this.f29726i == null) {
                MapView.this.m29720h();
                MapView.this.f29726i.mo33581r();
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$g */
    private static class C11500g implements OnClickListener {

        /* renamed from: e */
        private final C11524d f29748e;

        /* renamed from: f */
        private C11573v f29749f;

        /* synthetic */ C11500g(Context context, MapboxMap mapboxMap, C11494a aVar) {
            this(context, mapboxMap);
        }

        /* renamed from: b */
        private C11524d m29746b() {
            if (this.f29749f.mo33965a() != null) {
                return this.f29749f.mo33965a();
            }
            return this.f29748e;
        }

        /* renamed from: a */
        public void mo33534a() {
            m29746b().mo33802a();
        }

        public void onClick(View view) {
            m29746b().onClick(view);
        }

        private C11500g(Context context, MapboxMap mapboxMap) {
            this.f29748e = new C11524d(context, mapboxMap);
            this.f29749f = mapboxMap.mo33572i();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$h */
    private class C11501h implements FocalPointChangeListener {

        /* renamed from: a */
        private final List<FocalPointChangeListener> f29750a;

        private C11501h() {
            this.f29750a = new ArrayList();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33536a(FocalPointChangeListener focalPointChangeListener) {
            this.f29750a.add(focalPointChangeListener);
        }

        public void onFocalPointChanged(PointF pointF) {
            MapView.this.f29736s.mo33856c(pointF);
            for (FocalPointChangeListener onFocalPointChanged : this.f29750a) {
                onFocalPointChanged.onFocalPointChanged(pointF);
            }
        }

        /* synthetic */ C11501h(MapView mapView, C11494a aVar) {
            this();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$i */
    private class C11502i implements C11505a {
        private C11502i(MapView mapView) {
        }

        /* synthetic */ C11502i(MapView mapView, C11494a aVar) {
            this(mapView);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$j */
    private class C11503j implements OnDidFinishRenderingFrameListener {

        /* renamed from: a */
        private int f29752a;

        C11503j() {
            MapView.this.mo33495a((OnDidFinishRenderingFrameListener) this);
        }

        public void onDidFinishRenderingFrame(boolean z) {
            if (MapView.this.f29726i != null && MapView.this.f29726i.mo33571h() != null && MapView.this.f29726i.mo33571h().mo33762c()) {
                this.f29752a++;
                if (this.f29752a == 3) {
                    MapView.this.setForeground(null);
                    MapView.this.mo33504b((OnDidFinishRenderingFrameListener) this);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m29749a() {
            MapView.this.mo33504b((OnDidFinishRenderingFrameListener) this);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$k */
    private class C11504k implements OnDidFinishLoadingStyleListener, OnDidFinishRenderingFrameListener, OnDidFinishLoadingMapListener, OnCameraIsChangingListener, OnCameraDidChangeListener, OnDidFailLoadingMapListener {

        /* renamed from: a */
        private final List<OnMapReadyCallback> f29754a = new ArrayList();

        C11504k() {
            MapView.this.mo33494a((OnDidFinishLoadingStyleListener) this);
            MapView.this.mo33495a((OnDidFinishRenderingFrameListener) this);
            MapView.this.mo33493a((OnDidFinishLoadingMapListener) this);
            MapView.this.mo33490a((OnCameraIsChangingListener) this);
            MapView.this.mo33489a((OnCameraDidChangeListener) this);
            MapView.this.mo33492a((OnDidFailLoadingMapListener) this);
        }

        /* renamed from: c */
        private void m29751c() {
            if (this.f29754a.size() > 0) {
                Iterator it = this.f29754a.iterator();
                while (it.hasNext()) {
                    OnMapReadyCallback onMapReadyCallback = (OnMapReadyCallback) it.next();
                    if (onMapReadyCallback != null) {
                        onMapReadyCallback.onMapReady(MapView.this.f29726i);
                    }
                    it.remove();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33537a() {
            MapView.this.f29726i.mo33580q();
            m29751c();
            MapView.this.f29726i.mo33579p();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo33539b() {
            this.f29754a.clear();
            MapView.this.mo33503b((OnDidFinishLoadingStyleListener) this);
            MapView.this.mo33504b((OnDidFinishRenderingFrameListener) this);
            MapView.this.mo33502b((OnDidFinishLoadingMapListener) this);
            MapView.this.mo33500b((OnCameraIsChangingListener) this);
            MapView.this.mo33499b((OnCameraDidChangeListener) this);
            MapView.this.mo33501b((OnDidFailLoadingMapListener) this);
        }

        public void onCameraDidChange(boolean z) {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33584u();
            }
        }

        public void onCameraIsChanging() {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33584u();
            }
        }

        public void onDidFailLoadingMap(String str) {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33577n();
            }
        }

        public void onDidFinishLoadingMap() {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33584u();
            }
        }

        public void onDidFinishLoadingStyle() {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33578o();
            }
        }

        public void onDidFinishRenderingFrame(boolean z) {
            if (MapView.this.f29726i != null) {
                MapView.this.f29726i.mo33583t();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo33538a(OnMapReadyCallback onMapReadyCallback) {
            this.f29754a.add(onMapReadyCallback);
        }
    }

    public MapView(Context context) {
        super(context);
        mo33487a(context, MapboxMapOptions.m29802a(context, null));
    }

    private float getPixelRatio() {
        float pixelRatio = this.f29728k.getPixelRatio();
        return pixelRatio == 0.0f ? getResources().getDisplayMetrics().density : pixelRatio;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m29720h() {
        Context context = getContext();
        C11501h hVar = new C11501h(this, null);
        hVar.mo33536a(m29718g());
        C11502i iVar = new C11502i(this, null);
        C11529e eVar = new C11529e();
        C11555r rVar = new C11555r(this.f29725h);
        C11573v vVar = new C11573v(rVar, hVar, this.f29732o, this.f29734q, this.f29735r, getPixelRatio());
        C7576d dVar = new C7576d();
        C11531f fVar = new C11531f(this.f29725h);
        C11518b bVar = r0;
        C11518b bVar2 = new C11518b(this, dVar, fVar, new C11517a(this.f29725h, dVar), new C11548k(this.f29725h, dVar, fVar), new C11551n(this.f29725h, dVar), new C11553p(this.f29725h, dVar), new C11566s(this.f29725h, dVar));
        C11568u uVar = new C11568u(this, this.f29725h, eVar);
        C11573v vVar2 = vVar;
        C11555r rVar2 = rVar;
        C11529e eVar2 = eVar;
        MapboxMap mapboxMap = new MapboxMap(this.f29725h, uVar, vVar2, rVar2, iVar, eVar2);
        this.f29726i = mapboxMap;
        this.f29726i.mo33559a(bVar);
        C11518b bVar3 = bVar;
        C11529e eVar3 = eVar2;
        C11534i iVar2 = new C11534i(context, uVar, rVar2, vVar2, bVar3, eVar2);
        this.f29736s = iVar2;
        this.f29737t = new C11546j(uVar, vVar2, this.f29736s);
        this.f29732o.mo34021a(m29709a(eVar3));
        this.f29732o.setOnClickListener(m29713b(eVar3));
        MapboxMap mapboxMap2 = this.f29726i;
        mapboxMap2.mo33555a(new C11474c(mapboxMap2));
        ImageView imageView = this.f29734q;
        C11500g gVar = new C11500g(context, this.f29726i, null);
        this.f29727j = gVar;
        imageView.setOnClickListener(gVar);
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        this.f29725h.mo33718d(C11451d.m29571f().booleanValue());
        Bundle bundle = this.f29738u;
        if (bundle == null) {
            this.f29726i.mo33545a(context, this.f29728k);
        } else {
            this.f29726i.mo33546a(bundle);
        }
        this.f29723f.mo33537a();
    }

    /* renamed from: i */
    private boolean m29721i() {
        return this.f29736s != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m29722j() {
        this.f29731n = true;
        post(new C11499f());
    }

    public static void setMapStrictModeEnabled(boolean z) {
        C11445b.m29553a(z);
    }

    /* access modifiers changed from: 0000 */
    public MapboxMap getMapboxMap() {
        return this.f29726i;
    }

    public Bitmap getViewContent() {
        return C11594a.m30368a((View) this);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!m29721i()) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return this.f29736s.mo33847a(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f29737t.mo33875a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f29737t.mo33877b(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f29737t.mo33878c(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!isInEditMode()) {
            NativeMapView nativeMapView = this.f29725h;
            if (nativeMapView != null) {
                nativeMapView.mo33687a(i, i2);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m29721i()) {
            return super.onTouchEvent(motionEvent);
        }
        return this.f29736s.mo33855b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return this.f29737t.mo33876a(motionEvent) || super.onTrackballEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setMapboxMap(MapboxMap mapboxMap) {
        this.f29726i = mapboxMap;
    }

    public void setMaximumFps(int i) {
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.setMaximumFps(i);
            return;
        }
        throw new IllegalStateException("Calling MapView#setMaximumFps before mapRenderer is created.");
    }

    /* renamed from: b */
    private OnClickListener m29713b(C11529e eVar) {
        return new C11496c(eVar);
    }

    /* renamed from: g */
    private FocalPointChangeListener m29718g() {
        return new C11494a();
    }

    /* renamed from: c */
    public void mo33505c() {
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.onPause();
        }
    }

    /* renamed from: d */
    public void mo33506d() {
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.onResume();
        }
    }

    /* renamed from: e */
    public void mo33507e() {
        if (!this.f29739v) {
            ConnectivityReceiver.m30311a(getContext()).mo34037a();
            FileSource.m30346d(getContext()).activate();
            this.f29739v = true;
        }
        MapboxMap mapboxMap = this.f29726i;
        if (mapboxMap != null) {
            mapboxMap.mo33581r();
        }
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.onStart();
        }
    }

    /* renamed from: f */
    public void mo33508f() {
        C11500g gVar = this.f29727j;
        if (gVar != null) {
            gVar.mo33534a();
        }
        if (this.f29726i != null) {
            this.f29736s.mo33840a();
            this.f29726i.mo33582s();
        }
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.onStop();
        }
        if (this.f29739v) {
            ConnectivityReceiver.m30311a(getContext()).mo34039b();
            FileSource.m30346d(getContext()).deactivate();
            this.f29739v = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33487a(Context context, MapboxMapOptions mapboxMapOptions) {
        if (!isInEditMode()) {
            setForeground(new ColorDrawable(mapboxMapOptions.mo33660o()));
            this.f29728k = mapboxMapOptions;
            View inflate = LayoutInflater.from(context).inflate(C11468j.mapbox_mapview_internal, this);
            this.f29732o = (CompassView) inflate.findViewById(C11467i.compassView);
            this.f29734q = (ImageView) inflate.findViewById(C11467i.attributionView);
            this.f29734q.setImageDrawable(C11594a.m30369a(getContext(), C11462h.mapbox_info_bg_selector));
            this.f29735r = (ImageView) inflate.findViewById(C11467i.logoView);
            this.f29735r.setImageDrawable(C11594a.m30369a(getContext(), C11462h.mapbox_logo_icon));
            setContentDescription(context.getString(C11469k.mapbox_mapActionDescription));
            setWillNotDraw(false);
            m29711a(mapboxMapOptions);
        }
    }

    /* renamed from: b */
    public void mo33498b(Bundle bundle) {
        if (this.f29726i != null) {
            bundle.putBoolean("mapbox_savedState", true);
            this.f29726i.mo33564b(bundle);
        }
    }

    /* renamed from: b */
    public void mo33497b() {
        NativeMapView nativeMapView = this.f29725h;
        if (nativeMapView != null && !this.f29730m) {
            nativeMapView.mo33730h();
        }
    }

    /* renamed from: b */
    public void mo33500b(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f29722e.mo33835b(onCameraIsChangingListener);
    }

    /* renamed from: b */
    public void mo33499b(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f29722e.mo33834b(onCameraDidChangeListener);
    }

    /* renamed from: b */
    public void mo33502b(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f29722e.mo33837b(onDidFinishLoadingMapListener);
    }

    /* renamed from: b */
    public void mo33501b(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f29722e.mo33836b(onDidFailLoadingMapListener);
    }

    /* renamed from: b */
    public void mo33504b(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f29722e.mo33839b(onDidFinishRenderingFrameListener);
    }

    /* renamed from: b */
    public void mo33503b(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f29722e.mo33838b(onDidFinishLoadingStyleListener);
    }

    /* renamed from: a */
    private OnCompassAnimationListener m29709a(C11529e eVar) {
        return new C11495b(eVar);
    }

    /* renamed from: a */
    public void mo33488a(Bundle bundle) {
        if (bundle == null) {
            TelemetryDefinition d = C11451d.m29569d();
            if (d != null) {
                d.onAppUserTurnstileEvent();
            }
        } else if (bundle.getBoolean("mapbox_savedState")) {
            this.f29738u = bundle;
        }
    }

    /* renamed from: a */
    private void m29711a(MapboxMapOptions mapboxMapOptions) {
        String p = mapboxMapOptions.mo33662p();
        if (mapboxMapOptions.mo33609A()) {
            TextureView textureView = new TextureView(getContext());
            C11497d dVar = new C11497d(getContext(), textureView, p, mapboxMapOptions.mo33611C());
            this.f29729l = dVar;
            addView(textureView, 0);
        } else {
            GLSurfaceView gLSurfaceView = new GLSurfaceView(getContext());
            gLSurfaceView.setZOrderMediaOverlay(this.f29728k.mo33671x());
            this.f29729l = new C11498e(getContext(), gLSurfaceView, p);
            addView(gLSurfaceView, 0);
        }
        NativeMapView nativeMapView = new NativeMapView(getContext(), getPixelRatio(), this.f29728k.mo33655l(), this, this.f29722e, this.f29729l);
        this.f29725h = nativeMapView;
    }

    /* renamed from: a */
    public void mo33486a() {
        this.f29730m = true;
        this.f29722e.mo33826a();
        this.f29723f.mo33539b();
        this.f29724g.m29749a();
        CompassView compassView = this.f29732o;
        if (compassView != null) {
            compassView.mo34027d();
        }
        MapboxMap mapboxMap = this.f29726i;
        if (mapboxMap != null) {
            mapboxMap.mo33576m();
        }
        NativeMapView nativeMapView = this.f29725h;
        if (nativeMapView != null && this.f29731n) {
            nativeMapView.mo33720e();
            this.f29725h = null;
        }
        MapRenderer mapRenderer = this.f29729l;
        if (mapRenderer != null) {
            mapRenderer.onDestroy();
        }
    }

    /* renamed from: a */
    public void mo33491a(OnCameraWillChangeListener onCameraWillChangeListener) {
        this.f29722e.mo33829a(onCameraWillChangeListener);
    }

    /* renamed from: a */
    public void mo33490a(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.f29722e.mo33828a(onCameraIsChangingListener);
    }

    /* renamed from: a */
    public void mo33489a(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.f29722e.mo33827a(onCameraDidChangeListener);
    }

    /* renamed from: a */
    public void mo33493a(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.f29722e.mo33831a(onDidFinishLoadingMapListener);
    }

    /* renamed from: a */
    public void mo33492a(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.f29722e.mo33830a(onDidFailLoadingMapListener);
    }

    /* renamed from: a */
    public void mo33495a(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.f29722e.mo33833a(onDidFinishRenderingFrameListener);
    }

    /* renamed from: a */
    public void mo33494a(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.f29722e.mo33832a(onDidFinishLoadingStyleListener);
    }

    /* renamed from: a */
    public void mo33496a(OnMapReadyCallback onMapReadyCallback) {
        MapboxMap mapboxMap = this.f29726i;
        if (mapboxMap == null) {
            this.f29723f.mo33538a(onMapReadyCallback);
        } else {
            onMapReadyCallback.onMapReady(mapboxMap);
        }
    }
}
