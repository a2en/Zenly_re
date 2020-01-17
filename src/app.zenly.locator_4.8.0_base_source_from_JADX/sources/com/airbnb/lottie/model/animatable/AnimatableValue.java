package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

public interface AnimatableValue<K, A> {
    BaseKeyframeAnimation<K, A> createAnimation();

    List<C8659a<K>> getKeyframes();

    boolean isStatic();
}
