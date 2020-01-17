package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.locator.R;
import app.zenly.locator.map.base.Map;
import app.zenly.locator.map.marker.MarkerAdapter.Observer;
import app.zenly.locator.map.marker.MarkerAdapter.Observer.C4150a;
import app.zenly.locator.p143s.p150n.C5456a;
import app.zenly.locator.p143s.p150n.C5459d;
import app.zenly.locator.p143s.p150n.C5464h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: app.zenly.locator.map.marker.h0 */
public class C4187h0 extends FrameLayout implements Callback {

    /* renamed from: A */
    private final PointF f11191A = new PointF();

    /* renamed from: B */
    protected final ArrayList<MarkerAdapter> f11192B = new ArrayList<>();

    /* renamed from: C */
    private boolean f11193C = true;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Runnable f11194D = new C4188a();

    /* renamed from: E */
    private final Observer f11195E = new C4264v(this);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f11196e = 800;

    /* renamed from: f */
    private ViewVisibilityAggregatedHelper f11197f = new ViewVisibilityAggregatedHelper(this);

    /* renamed from: g */
    private Paint f11198g = new Paint();

    /* renamed from: h */
    protected Map f11199h;

    /* renamed from: i */
    private int f11200i;

    /* renamed from: j */
    private int f11201j;

    /* renamed from: k */
    private int f11202k;

    /* renamed from: l */
    private int f11203l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List<C4178e0> f11204m = new ArrayList();

    /* renamed from: n */
    protected final C5464h f11205n = new C5464h();

    /* renamed from: o */
    protected final C5456a f11206o = new C5456a();

    /* renamed from: p */
    protected float f11207p;

    /* renamed from: q */
    protected float f11208q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11209r = false;

    /* renamed from: s */
    private double f11210s = -1.0d;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public double f11211t = -1.0d;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Handler f11212u = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f11213v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f11214w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C4183g0 f11215x = new C4183g0();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11216y = false;

    /* renamed from: z */
    private final PointF f11217z = new PointF();

    /* renamed from: app.zenly.locator.map.marker.h0$a */
    class C4188a implements Runnable {
        C4188a() {
        }

        public void run() {
            if (((double) System.currentTimeMillis()) - C4187h0.this.f11211t > 500.0d) {
                C4187h0.this.f11196e = 800;
            } else {
                C4187h0.this.f11196e = 100;
            }
            if (C4187h0.this.f11214w && C4187h0.this.f11216y && !C4187h0.this.f11209r) {
                C4187h0.this.f11214w = false;
                C4187h0.this.f11215x.mo11130a((Collection<C4178e0>) C4187h0.this.f11204m);
            } else if (C4187h0.this.f11209r) {
                for (C4178e0 j : C4187h0.this.f11204m) {
                    j.mo11041j(false);
                }
            }
            C4187h0.this.f11212u.removeCallbacks(C4187h0.this.f11194D);
            if (C4187h0.this.f11213v) {
                C4187h0.this.f11212u.postDelayed(C4187h0.this.f11194D, C4187h0.this.f11196e);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.h0$b */
    static /* synthetic */ class C4189b {

        /* renamed from: a */
        static final /* synthetic */ int[] f11219a = new int[C4150a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.map.marker.MarkerAdapter$Observer$a[] r0 = app.zenly.locator.map.marker.MarkerAdapter.Observer.C4150a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11219a = r0
                int[] r0 = f11219a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.marker.MarkerAdapter$Observer$a r1 = app.zenly.locator.map.marker.MarkerAdapter.Observer.C4150a.GEO_POSITION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11219a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.marker.MarkerAdapter$Observer$a r1 = app.zenly.locator.map.marker.MarkerAdapter.Observer.C4150a.SCREEN_POSITION     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11219a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.map.marker.MarkerAdapter$Observer$a r1 = app.zenly.locator.map.marker.MarkerAdapter.Observer.C4150a.VISIBILITY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4187h0.C4189b.<clinit>():void");
        }
    }

    public C4187h0(Context context) {
        super(context);
        this.f11198g.setStyle(Style.STROKE);
        this.f11198g.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.stroke_50));
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public List<C4178e0> getAttachedMarkers() {
        return Collections.unmodifiableList(this.f11204m);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11197f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11197f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m12478a(false);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11197f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        m12478a(false);
        m12476a();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11197f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11197f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public void setAutoMinimize(boolean z) {
        this.f11216y = z;
        m12476a();
    }

    /* access modifiers changed from: 0000 */
    public void setCenterFocusedMarker(boolean z) {
        this.f11193C = z;
        m12478a(false);
    }

    public void setMap(Map map) {
        this.f11199h = map;
    }

    /* renamed from: b */
    private void m12482b() {
        if (this.f11213v) {
            this.f11212u.removeCallbacks(this.f11194D);
            this.f11212u.post(this.f11194D);
        }
    }

    /* renamed from: c */
    private void m12483c() {
        if (!this.f11213v) {
            this.f11213v = true;
            this.f11214w = true;
            this.f11212u.post(this.f11194D);
        }
    }

    /* renamed from: d */
    private void m12485d() {
        if (this.f11213v) {
            this.f11213v = false;
            this.f11212u.removeCallbacks(this.f11194D);
        }
    }

    /* renamed from: a */
    public void mo11134a(MarkerAdapter markerAdapter) {
        if (!this.f11192B.contains(markerAdapter)) {
            this.f11192B.add(markerAdapter);
            markerAdapter.mo10903a(this.f11195E);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11133a(int i, int i2, int i3, int i4) {
        this.f11201j = i;
        this.f11200i = i2;
        this.f11202k = i3;
        this.f11203l = i4;
    }

    /* renamed from: a */
    public void mo11137a(C5464h hVar) {
        if (!hVar.equals(this.f11205n)) {
            this.f11205n.mo13081a(hVar);
            this.f11206o.mo13047a(this.f11199h.getCameraPosition().f14040a, this.f11205n);
            this.f11207p = (float) this.f11199h.getHorizontalMetersPerPixelAtCenter();
            this.f11208q = this.f11199h.getCurrentZoomRatio();
            m12478a(false);
            double currentZoom = this.f11199h.getCurrentZoom();
            this.f11209r = currentZoom == this.f11199h.getMaxZoom();
            if (Math.abs(currentZoom - this.f11210s) > 1.0E-4d) {
                this.f11210s = currentZoom;
                this.f11211t = (double) System.currentTimeMillis();
                if (this.f11197f.mo6426a() && this.f11213v && this.f11196e != 100) {
                    m12482b();
                }
            }
            for (int i = 0; i < this.f11192B.size(); i++) {
                FocusedMarkerOverlay b = ((MarkerAdapter) this.f11192B.get(i)).mo10905b();
                if (b != null) {
                    b.mo10859a(hVar);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m12480a(C5459d dVar) {
        return this.f11206o.mo13048a(dVar);
    }

    /* renamed from: a */
    private void m12478a(boolean z) {
        if (this.f11197f.mo6426a()) {
            for (int i = 0; i < this.f11192B.size(); i++) {
                MarkerAdapter markerAdapter = (MarkerAdapter) this.f11192B.get(i);
                List a = markerAdapter.mo10901a();
                for (int i2 = 0; i2 < a.size(); i2++) {
                    mo11136a(markerAdapter, (C4178e0) a.get(i2), z);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11136a(MarkerAdapter markerAdapter, C4178e0 e0Var, boolean z) {
        if (this.f11197f.mo6426a() && this.f11199h != null) {
            e0Var.mo11104b(this.f11208q, this.f11207p);
            FocusedMarkerOverlay b = markerAdapter.mo10905b();
            boolean z2 = true;
            if (e0Var.mo11119t() && e0Var.mo11019A() && e0Var.mo11020B() && (e0Var.mo11125z() || m12480a(e0Var.mo11114k()))) {
                MarkerView b2 = markerAdapter.mo10906b(e0Var);
                if (b == null || b.getMarkerClass() != e0Var.getClass() || !e0Var.mo11122w()) {
                    z2 = false;
                }
                if (z2 && !b.mo10860b(e0Var)) {
                    removeView(b2);
                    this.f11204m.remove(e0Var);
                    b.mo10858a(e0Var);
                } else if (!z2 && b2.getParent() != this) {
                    if (b != null && b.mo10860b(e0Var)) {
                        b.mo2248a();
                    }
                    addView(b2);
                    this.f11204m.add(e0Var);
                    b2.setZ((float) e0Var.mo11046q());
                }
                e0Var.mo11096a(this.f11217z);
                if (!e0Var.mo11122w() || !this.f11193C) {
                    this.f11199h.toScreenLocation(e0Var.mo11114k(), this.f11191A);
                } else {
                    int width = (getWidth() - this.f11201j) - this.f11202k;
                    int height = getHeight();
                    int i = this.f11200i;
                    this.f11191A.set((((float) width) / 2.0f) + ((float) this.f11201j), (((float) ((height - i) - this.f11203l)) / 2.0f) + ((float) i));
                }
                PointF pointF = this.f11191A;
                float f = pointF.x;
                PointF pointF2 = this.f11217z;
                pointF.set(f - pointF2.x, pointF.y - pointF2.y);
                e0Var.mo11097a(this.f11191A, z);
            } else {
                m12477a(markerAdapter, e0Var);
            }
        }
    }

    /* renamed from: a */
    private void m12477a(MarkerAdapter markerAdapter, C4178e0 e0Var) {
        MarkerView g = e0Var.mo11112g();
        if (g != null) {
            removeView(g);
            this.f11204m.remove(e0Var);
            markerAdapter.mo10908c(e0Var);
        }
    }

    /* renamed from: a */
    private void m12476a() {
        if (!this.f11197f.mo6426a() || !this.f11216y) {
            m12485d();
        } else {
            m12483c();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11135a(MarkerAdapter markerAdapter, C4178e0 e0Var, C4150a aVar) {
        int i = C4189b.f11219a[aVar.ordinal()];
        if (i == 1) {
            mo11136a(markerAdapter, e0Var, true);
        } else if (i == 2) {
            this.f11214w = true;
        } else if (i == 3) {
            if (e0Var.mo11119t()) {
                mo11136a(markerAdapter, e0Var, false);
            } else {
                m12477a(markerAdapter, e0Var);
            }
            this.f11214w = true;
        }
    }
}
