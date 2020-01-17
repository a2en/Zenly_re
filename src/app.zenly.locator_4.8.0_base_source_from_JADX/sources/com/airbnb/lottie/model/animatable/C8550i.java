package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8501l;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.i */
public class C8550i implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    private final C8543b f21854a;

    /* renamed from: b */
    private final C8543b f21855b;

    public C8550i(C8543b bVar, C8543b bVar2) {
        this.f21854a = bVar;
        this.f21855b = bVar2;
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new C8501l(this.f21854a.createAnimation(), this.f21855b.createAnimation());
    }

    public List<C8659a<PointF>> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean isStatic() {
        return this.f21854a.isStatic() && this.f21855b.isStatic();
    }
}
