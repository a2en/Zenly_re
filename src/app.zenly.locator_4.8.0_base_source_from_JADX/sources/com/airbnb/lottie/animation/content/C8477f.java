package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8559b;
import com.airbnb.lottie.model.content.C8560c;
import com.airbnb.lottie.model.content.C8562e;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7576d;

/* renamed from: com.airbnb.lottie.animation.content.f */
public class C8477f implements DrawingContent, AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    private final String f21618a;

    /* renamed from: b */
    private final boolean f21619b;

    /* renamed from: c */
    private final C8586a f21620c;

    /* renamed from: d */
    private final C7576d<LinearGradient> f21621d = new C7576d<>();

    /* renamed from: e */
    private final C7576d<RadialGradient> f21622e = new C7576d<>();

    /* renamed from: f */
    private final Path f21623f = new Path();

    /* renamed from: g */
    private final Paint f21624g = new C8540a(1);

    /* renamed from: h */
    private final RectF f21625h = new RectF();

    /* renamed from: i */
    private final List<C8482j> f21626i = new ArrayList();

    /* renamed from: j */
    private final C8562e f21627j;

    /* renamed from: k */
    private final BaseKeyframeAnimation<C8559b, C8559b> f21628k;

    /* renamed from: l */
    private final BaseKeyframeAnimation<Integer, Integer> f21629l;

    /* renamed from: m */
    private final BaseKeyframeAnimation<PointF, PointF> f21630m;

    /* renamed from: n */
    private final BaseKeyframeAnimation<PointF, PointF> f21631n;

    /* renamed from: o */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f21632o;

    /* renamed from: p */
    private C8504o f21633p;

    /* renamed from: q */
    private final C8515e f21634q;

    /* renamed from: r */
    private final int f21635r;

    public C8477f(C8515e eVar, C8586a aVar, C8560c cVar) {
        this.f21620c = aVar;
        this.f21618a = cVar.mo23077e();
        this.f21619b = cVar.mo23080h();
        this.f21634q = eVar;
        this.f21627j = cVar.mo23076d();
        this.f21623f.setFillType(cVar.mo23074b());
        this.f21635r = (int) (eVar.mo22984e().mo22933c() / 32.0f);
        this.f21628k = cVar.mo23075c().createAnimation();
        this.f21628k.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21628k);
        this.f21629l = cVar.mo23078f().createAnimation();
        this.f21629l.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21629l);
        this.f21630m = cVar.mo23079g().createAnimation();
        this.f21630m.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21630m);
        this.f21631n = cVar.mo23073a().createAnimation();
        this.f21631n.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21631n);
    }

    /* renamed from: a */
    private int m19560a() {
        int round = Math.round(this.f21630m.mo22902e() * ((float) this.f21635r));
        int round2 = Math.round(this.f21631n.mo22902e() * ((float) this.f21635r));
        int round3 = Math.round(this.f21628k.mo22902e() * ((float) this.f21635r));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: b */
    private LinearGradient m19562b() {
        long a = (long) m19560a();
        LinearGradient linearGradient = (LinearGradient) this.f21621d.mo19513c(a);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f21630m.mo22903f();
        PointF pointF2 = (PointF) this.f21631n.mo22903f();
        C8559b bVar = (C8559b) this.f21628k.mo22903f();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m19561a(bVar.mo23070a()), bVar.mo23071b(), TileMode.CLAMP);
        this.f21621d.mo19514c(a, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: c */
    private RadialGradient m19563c() {
        long a = (long) m19560a();
        RadialGradient radialGradient = (RadialGradient) this.f21622e.mo19513c(a);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f21630m.mo22903f();
        PointF pointF2 = (PointF) this.f21631n.mo22903f();
        C8559b bVar = (C8559b) this.f21628k.mo22903f();
        int[] a2 = m19561a(bVar.mo23070a());
        float[] b = bVar.mo23071b();
        float f = pointF.x;
        float f2 = pointF.y;
        float hypot = (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2));
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, a2, b, TileMode.CLAMP);
        this.f21622e.mo19514c(a, radialGradient2);
        return radialGradient2;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21546d) {
            this.f21629l.mo22898a(cVar);
        } else if (t == LottieProperty.f21541B) {
            if (cVar == null) {
                this.f21632o = null;
                return;
            }
            this.f21632o = new C8504o(cVar);
            this.f21632o.mo22897a((AnimationListener) this);
            this.f21620c.mo23182a(this.f21632o);
        } else if (t != LottieProperty.f21542C) {
        } else {
            if (cVar == null) {
                C8504o oVar = this.f21633p;
                if (oVar != null) {
                    this.f21620c.mo23185b((BaseKeyframeAnimation<?, ?>) oVar);
                }
                this.f21633p = null;
                return;
            }
            this.f21633p = new C8504o(cVar);
            this.f21633p.mo22897a((AnimationListener) this);
            this.f21620c.mo23182a((BaseKeyframeAnimation<?, ?>) this.f21633p);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f21619b) {
            String str = "GradientFillContent#draw";
            C8505b.m19651a(str);
            this.f21623f.reset();
            for (int i2 = 0; i2 < this.f21626i.size(); i2++) {
                this.f21623f.addPath(((C8482j) this.f21626i.get(i2)).mo22884a(), matrix);
            }
            this.f21623f.computeBounds(this.f21625h, false);
            if (this.f21627j == C8562e.LINEAR) {
                shader = m19562b();
            } else {
                shader = m19563c();
            }
            shader.setLocalMatrix(matrix);
            this.f21624g.setShader(shader);
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f21632o;
            if (baseKeyframeAnimation != null) {
                this.f21624g.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
            }
            this.f21624g.setAlpha(C8657g.m20185a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f21629l.mo22903f()).intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f21623f, this.f21624g);
            C8505b.m19652b(str);
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f21623f.reset();
        for (int i = 0; i < this.f21626i.size(); i++) {
            this.f21623f.addPath(((C8482j) this.f21626i.get(i)).mo22884a(), matrix);
        }
        this.f21623f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.f21618a;
    }

    public void onValueChanged() {
        this.f21634q.invalidateSelf();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        C8657g.m20188a(eVar, i, list, eVar2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = (Content) list2.get(i);
            if (content instanceof C8482j) {
                this.f21626i.add((C8482j) content);
            }
        }
    }

    /* renamed from: a */
    private int[] m19561a(int[] iArr) {
        C8504o oVar = this.f21633p;
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
