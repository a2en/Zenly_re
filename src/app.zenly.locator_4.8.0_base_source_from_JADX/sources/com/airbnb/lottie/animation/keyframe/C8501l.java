package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.value.C8659a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.l */
public class C8501l extends BaseKeyframeAnimation<PointF, PointF> {

    /* renamed from: l */
    private final PointF f21733l = new PointF();

    /* renamed from: m */
    private final BaseKeyframeAnimation<Float, Float> f21734m;

    /* renamed from: n */
    private final BaseKeyframeAnimation<Float, Float> f21735n;

    public C8501l(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f21734m = baseKeyframeAnimation;
        this.f21735n = baseKeyframeAnimation2;
        mo22896a(mo22902e());
    }

    /* renamed from: a */
    public void mo22896a(float f) {
        this.f21734m.mo22896a(f);
        this.f21735n.mo22896a(f);
        this.f21733l.set(((Float) this.f21734m.mo22903f()).floatValue(), ((Float) this.f21735n.mo22903f()).floatValue());
        for (int i = 0; i < this.f21708a.size(); i++) {
            ((AnimationListener) this.f21708a.get(i)).onValueChanged();
        }
    }

    /* renamed from: f */
    public PointF m19634f() {
        return m19631a(null, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PointF m19631a(C8659a<PointF> aVar, float f) {
        return this.f21733l;
    }
}
