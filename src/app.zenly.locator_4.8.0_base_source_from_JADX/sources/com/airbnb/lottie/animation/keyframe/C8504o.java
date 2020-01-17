package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8660b;
import com.airbnb.lottie.value.C8661c;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.o */
public class C8504o<K, A> extends BaseKeyframeAnimation<K, A> {

    /* renamed from: l */
    private final A f21750l;

    public C8504o(C8661c<A> cVar) {
        this(cVar, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public A mo22895a(C8659a<K> aVar, float f) {
        return mo22903f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo22899b() {
        return 1.0f;
    }

    /* renamed from: f */
    public A mo22903f() {
        C8661c<A> cVar = this.f21712e;
        A a = this.f21750l;
        return cVar.mo23298a(0.0f, 0.0f, a, a, mo22902e(), mo22902e(), mo22902e());
    }

    /* renamed from: g */
    public void mo22904g() {
        if (this.f21712e != null) {
            super.mo22904g();
        }
    }

    public C8504o(C8661c<A> cVar, A a) {
        super(Collections.emptyList());
        new C8660b();
        mo22898a(cVar);
        this.f21750l = a;
    }
}
