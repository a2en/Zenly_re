package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C0607i;
import p214e.p244l.p245a.p246a.C7643b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public class C1173b extends Drawable implements Animatable {

    /* renamed from: k */
    private static final Interpolator f4455k = new LinearInterpolator();

    /* renamed from: l */
    private static final Interpolator f4456l = new C7643b();

    /* renamed from: m */
    private static final int[] f4457m = {-16777216};

    /* renamed from: e */
    private final C1176c f4458e = new C1176c();

    /* renamed from: f */
    private float f4459f;

    /* renamed from: g */
    private Resources f4460g;

    /* renamed from: h */
    private Animator f4461h;

    /* renamed from: i */
    float f4462i;

    /* renamed from: j */
    boolean f4463j;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    class C1174a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1176c f4464a;

        C1174a(C1176c cVar) {
            this.f4464a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1173b.this.mo5893a(floatValue, this.f4464a);
            C1173b.this.mo5894a(floatValue, this.f4464a, false);
            C1173b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    class C1175b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1176c f4466a;

        C1175b(C1176c cVar) {
            this.f4466a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1173b.this.mo5894a(1.0f, this.f4466a, true);
            this.f4466a.mo5939l();
            this.f4466a.mo5937j();
            C1173b bVar = C1173b.this;
            if (bVar.f4463j) {
                bVar.f4463j = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f4466a.mo5920a(false);
                return;
            }
            bVar.f4462i += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1173b.this.f4462i = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    private static class C1176c {

        /* renamed from: a */
        final RectF f4468a = new RectF();

        /* renamed from: b */
        final Paint f4469b = new Paint();

        /* renamed from: c */
        final Paint f4470c = new Paint();

        /* renamed from: d */
        final Paint f4471d = new Paint();

        /* renamed from: e */
        float f4472e = 0.0f;

        /* renamed from: f */
        float f4473f = 0.0f;

        /* renamed from: g */
        float f4474g = 0.0f;

        /* renamed from: h */
        float f4475h = 5.0f;

        /* renamed from: i */
        int[] f4476i;

        /* renamed from: j */
        int f4477j;

        /* renamed from: k */
        float f4478k;

        /* renamed from: l */
        float f4479l;

        /* renamed from: m */
        float f4480m;

        /* renamed from: n */
        boolean f4481n;

        /* renamed from: o */
        Path f4482o;

        /* renamed from: p */
        float f4483p = 1.0f;

        /* renamed from: q */
        float f4484q;

        /* renamed from: r */
        int f4485r;

        /* renamed from: s */
        int f4486s;

        /* renamed from: t */
        int f4487t = 255;

        /* renamed from: u */
        int f4488u;

        C1176c() {
            this.f4469b.setStrokeCap(Cap.SQUARE);
            this.f4469b.setAntiAlias(true);
            this.f4469b.setStyle(Style.STROKE);
            this.f4470c.setStyle(Style.FILL);
            this.f4470c.setAntiAlias(true);
            this.f4471d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5915a(float f, float f2) {
            this.f4485r = (int) f;
            this.f4486s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5924b(int i) {
            this.f4488u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5927c(int i) {
            this.f4477j = i;
            this.f4488u = this.f4476i[this.f4477j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo5928d() {
            return (this.f4477j + 1) % this.f4476i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5931e(float f) {
            this.f4472e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo5933f(float f) {
            this.f4475h = f;
            this.f4469b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo5934g() {
            return this.f4479l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public float mo5935h() {
            return this.f4480m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo5936i() {
            return this.f4478k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5937j() {
            mo5927c(mo5928d());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo5938k() {
            this.f4478k = 0.0f;
            this.f4479l = 0.0f;
            this.f4480m = 0.0f;
            mo5931e(0.0f);
            mo5926c(0.0f);
            mo5929d(0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo5939l() {
            this.f4478k = this.f4472e;
            this.f4479l = this.f4473f;
            this.f4480m = this.f4474g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo5922b() {
            return this.f4473f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5929d(float f) {
            this.f4474g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo5930e() {
            return this.f4472e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5918a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4468a;
            float f = this.f4484q;
            float f2 = (this.f4475h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f4485r) * this.f4483p) / 2.0f, this.f4475h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f4472e;
            float f4 = this.f4474g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f4473f + f4) * 360.0f) - f5;
            this.f4469b.setColor(this.f4488u);
            this.f4469b.setAlpha(this.f4487t);
            float f7 = this.f4475h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4471d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f4469b);
            mo5917a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5923b(float f) {
            this.f4484q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo5925c() {
            return this.f4476i[mo5928d()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo5932f() {
            return this.f4476i[this.f4477j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5926c(float f) {
            this.f4473f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5917a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f4481n) {
                Path path = this.f4482o;
                if (path == null) {
                    this.f4482o = new Path();
                    this.f4482o.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f4485r) * this.f4483p) / 2.0f;
                this.f4482o.moveTo(0.0f, 0.0f);
                this.f4482o.lineTo(((float) this.f4485r) * this.f4483p, 0.0f);
                Path path2 = this.f4482o;
                float f4 = (float) this.f4485r;
                float f5 = this.f4483p;
                path2.lineTo((f4 * f5) / 2.0f, ((float) this.f4486s) * f5);
                this.f4482o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f4475h / 2.0f));
                this.f4482o.close();
                this.f4470c.setColor(this.f4488u);
                this.f4470c.setAlpha(this.f4487t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4482o, this.f4470c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5921a(int[] iArr) {
            this.f4476i = iArr;
            mo5927c(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5919a(ColorFilter colorFilter) {
            this.f4469b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5916a(int i) {
            this.f4487t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5913a() {
            return this.f4487t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5920a(boolean z) {
            if (this.f4481n != z) {
                this.f4481n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5914a(float f) {
            if (f != this.f4483p) {
                this.f4483p = f;
            }
        }
    }

    public C1173b(Context context) {
        C0607i.m2773a(context);
        this.f4460g = context.getResources();
        this.f4458e.mo5921a(f4457m);
        mo5899c(2.5f);
        m5711a();
    }

    /* renamed from: a */
    private int m5710a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m5712a(float f, float f2, float f3, float f4) {
        C1176c cVar = this.f4458e;
        float f5 = this.f4460g.getDisplayMetrics().density;
        cVar.mo5933f(f2 * f5);
        cVar.mo5923b(f * f5);
        cVar.mo5927c(0);
        cVar.mo5915a(f3 * f5, f4 * f5);
    }

    /* renamed from: d */
    private void m5714d(float f) {
        this.f4459f = f;
    }

    /* renamed from: b */
    public void mo5898b(float f) {
        this.f4458e.mo5929d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo5899c(float f) {
        this.f4458e.mo5933f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4459f, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4458e.mo5918a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f4458e.mo5913a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f4461h.isRunning();
    }

    public void setAlpha(int i) {
        this.f4458e.mo5916a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4458e.mo5919a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f4461h.cancel();
        this.f4458e.mo5939l();
        if (this.f4458e.mo5922b() != this.f4458e.mo5930e()) {
            this.f4463j = true;
            this.f4461h.setDuration(666);
            this.f4461h.start();
            return;
        }
        this.f4458e.mo5927c(0);
        this.f4458e.mo5938k();
        this.f4461h.setDuration(1332);
        this.f4461h.start();
    }

    public void stop() {
        this.f4461h.cancel();
        m5714d(0.0f);
        this.f4458e.mo5920a(false);
        this.f4458e.mo5927c(0);
        this.f4458e.mo5938k();
        invalidateSelf();
    }

    /* renamed from: b */
    private void m5713b(float f, C1176c cVar) {
        mo5893a(f, cVar);
        float floor = (float) (Math.floor((double) (cVar.mo5935h() / 0.8f)) + 1.0d);
        cVar.mo5931e(cVar.mo5936i() + (((cVar.mo5934g() - 0.01f) - cVar.mo5936i()) * f));
        cVar.mo5926c(cVar.mo5934g());
        cVar.mo5929d(cVar.mo5935h() + ((floor - cVar.mo5935h()) * f));
    }

    /* renamed from: a */
    public void mo5895a(int i) {
        if (i == 0) {
            m5712a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5712a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5896a(boolean z) {
        this.f4458e.mo5920a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5891a(float f) {
        this.f4458e.mo5914a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5892a(float f, float f2) {
        this.f4458e.mo5931e(f);
        this.f4458e.mo5926c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5897a(int... iArr) {
        this.f4458e.mo5921a(iArr);
        this.f4458e.mo5927c(0);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5893a(float f, C1176c cVar) {
        if (f > 0.75f) {
            cVar.mo5924b(m5710a((f - 0.75f) / 0.25f, cVar.mo5932f(), cVar.mo5925c()));
        } else {
            cVar.mo5924b(cVar.mo5932f());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5894a(float f, C1176c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f4463j) {
            m5713b(f, cVar);
        } else if (f != 1.0f || z) {
            float h = cVar.mo5935h();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float i = cVar.mo5936i();
                float f5 = i;
                f2 = (f4456l.getInterpolation(f4) * 0.79f) + 0.01f + i;
                f3 = f5;
            } else {
                f2 = cVar.mo5936i() + 0.79f;
                f3 = f2 - (((1.0f - f4456l.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f6 = h + (0.20999998f * f);
            float f7 = (f + this.f4462i) * 216.0f;
            cVar.mo5931e(f3);
            cVar.mo5926c(f2);
            cVar.mo5929d(f6);
            m5714d(f7);
        }
    }

    /* renamed from: a */
    private void m5711a() {
        C1176c cVar = this.f4458e;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1174a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4455k);
        ofFloat.addListener(new C1175b(cVar));
        this.f4461h = ofFloat;
    }
}
