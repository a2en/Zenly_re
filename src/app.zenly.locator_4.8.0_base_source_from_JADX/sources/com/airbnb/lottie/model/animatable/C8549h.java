package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C8500k;
import com.airbnb.lottie.model.content.C8571k;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.h */
public class C8549h extends C8554m<C8571k, Path> {
    public C8549h(List<C8659a<C8571k>> list) {
        super(list);
    }

    public BaseKeyframeAnimation<C8571k, Path> createAnimation() {
        return new C8500k(this.f21869a);
    }
}
