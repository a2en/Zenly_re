package app.zenly.locator.map.view;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.View;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

public final class PrecisionCircleView extends View implements Callback {

    /* renamed from: e */
    private final Paint f11768e;

    /* renamed from: f */
    private final ViewVisibilityAggregatedHelper<?> f11769f = new ViewVisibilityAggregatedHelper<>(this);

    /* renamed from: g */
    private final C4371b f11770g = new C4371b(new C4374c(this));

    /* renamed from: h */
    private float f11771h;

    /* renamed from: i */
    private PrecisionCalculator f11772i = new C4370a();

    /* renamed from: j */
    private PointF f11773j;

    public interface PrecisionCalculator {
        float computePrecisionRadius(double d);
    }

    /* renamed from: app.zenly.locator.map.view.PrecisionCircleView$a */
    private static final class C4370a implements PrecisionCalculator {
        public float computePrecisionRadius(double d) {
            return (float) d;
        }
    }

    /* renamed from: app.zenly.locator.map.view.PrecisionCircleView$b */
    public static final class C4371b {

        /* renamed from: a */
        private double f11774a;

        /* renamed from: b */
        private boolean f11775b;

        /* renamed from: c */
        private double f11776c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public double f11777d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f11778e;

        /* renamed from: f */
        private final TimeAnimator f11779f;

        /* renamed from: g */
        private final Function0<C12956q> f11780g;

        /* renamed from: app.zenly.locator.map.view.PrecisionCircleView$b$a */
        static final class C4372a implements TimeListener {

            /* renamed from: a */
            final /* synthetic */ TimeAnimator f11781a;

            /* renamed from: b */
            final /* synthetic */ C4371b f11782b;

            C4372a(TimeAnimator timeAnimator, C4371b bVar) {
                this.f11781a = timeAnimator;
                this.f11782b = bVar;
            }

            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                float c = C12973l.m33892c(((float) (SystemClock.elapsedRealtime() - this.f11782b.f11778e)) / ((float) (this.f11782b.mo11497b() == 0.0d ? 100 : 1000)), 1.0f);
                C4371b bVar = this.f11782b;
                bVar.m13009b(bVar.f11777d + ((this.f11782b.mo11497b() - this.f11782b.f11777d) * ((double) c)));
                if (c == 1.0f) {
                    this.f11781a.cancel();
                }
            }
        }

        /* renamed from: app.zenly.locator.map.view.PrecisionCircleView$b$b */
        public static final class C4373b {
            private C4373b() {
            }

            public /* synthetic */ C4373b(C12928f fVar) {
                this();
            }
        }

        static {
            new C4373b(null);
        }

        public C4371b(Function0<C12956q> function0) {
            C12932j.m33818b(function0, "onUpdate");
            this.f11780g = function0;
            TimeAnimator timeAnimator = new TimeAnimator();
            timeAnimator.setTimeListener(new C4372a(timeAnimator, this));
            this.f11779f = timeAnimator;
        }

        /* renamed from: c */
        private final void m13010c() {
            if (!this.f11775b || Math.abs(this.f11776c - this.f11774a) < 0.1d) {
                if (this.f11779f.isStarted()) {
                    this.f11779f.cancel();
                }
                m13009b(this.f11776c);
            } else if (!this.f11779f.isStarted()) {
                this.f11779f.start();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m13009b(double d) {
            if (d != this.f11774a) {
                this.f11774a = d;
                this.f11780g.invoke();
            }
        }

        /* renamed from: a */
        public final double mo11494a() {
            return this.f11774a;
        }

        /* renamed from: a */
        public final void mo11496a(boolean z) {
            this.f11775b = z;
            m13010c();
        }

        /* renamed from: b */
        public final double mo11497b() {
            return this.f11776c;
        }

        /* renamed from: a */
        public final void mo11495a(double d) {
            if (d != this.f11776c) {
                this.f11776c = d;
                this.f11778e = SystemClock.elapsedRealtime();
                this.f11777d = this.f11774a;
                m13010c();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.PrecisionCircleView$c */
    static final class C4374c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ PrecisionCircleView f11783f;

        C4374c(PrecisionCircleView precisionCircleView) {
            this.f11783f = precisionCircleView;
            super(0);
        }

        public final void invoke() {
            this.f11783f.mo11479a();
        }
    }

    public PrecisionCircleView(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(Style.FILL);
        this.f11768e = paint;
    }

    /* renamed from: a */
    public final void mo11479a() {
        float computePrecisionRadius = this.f11772i.computePrecisionRadius(this.f11770g.mo11494a());
        if (computePrecisionRadius != this.f11771h) {
            this.f11771h = computePrecisionRadius;
            invalidate();
        }
    }

    public final PointF getCenter() {
        return this.f11773j;
    }

    public final int getColor() {
        return this.f11768e.getColor();
    }

    public final double getPrecision() {
        return this.f11770g.mo11497b();
    }

    public final PrecisionCalculator getPrecisionCalculator() {
        return this.f11772i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        PointF pointF = this.f11773j;
        if (pointF != null) {
            float f = this.f11771h;
            if (f >= 1.0f) {
                float f2 = pointF.x;
                float f3 = (float) 0;
                if (f2 + f >= f3 && pointF.y + f >= f3 && f2 - f <= ((float) getWidth()) && pointF.y - this.f11771h <= ((float) getHeight())) {
                    canvas.drawCircle(pointF.x, pointF.y, this.f11771h, this.f11768e);
                }
            }
        }
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        this.f11770g.mo11496a(z && this.f11773j != null);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public final void setCenter(PointF pointF) {
        this.f11773j = pointF;
        C4371b bVar = this.f11770g;
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11769f;
        boolean z = false;
        if ((viewVisibilityAggregatedHelper != null ? viewVisibilityAggregatedHelper.mo6426a() : false) && pointF != null) {
            z = true;
        }
        bVar.mo11496a(z);
        invalidate();
    }

    public final void setColor(int i) {
        this.f11768e.setColor(i);
        invalidate();
    }

    public final void setPrecision(double d) {
        this.f11770g.mo11495a(d);
    }

    public final void setPrecisionCalculator(PrecisionCalculator precisionCalculator) {
        C12932j.m33818b(precisionCalculator, "<set-?>");
        this.f11772i = precisionCalculator;
    }
}
