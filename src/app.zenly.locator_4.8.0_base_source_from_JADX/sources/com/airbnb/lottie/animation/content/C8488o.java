package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8490a;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.content.C8575o;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.value.C8661c;

/* renamed from: com.airbnb.lottie.animation.content.o */
public class C8488o extends C8470a {

    /* renamed from: o */
    private final C8586a f21696o;

    /* renamed from: p */
    private final String f21697p;

    /* renamed from: q */
    private final boolean f21698q;

    /* renamed from: r */
    private final BaseKeyframeAnimation<Integer, Integer> f21699r;

    /* renamed from: s */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f21700s;

    public C8488o(C8515e eVar, C8586a aVar, C8575o oVar) {
        super(eVar, aVar, oVar.mo23142a().mo23152a(), oVar.mo23145d().mo23153a(), oVar.mo23147f(), oVar.mo23149h(), oVar.mo23150i(), oVar.mo23146e(), oVar.mo23144c());
        this.f21696o = aVar;
        this.f21697p = oVar.mo23148g();
        this.f21698q = oVar.mo23151j();
        this.f21699r = oVar.mo23143b().createAnimation();
        this.f21699r.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21699r);
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        super.addValueCallback(t, cVar);
        if (t == LottieProperty.f21544b) {
            this.f21699r.mo22898a(cVar);
        } else if (t != LottieProperty.f21541B) {
        } else {
            if (cVar == null) {
                this.f21700s = null;
                return;
            }
            this.f21700s = new C8504o(cVar);
            this.f21700s.mo22897a((AnimationListener) this);
            this.f21696o.mo23182a(this.f21699r);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (!this.f21698q) {
            this.f21580i.setColor(((C8490a) this.f21699r).mo22907i());
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f21700s;
            if (baseKeyframeAnimation != null) {
                this.f21580i.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
            }
            super.draw(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f21697p;
    }
}
