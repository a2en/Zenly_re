package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8567h;
import com.airbnb.lottie.model.content.C8567h.C8568a;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.k */
public class C8483k implements C8482j, AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    private final Path f21654a = new Path();

    /* renamed from: b */
    private final String f21655b;

    /* renamed from: c */
    private final C8515e f21656c;

    /* renamed from: d */
    private final C8568a f21657d;

    /* renamed from: e */
    private final boolean f21658e;

    /* renamed from: f */
    private final BaseKeyframeAnimation<?, Float> f21659f;

    /* renamed from: g */
    private final BaseKeyframeAnimation<?, PointF> f21660g;

    /* renamed from: h */
    private final BaseKeyframeAnimation<?, Float> f21661h;

    /* renamed from: i */
    private final BaseKeyframeAnimation<?, Float> f21662i;

    /* renamed from: j */
    private final BaseKeyframeAnimation<?, Float> f21663j;

    /* renamed from: k */
    private final BaseKeyframeAnimation<?, Float> f21664k;

    /* renamed from: l */
    private final BaseKeyframeAnimation<?, Float> f21665l;

    /* renamed from: m */
    private C8473b f21666m = new C8473b();

    /* renamed from: n */
    private boolean f21667n;

    /* renamed from: com.airbnb.lottie.animation.content.k$a */
    static /* synthetic */ class C8484a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21668a = new int[C8568a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.model.content.h$a[] r0 = com.airbnb.lottie.model.content.C8567h.C8568a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21668a = r0
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.h$a r1 = com.airbnb.lottie.model.content.C8567h.C8568a.STAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.h$a r1 = com.airbnb.lottie.model.content.C8567h.C8568a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.C8483k.C8484a.<clinit>():void");
        }
    }

    public C8483k(C8515e eVar, C8586a aVar, C8567h hVar) {
        this.f21656c = eVar;
        this.f21655b = hVar.mo23104c();
        this.f21657d = hVar.mo23110i();
        this.f21658e = hVar.mo23111j();
        this.f21659f = hVar.mo23107f().createAnimation();
        this.f21660g = hVar.mo23108g().createAnimation();
        this.f21661h = hVar.mo23109h().createAnimation();
        this.f21663j = hVar.mo23105d().createAnimation();
        this.f21665l = hVar.mo23106e().createAnimation();
        if (this.f21657d == C8568a.STAR) {
            this.f21662i = hVar.mo23102a().createAnimation();
            this.f21664k = hVar.mo23103b().createAnimation();
        } else {
            this.f21662i = null;
            this.f21664k = null;
        }
        aVar.mo23182a(this.f21659f);
        aVar.mo23182a(this.f21660g);
        aVar.mo23182a(this.f21661h);
        aVar.mo23182a(this.f21663j);
        aVar.mo23182a(this.f21665l);
        if (this.f21657d == C8568a.STAR) {
            aVar.mo23182a(this.f21662i);
            aVar.mo23182a(this.f21664k);
        }
        this.f21659f.mo22897a((AnimationListener) this);
        this.f21660g.mo22897a((AnimationListener) this);
        this.f21661h.mo22897a((AnimationListener) this);
        this.f21663j.mo22897a((AnimationListener) this);
        this.f21665l.mo22897a((AnimationListener) this);
        if (this.f21657d == C8568a.STAR) {
            this.f21662i.mo22897a((AnimationListener) this);
            this.f21664k.mo22897a((AnimationListener) this);
        }
    }

    /* renamed from: b */
    private void m19574b() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) ((Float) this.f21659f.mo22903f()).floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21661h;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : (double) ((Float) baseKeyframeAnimation.mo22903f()).floatValue()) - 90.0d);
        double d4 = (double) floor;
        float f = (float) (6.283185307179586d / d4);
        float floatValue = ((Float) this.f21665l.mo22903f()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.f21663j.mo22903f()).floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f21654a.moveTo(cos, sin);
        double d6 = (double) f;
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f2 = floatValue2 * floatValue * 0.25f;
                this.f21654a.cubicTo(cos - (((float) Math.cos(atan2)) * f2), sin - (((float) Math.sin(atan2)) * f2), cos2 + (((float) Math.cos(atan22)) * f2), sin2 + (f2 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f21654a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF pointF = (PointF) this.f21660g.mo22903f();
        this.f21654a.offset(pointF.x, pointF.y);
        this.f21654a.close();
    }

    /* renamed from: c */
    private void m19575c() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float floatValue = ((Float) this.f21659f.mo22903f()).floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21661h;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : (double) ((Float) baseKeyframeAnimation.mo22903f()).floatValue()) - 90.0d);
        double d3 = (double) floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((float) ((int) floatValue));
        int i2 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f15) * f14);
        }
        float floatValue2 = ((Float) this.f21663j.mo22903f()).floatValue();
        float floatValue3 = ((Float) this.f21662i.mo22903f()).floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f21664k;
        float floatValue4 = baseKeyframeAnimation2 != null ? ((Float) baseKeyframeAnimation2.mo22903f()).floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f21665l;
        float floatValue5 = baseKeyframeAnimation3 != null ? ((Float) baseKeyframeAnimation3.mo22903f()).floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f15) + floatValue3;
            i = i2;
            double d4 = (double) f;
            d = d3;
            f3 = (float) (d4 * Math.cos(radians));
            f2 = (float) (d4 * Math.sin(radians));
            this.f21654a.moveTo(f3, f2);
            d2 = radians + ((double) ((f13 * f15) / 2.0f));
        } else {
            d = d3;
            i = i2;
            double d5 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d5);
            float sin = (float) (d5 * Math.sin(radians));
            this.f21654a.moveTo(cos, sin);
            d2 = radians + ((double) f14);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        boolean z = false;
        double d6 = d2;
        float f16 = f14;
        int i3 = 0;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f17 = z ? floatValue2 : floatValue3;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f16;
                } else {
                    f4 = f16;
                    f16 = (f13 * f15) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f13;
                    f5 = floatValue3;
                    f8 = f17;
                    f7 = floatValue2;
                } else {
                    f6 = f13;
                    f7 = floatValue2;
                    f5 = floatValue3;
                    f8 = f;
                }
                double d8 = (double) f8;
                float f18 = f16;
                float cos2 = (float) (d8 * Math.cos(d6));
                float sin2 = (float) (d8 * Math.sin(d6));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f21654a.lineTo(cos2, sin2);
                    f12 = sin2;
                    f9 = floatValue4;
                    f10 = floatValue5;
                    f11 = f;
                } else {
                    f9 = floatValue4;
                    f10 = floatValue5;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f11 = f;
                    f12 = sin2;
                    float f19 = f3;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f20 = z ? f9 : f10;
                    float f21 = (z ? f5 : f7) * f20 * 0.47829f;
                    float f22 = cos3 * f21;
                    float f23 = f21 * sin3;
                    float f24 = (z ? f7 : f5) * (z ? f10 : f9) * 0.47829f;
                    float f25 = cos4 * f24;
                    float f26 = f24 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f22 *= f15;
                            f23 *= f15;
                        } else if (d7 == ceil - 1.0d) {
                            f25 *= f15;
                            f26 *= f15;
                        }
                    }
                    this.f21654a.cubicTo(f19 - f22, f2 - f23, cos2 + f25, f12 + f26, cos2, f12);
                }
                d6 += (double) f18;
                z = !z;
                i3++;
                f3 = cos2;
                f = f11;
                floatValue2 = f7;
                f13 = f6;
                f16 = f4;
                floatValue3 = f5;
                floatValue4 = f9;
                floatValue5 = f10;
                f2 = f12;
            } else {
                PointF pointF = (PointF) this.f21660g.mo22903f();
                this.f21654a.offset(pointF.x, pointF.y);
                this.f21654a.close();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m19576d() {
        this.f21667n = false;
        this.f21656c.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo22884a() {
        if (this.f21667n) {
            return this.f21654a;
        }
        this.f21654a.reset();
        if (this.f21658e) {
            this.f21667n = true;
            return this.f21654a;
        }
        int i = C8484a.f21668a[this.f21657d.ordinal()];
        if (i == 1) {
            m19575c();
        } else if (i == 2) {
            m19574b();
        }
        this.f21654a.close();
        this.f21666m.mo22882a(this.f21654a);
        this.f21667n = true;
        return this.f21654a;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21561s) {
            this.f21659f.mo22898a(cVar);
        } else if (t == LottieProperty.f21562t) {
            this.f21661h.mo22898a(cVar);
        } else if (t == LottieProperty.f21552j) {
            this.f21660g.mo22898a(cVar);
        } else {
            if (t == LottieProperty.f21563u) {
                BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21662i;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.mo22898a(cVar);
                    return;
                }
            }
            if (t == LottieProperty.f21564v) {
                this.f21663j.mo22898a(cVar);
                return;
            }
            if (t == LottieProperty.f21565w) {
                BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f21664k;
                if (baseKeyframeAnimation2 != null) {
                    baseKeyframeAnimation2.mo22898a(cVar);
                    return;
                }
            }
            if (t == LottieProperty.f21566x) {
                this.f21665l.mo22898a(cVar);
            }
        }
    }

    public String getName() {
        return this.f21655b;
    }

    public void onValueChanged() {
        m19576d();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        C8657g.m20188a(eVar, i, list, eVar2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = (Content) list.get(i);
            if (content instanceof C8489p) {
                C8489p pVar = (C8489p) content;
                if (pVar.mo22892e() == C8580a.SIMULTANEOUSLY) {
                    this.f21666m.mo22883a(pVar);
                    pVar.mo22888a(this);
                }
            }
        }
    }
}
