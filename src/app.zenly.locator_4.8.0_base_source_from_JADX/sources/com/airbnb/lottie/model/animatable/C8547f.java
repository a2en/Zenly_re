package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8498i;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.f */
public class C8547f extends C8554m<PointF, PointF> {
    public C8547f(List<C8659a<PointF>> list) {
        super(list);
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new C8498i(this.f21869a);
    }
}
