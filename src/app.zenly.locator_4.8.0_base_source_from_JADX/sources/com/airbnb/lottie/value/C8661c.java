package com.airbnb.lottie.value;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* renamed from: com.airbnb.lottie.value.c */
public class C8661c<T> {

    /* renamed from: a */
    private final C8660b<T> f22249a = new C8660b<>();

    /* renamed from: b */
    protected T f22250b = null;

    public C8661c(T t) {
        this.f22250b = t;
    }

    /* renamed from: a */
    public T mo23299a(C8660b<T> bVar) {
        return this.f22250b;
    }

    /* renamed from: a */
    public final void mo23300a(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
    }

    /* renamed from: a */
    public final T mo23298a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        C8660b<T> bVar = this.f22249a;
        bVar.mo23297a(f, f2, t, t2, f3, f4, f5);
        return mo23299a(bVar);
    }
}
