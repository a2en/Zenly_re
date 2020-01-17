package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8497h;
import com.airbnb.lottie.animation.keyframe.C8498i;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.e */
public class C8546e implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    private final List<C8659a<PointF>> f21853a;

    public C8546e(List<C8659a<PointF>> list) {
        this.f21853a = list;
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        if (((C8659a) this.f21853a.get(0)).mo23295g()) {
            return new C8498i(this.f21853a);
        }
        return new C8497h(this.f21853a);
    }

    public List<C8659a<PointF>> getKeyframes() {
        return this.f21853a;
    }

    public boolean isStatic() {
        return this.f21853a.size() == 1 && ((C8659a) this.f21853a.get(0)).mo23295g();
    }
}
