package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8558a;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.d */
public class C8475d implements C8482j, AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    private final Path f21600a = new Path();

    /* renamed from: b */
    private final String f21601b;

    /* renamed from: c */
    private final C8515e f21602c;

    /* renamed from: d */
    private final BaseKeyframeAnimation<?, PointF> f21603d;

    /* renamed from: e */
    private final BaseKeyframeAnimation<?, PointF> f21604e;

    /* renamed from: f */
    private final C8558a f21605f;

    /* renamed from: g */
    private C8473b f21606g = new C8473b();

    /* renamed from: h */
    private boolean f21607h;

    public C8475d(C8515e eVar, C8586a aVar, C8558a aVar2) {
        this.f21601b = aVar2.mo23064a();
        this.f21602c = eVar;
        this.f21603d = aVar2.mo23066c().createAnimation();
        this.f21604e = aVar2.mo23065b().createAnimation();
        this.f21605f = aVar2;
        aVar.mo23182a(this.f21603d);
        aVar.mo23182a(this.f21604e);
        this.f21603d.mo22897a((AnimationListener) this);
        this.f21604e.mo22897a((AnimationListener) this);
    }

    /* renamed from: b */
    private void m19558b() {
        this.f21607h = false;
        this.f21602c.invalidateSelf();
    }

    /* renamed from: a */
    public Path mo22884a() {
        if (this.f21607h) {
            return this.f21600a;
        }
        this.f21600a.reset();
        if (this.f21605f.mo23067d()) {
            this.f21607h = true;
            return this.f21600a;
        }
        PointF pointF = (PointF) this.f21603d.mo22903f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f21600a.reset();
        if (this.f21605f.mo23068e()) {
            float f5 = -f2;
            this.f21600a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f21600a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f21600a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f21600a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f21600a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f21600a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f21600a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f21600a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f21600a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f21600a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f21604e.mo22903f();
        this.f21600a.offset(pointF2.x, pointF2.y);
        this.f21600a.close();
        this.f21606g.mo22882a(this.f21600a);
        this.f21607h = true;
        return this.f21600a;
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21549g) {
            this.f21603d.mo22898a(cVar);
        } else if (t == LottieProperty.f21552j) {
            this.f21604e.mo22898a(cVar);
        }
    }

    public String getName() {
        return this.f21601b;
    }

    public void onValueChanged() {
        m19558b();
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
                    this.f21606g.mo22883a(pVar);
                    pVar.mo22888a(this);
                }
            }
        }
    }
}
