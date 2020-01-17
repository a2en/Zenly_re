package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.C8659a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.m */
abstract class C8554m<V, O> implements AnimatableValue<V, O> {

    /* renamed from: a */
    final List<C8659a<V>> f21869a;

    C8554m(V v) {
        this(Collections.singletonList(new C8659a(v)));
    }

    public List<C8659a<V>> getKeyframes() {
        return this.f21869a;
    }

    public boolean isStatic() {
        return this.f21869a.isEmpty() || (this.f21869a.size() == 1 && ((C8659a) this.f21869a.get(0)).mo23295g());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f21869a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f21869a.toArray()));
        }
        return sb.toString();
    }

    C8554m(List<C8659a<V>> list) {
        this.f21869a = list;
    }
}
