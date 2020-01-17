package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8491b;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8569i;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.l */
public class C8485l implements AnimationListener, KeyPathElementContent, C8482j {

    /* renamed from: a */
    private final Path f21669a = new Path();

    /* renamed from: b */
    private final RectF f21670b = new RectF();

    /* renamed from: c */
    private final String f21671c;

    /* renamed from: d */
    private final boolean f21672d;

    /* renamed from: e */
    private final C8515e f21673e;

    /* renamed from: f */
    private final BaseKeyframeAnimation<?, PointF> f21674f;

    /* renamed from: g */
    private final BaseKeyframeAnimation<?, PointF> f21675g;

    /* renamed from: h */
    private final BaseKeyframeAnimation<?, Float> f21676h;

    /* renamed from: i */
    private C8473b f21677i = new C8473b();

    /* renamed from: j */
    private boolean f21678j;

    public C8485l(C8515e eVar, C8586a aVar, C8569i iVar) {
        this.f21671c = iVar.mo23113b();
        this.f21672d = iVar.mo23116e();
        this.f21673e = eVar;
        this.f21674f = iVar.mo23114c().createAnimation();
        this.f21675g = iVar.mo23115d().createAnimation();
        this.f21676h = iVar.mo23112a().createAnimation();
        aVar.mo23182a(this.f21674f);
        aVar.mo23182a(this.f21675g);
        aVar.mo23182a(this.f21676h);
        this.f21674f.mo22897a((AnimationListener) this);
        this.f21675g.mo22897a((AnimationListener) this);
        this.f21676h.mo22897a((AnimationListener) this);
    }

    /* renamed from: b */
    private void m19578b() {
        this.f21678j = false;
        this.f21673e.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo22884a() {
        float f;
        if (this.f21678j) {
            return this.f21669a;
        }
        this.f21669a.reset();
        if (this.f21672d) {
            this.f21678j = true;
            return this.f21669a;
        }
        PointF pointF = (PointF) this.f21675g.mo22903f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21676h;
        if (baseKeyframeAnimation == null) {
            f = 0.0f;
        } else {
            f = ((C8491b) baseKeyframeAnimation).mo22907i();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.f21674f.mo22903f();
        this.f21669a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.f21669a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f21670b;
            float f4 = pointF2.x;
            float f5 = f * 2.0f;
            float f6 = (f4 + f2) - f5;
            float f7 = pointF2.y;
            rectF.set(f6, (f7 + f3) - f5, f4 + f2, f7 + f3);
            this.f21669a.arcTo(this.f21670b, 0.0f, 90.0f, false);
        }
        this.f21669a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f21670b;
            float f8 = pointF2.x;
            float f9 = f8 - f2;
            float f10 = pointF2.y;
            float f11 = f * 2.0f;
            rectF2.set(f9, (f10 + f3) - f11, (f8 - f2) + f11, f10 + f3);
            this.f21669a.arcTo(this.f21670b, 90.0f, 90.0f, false);
        }
        this.f21669a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f21670b;
            float f12 = pointF2.x;
            float f13 = f12 - f2;
            float f14 = pointF2.y;
            float f15 = f * 2.0f;
            rectF3.set(f13, f14 - f3, (f12 - f2) + f15, (f14 - f3) + f15);
            this.f21669a.arcTo(this.f21670b, 180.0f, 90.0f, false);
        }
        this.f21669a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f21670b;
            float f16 = pointF2.x;
            float f17 = f * 2.0f;
            float f18 = (f16 + f2) - f17;
            float f19 = pointF2.y;
            rectF4.set(f18, f19 - f3, f16 + f2, (f19 - f3) + f17);
            this.f21669a.arcTo(this.f21670b, 270.0f, 90.0f, false);
        }
        this.f21669a.close();
        this.f21677i.mo22882a(this.f21669a);
        this.f21678j = true;
        return this.f21669a;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21550h) {
            this.f21675g.mo22898a(cVar);
        } else if (t == LottieProperty.f21552j) {
            this.f21674f.mo22898a(cVar);
        } else if (t == LottieProperty.f21551i) {
            this.f21676h.mo22898a(cVar);
        }
    }

    public String getName() {
        return this.f21671c;
    }

    public void onValueChanged() {
        m19578b();
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
                    this.f21677i.mo22883a(pVar);
                    pVar.mo22888a(this);
                }
            }
        }
    }
}
