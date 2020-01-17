package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.content.C8559b;
import com.airbnb.lottie.model.content.C8561d;
import com.airbnb.lottie.model.content.C8562e;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.value.C8661c;
import p214e.p228e.C7576d;

/* renamed from: com.airbnb.lottie.animation.content.g */
public class C8478g extends C8470a {

    /* renamed from: o */
    private final String f21636o;

    /* renamed from: p */
    private final boolean f21637p;

    /* renamed from: q */
    private final C7576d<LinearGradient> f21638q = new C7576d<>();

    /* renamed from: r */
    private final C7576d<RadialGradient> f21639r = new C7576d<>();

    /* renamed from: s */
    private final RectF f21640s = new RectF();

    /* renamed from: t */
    private final C8562e f21641t;

    /* renamed from: u */
    private final int f21642u;

    /* renamed from: v */
    private final BaseKeyframeAnimation<C8559b, C8559b> f21643v;

    /* renamed from: w */
    private final BaseKeyframeAnimation<PointF, PointF> f21644w;

    /* renamed from: x */
    private final BaseKeyframeAnimation<PointF, PointF> f21645x;

    /* renamed from: y */
    private C8504o f21646y;

    public C8478g(C8515e eVar, C8586a aVar, C8561d dVar) {
        super(eVar, aVar, dVar.mo23081a().mo23152a(), dVar.mo23086f().mo23153a(), dVar.mo23088h(), dVar.mo23090j(), dVar.mo23092l(), dVar.mo23087g(), dVar.mo23082b());
        this.f21636o = dVar.mo23089i();
        this.f21641t = dVar.mo23085e();
        this.f21637p = dVar.mo23093m();
        this.f21642u = (int) (eVar.mo22984e().mo22933c() / 32.0f);
        this.f21643v = dVar.mo23084d().createAnimation();
        this.f21643v.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21643v);
        this.f21644w = dVar.mo23091k().createAnimation();
        this.f21644w.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21644w);
        this.f21645x = dVar.mo23083c().createAnimation();
        this.f21645x.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21645x);
    }

    /* renamed from: a */
    private int m19564a() {
        int round = Math.round(this.f21644w.mo22902e() * ((float) this.f21642u));
        int round2 = Math.round(this.f21645x.mo22902e() * ((float) this.f21642u));
        int round3 = Math.round(this.f21643v.mo22902e() * ((float) this.f21642u));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: b */
    private LinearGradient m19566b() {
        long a = (long) m19564a();
        LinearGradient linearGradient = (LinearGradient) this.f21638q.mo19513c(a);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f21644w.mo22903f();
        PointF pointF2 = (PointF) this.f21645x.mo22903f();
        C8559b bVar = (C8559b) this.f21643v.mo22903f();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m19565a(bVar.mo23070a()), bVar.mo23071b(), TileMode.CLAMP);
        this.f21638q.mo19514c(a, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: c */
    private RadialGradient m19567c() {
        long a = (long) m19564a();
        RadialGradient radialGradient = (RadialGradient) this.f21639r.mo19513c(a);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f21644w.mo22903f();
        PointF pointF2 = (PointF) this.f21645x.mo22903f();
        C8559b bVar = (C8559b) this.f21643v.mo22903f();
        int[] a2 = m19565a(bVar.mo23070a());
        float[] b = bVar.mo23071b();
        float f = pointF.x;
        float f2 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2)), a2, b, TileMode.CLAMP);
        this.f21639r.mo19514c(a, radialGradient2);
        return radialGradient2;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t != LottieProperty.f21542C) {
            return;
        }
        if (cVar == null) {
            C8504o oVar = this.f21646y;
            if (oVar != null) {
                this.f21577f.mo23185b((BaseKeyframeAnimation<?, ?>) oVar);
            }
            this.f21646y = null;
            return;
        }
        this.f21646y = new C8504o(cVar);
        this.f21646y.mo22897a((AnimationListener) this);
        this.f21577f.mo23182a((BaseKeyframeAnimation<?, ?>) this.f21646y);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f21637p) {
            getBounds(this.f21640s, matrix, false);
            if (this.f21641t == C8562e.LINEAR) {
                shader = m19566b();
            } else {
                shader = m19567c();
            }
            shader.setLocalMatrix(matrix);
            this.f21580i.setShader(shader);
            super.draw(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f21636o;
    }

    /* renamed from: a */
    private int[] m19565a(int[] iArr) {
        C8504o oVar = this.f21646y;
        if (oVar != null) {
            Integer[] numArr = (Integer[]) oVar.mo22903f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }
}
