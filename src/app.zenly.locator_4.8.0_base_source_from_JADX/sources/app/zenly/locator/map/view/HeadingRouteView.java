package app.zenly.locator.map.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import app.zenly.locator.map.p116n1.C4276d;
import app.zenly.locator.map.p116n1.C4276d.C4278b;
import app.zenly.locator.map.p116n1.C4280e;
import kotlin.jvm.internal.C12932j;

public final class HeadingRouteView extends View {

    /* renamed from: x */
    private static final double f11741x = Math.toRadians(60.0d);

    /* renamed from: e */
    private final float f11742e;

    /* renamed from: f */
    private final float f11743f;

    /* renamed from: g */
    private final Paint f11744g;

    /* renamed from: h */
    private final Paint f11745h;

    /* renamed from: i */
    private int f11746i;

    /* renamed from: j */
    private int f11747j;

    /* renamed from: k */
    private int f11748k;

    /* renamed from: l */
    private int f11749l;

    /* renamed from: m */
    private PointF f11750m;

    /* renamed from: n */
    private PointF f11751n;

    /* renamed from: o */
    private PointF f11752o;

    /* renamed from: p */
    private final C4276d f11753p;

    /* renamed from: q */
    private PointF f11754q;

    /* renamed from: r */
    private float f11755r;

    /* renamed from: s */
    private final C4276d f11756s;

    /* renamed from: t */
    private PointF f11757t;

    /* renamed from: u */
    private float f11758u;

    /* renamed from: v */
    private Drawable f11759v;

    /* renamed from: w */
    private Drawable f11760w;

    /* renamed from: app.zenly.locator.map.view.HeadingRouteView$a */
    public static final class C4368a {
        private C4368a() {
        }

        public /* synthetic */ C4368a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.view.HeadingRouteView$b */
    public enum C4369b {
        FUTURE,
        NONE,
        PAST
    }

    static {
        new C4368a(null);
    }

    public /* synthetic */ HeadingRouteView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C12928f fVar) {
        if ((i3 & 2) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        this(context, attributeSet, i, i2);
    }

    /* renamed from: b */
    private final void m12996b() {
        PointF pointF;
        PointF pointF2 = this.f11750m;
        PointF pointF3 = this.f11751n;
        PointF pointF4 = this.f11752o;
        if (pointF2 == null && pointF3 == null) {
            mo11450a();
            return;
        }
        if (pointF2 != null && pointF3 != null) {
            pointF = new PointF(pointF3.x - pointF2.x, pointF3.y - pointF2.y);
        } else if (pointF2 != null) {
            pointF = new PointF(pointF4.x - pointF2.x, pointF4.y - pointF2.y);
        } else if (pointF3 != null) {
            pointF = new PointF(pointF3.x - pointF4.x, pointF3.y - pointF4.y);
        } else {
            pointF = new PointF(0.0f, 0.0f);
        }
        PointF pointF5 = pointF;
        if (pointF2 != null) {
            m12993a(this.f11753p, pointF2, pointF4, pointF5, false);
            Paint paint = this.f11744g;
            float f = pointF2.x;
            float f2 = pointF2.y;
            float f3 = pointF4.x;
            float f4 = pointF4.y;
            int i = this.f11746i;
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, f4, i, this.f11747j, TileMode.MIRROR);
            paint.setShader(linearGradient);
            Drawable drawable = this.f11759v;
            if (!(!this.f11753p.mo11295b().isEmpty()) || drawable == null) {
                this.f11754q = null;
            } else {
                PointF pointF6 = this.f11754q;
                if (pointF6 == null) {
                    pointF6 = new PointF();
                }
                C4280e eVar = C4280e.f11477a;
                this.f11755r = eVar.mo11318a(eVar.mo11320a(this.f11753p.mo11295b()), m12989a(drawable), pointF6);
                this.f11754q = pointF6;
            }
        } else {
            this.f11753p.mo11292a();
            this.f11754q = null;
        }
        if (pointF3 != null) {
            m12993a(this.f11756s, pointF3, pointF4, pointF5, true);
            Paint paint2 = this.f11745h;
            float f5 = pointF3.x;
            float f6 = pointF3.y;
            float f7 = pointF4.x;
            float f8 = pointF4.y;
            int i2 = this.f11749l;
            LinearGradient linearGradient2 = new LinearGradient(f5, f6, f7, f8, i2, this.f11748k, TileMode.MIRROR);
            paint2.setShader(linearGradient2);
            Drawable drawable2 = this.f11760w;
            if (!(!this.f11756s.mo11295b().isEmpty()) || drawable2 == null) {
                this.f11757t = null;
            } else {
                PointF pointF7 = this.f11757t;
                if (pointF7 == null) {
                    pointF7 = new PointF();
                }
                C4280e eVar2 = C4280e.f11477a;
                this.f11758u = eVar2.mo11318a(eVar2.mo11320a(this.f11756s.mo11295b()), m12989a(drawable2), pointF7);
                this.f11757t = pointF7;
            }
        } else {
            this.f11756s.mo11292a();
            this.f11757t = null;
        }
        m12999e();
        m12998d();
        invalidate();
    }

    /* renamed from: c */
    private final void m12997c() {
        float f = this.f11742e;
        Drawable drawable = this.f11759v;
        int i = 0;
        float b = C12973l.m33889b(f, (float) (drawable != null ? drawable.getIntrinsicWidth() : 0));
        Drawable drawable2 = this.f11759v;
        float b2 = C12973l.m33889b(b, (float) (drawable2 != null ? drawable2.getIntrinsicHeight() : 0));
        Drawable drawable3 = this.f11760w;
        float b3 = C12973l.m33889b(b2, (float) (drawable3 != null ? drawable3.getIntrinsicWidth() : 0));
        Drawable drawable4 = this.f11760w;
        if (drawable4 != null) {
            i = drawable4.getIntrinsicHeight();
        }
        float b4 = C12973l.m33889b(b3, (float) i);
        float f2 = -b4;
        RectF rectF = new RectF(f2, f2, ((float) getWidth()) + b4, ((float) getHeight()) + b4);
        this.f11753p.mo11294a(rectF);
        this.f11756s.mo11294a(rectF);
        m12996b();
    }

    /* renamed from: d */
    private final void m12998d() {
        Drawable drawable = this.f11760w;
        if (drawable != null) {
            m12992a(drawable, this.f11757t);
        }
    }

    /* renamed from: e */
    private final void m12999e() {
        Drawable drawable = this.f11759v;
        if (drawable != null) {
            m12992a(drawable, this.f11754q);
        }
    }

    /* renamed from: a */
    public final void mo11451a(int i, int i2, int i3, int i4) {
        this.f11746i = i;
        this.f11747j = i2;
        this.f11748k = i3;
        this.f11749l = i4;
        m12996b();
    }

    public final Drawable getFutureAnnotation() {
        return this.f11760w;
    }

    public final Drawable getPastAnnotation() {
        return this.f11759v;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        for (C4278b bVar : this.f11753p.mo11295b()) {
            this.f11744g.setPathEffect(m12995b(bVar.mo11305b()));
            canvas.drawPath(bVar.mo11304a(), this.f11744g);
        }
        for (C4278b bVar2 : this.f11756s.mo11295b()) {
            this.f11745h.setPathEffect(m12995b(bVar2.mo11305b()));
            canvas.drawPath(bVar2.mo11304a(), this.f11745h);
        }
        m12991a(canvas, this.f11759v, this.f11754q, this.f11755r);
        m12991a(canvas, this.f11760w, this.f11757t, this.f11758u);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m12997c();
    }

    public final void setFutureAnnotation(Drawable drawable) {
        this.f11760w = drawable;
        m12997c();
        m12996b();
    }

    public final void setPastAnnotation(Drawable drawable) {
        this.f11759v = drawable;
        m12997c();
        m12996b();
    }

    public HeadingRouteView(Context context, AttributeSet attributeSet, int i, int i2) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i, i2);
        Resources resources = context.getResources();
        String str = "context.resources";
        C12932j.m33815a((Object) resources, str);
        this.f11742e = (float) C13045c.m34055b(((double) resources.getDisplayMetrics().density) * 10.0d);
        Resources resources2 = context.getResources();
        C12932j.m33815a((Object) resources2, str);
        this.f11743f = (float) C13045c.m34055b(((double) resources2.getDisplayMetrics().density) * 15.0d);
        this.f11744g = m12990a(this.f11742e);
        this.f11745h = m12990a(this.f11742e);
        this.f11746i = -7829368;
        this.f11747j = -12303292;
        this.f11748k = -16776961;
        this.f11749l = -16711936;
        this.f11752o = new PointF();
        this.f11753p = new C4276d(6);
        this.f11756s = new C4276d(6);
    }

    /* renamed from: a */
    public final void mo11452a(PointF pointF, PointF pointF2, PointF pointF3) {
        C12932j.m33818b(pointF3, "position");
        this.f11750m = pointF;
        this.f11751n = pointF2;
        this.f11752o = pointF3;
        m12996b();
    }

    /* renamed from: a */
    public final C4369b mo11449a(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "e");
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        if (m12994a(pointF, this.f11754q, this.f11759v)) {
            return C4369b.PAST;
        }
        if (m12994a(pointF, this.f11757t, this.f11760w)) {
            return C4369b.FUTURE;
        }
        float f = this.f11743f;
        float a = C4280e.f11477a.mo11319a(this.f11753p, pointF);
        if (a >= 0.0f && a <= f) {
            return C4369b.PAST;
        }
        float f2 = this.f11743f;
        float a2 = C4280e.f11477a.mo11319a(this.f11756s, pointF);
        if (a2 < 0.0f || a2 > f2) {
            return C4369b.NONE;
        }
        return C4369b.FUTURE;
    }

    /* renamed from: a */
    public final void mo11450a() {
        this.f11750m = null;
        this.f11751n = null;
        this.f11754q = null;
        this.f11757t = null;
        this.f11753p.mo11292a();
        this.f11756s.mo11292a();
        m12999e();
        m12998d();
        invalidate();
    }

    /* renamed from: a */
    private final double m12989a(Drawable drawable) {
        Context context = getContext();
        C12932j.m33815a((Object) context, "context");
        Resources resources = context.getResources();
        C12932j.m33815a((Object) resources, "context.resources");
        return (((double) resources.getDisplayMetrics().density) * 10.0d) + (((double) drawable.getIntrinsicHeight()) / 2.0d);
    }

    /* renamed from: a */
    private final void m12991a(Canvas canvas, Drawable drawable, PointF pointF, float f) {
        if (drawable != null && pointF != null) {
            canvas.save();
            canvas.rotate(-f, pointF.x, pointF.y);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private final Paint m12990a(float f) {
        Paint paint = new Paint(1);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Cap.ROUND);
        return paint;
    }

    /* renamed from: a */
    private final void m12993a(C4276d dVar, PointF pointF, PointF pointF2, PointF pointF3, boolean z) {
        C4276d dVar2 = dVar;
        PointF pointF4 = pointF;
        PointF pointF5 = pointF2;
        PointF pointF6 = pointF3;
        double d = (double) (pointF5.x - pointF4.x);
        double d2 = (double) (pointF5.y - pointF4.y);
        double atan2 = Math.atan2((double) pointF6.y, (double) pointF6.x);
        double atan22 = Math.atan2(d2, d);
        double d3 = atan2 - atan22;
        if (d3 > 3.141592653589793d) {
            d3 -= 6.283185307179586d;
        } else if (d3 <= -3.141592653589793d) {
            d3 += 6.283185307179586d;
        }
        double d4 = f11741x;
        if (!z) {
            d4 *= (double) -1;
        }
        if (d3 < ((double) 0)) {
            d4 *= (double) -1;
        }
        double hypot = Math.hypot(d, d2) * 0.4d;
        double d5 = atan22 + d4;
        double d6 = (atan22 - d4) - 3.141592653589793d;
        dVar.mo11297c(pointF);
        dVar2.mo11293a(pointF5);
        dVar2.mo11298d(new PointF((float) (((double) pointF4.x) + (Math.cos(d5) * hypot)), (float) (((double) pointF4.y) + (Math.sin(d5) * hypot))));
        dVar2.mo11296b(new PointF((float) (((double) pointF5.x) + (Math.cos(d6) * hypot)), (float) (((double) pointF5.y) + (Math.sin(d6) * hypot))));
    }

    /* renamed from: a */
    private final void m12992a(Drawable drawable, PointF pointF) {
        if (pointF != null) {
            float intrinsicWidth = (float) (drawable.getIntrinsicWidth() / 2);
            float intrinsicHeight = (float) (drawable.getIntrinsicHeight() / 2);
            drawable.setBounds(C13045c.m34054a(pointF.x - intrinsicWidth), C13045c.m34054a(pointF.y - intrinsicHeight), C13045c.m34054a(pointF.x + intrinsicWidth), C13045c.m34054a(pointF.y + intrinsicHeight));
            return;
        }
        drawable.setBounds(0, 0, 0, 0);
    }

    /* renamed from: a */
    private final boolean m12994a(PointF pointF, PointF pointF2, Drawable drawable) {
        if (!(pointF2 == null || drawable == null)) {
            Rect bounds = drawable.getBounds();
            if (bounds != null && bounds.contains((int) pointF.x, (int) pointF.y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final DashPathEffect m12995b(float f) {
        Context context = getContext();
        String str = "context";
        C12932j.m33815a((Object) context, str);
        Resources resources = context.getResources();
        String str2 = "context.resources";
        C12932j.m33815a((Object) resources, str2);
        Context context2 = getContext();
        C12932j.m33815a((Object) context2, str);
        Resources resources2 = context2.getResources();
        C12932j.m33815a((Object) resources2, str2);
        return new DashPathEffect(new float[]{(float) C13045c.m34055b(((double) resources.getDisplayMetrics().density) * 0.0d), (float) C13045c.m34055b(((double) resources2.getDisplayMetrics().density) * 12.0d)}, f);
    }
}
