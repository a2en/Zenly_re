package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseKeyframeAnimation<K, A> {

    /* renamed from: a */
    final List<AnimationListener> f21708a = new ArrayList(1);

    /* renamed from: b */
    private boolean f21709b = false;

    /* renamed from: c */
    private final List<? extends C8659a<K>> f21710c;

    /* renamed from: d */
    private float f21711d = 0.0f;

    /* renamed from: e */
    protected C8661c<A> f21712e;

    /* renamed from: f */
    private C8659a<K> f21713f;

    /* renamed from: g */
    private C8659a<K> f21714g;

    /* renamed from: h */
    private float f21715h = -1.0f;

    /* renamed from: i */
    private A f21716i = null;

    /* renamed from: j */
    private float f21717j = -1.0f;

    /* renamed from: k */
    private float f21718k = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    BaseKeyframeAnimation(List<? extends C8659a<K>> list) {
        this.f21710c = list;
    }

    /* renamed from: i */
    private float mo22907i() {
        if (this.f21717j == -1.0f) {
            this.f21717j = this.f21710c.isEmpty() ? 0.0f : ((C8659a) this.f21710c.get(0)).mo23292d();
        }
        return this.f21717j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract A mo22895a(C8659a<K> aVar, float f);

    /* renamed from: a */
    public void mo22897a(AnimationListener animationListener) {
        this.f21708a.add(animationListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo22899b() {
        float f;
        if (this.f21718k == -1.0f) {
            if (this.f21710c.isEmpty()) {
                f = 1.0f;
            } else {
                List<? extends C8659a<K>> list = this.f21710c;
                f = ((C8659a) list.get(list.size() - 1)).mo23288a();
            }
            this.f21718k = f;
        }
        return this.f21718k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo22900c() {
        C8659a a = mo22894a();
        if (a.mo23295g()) {
            return 0.0f;
        }
        return a.f22238d.getInterpolation(mo22901d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo22901d() {
        if (this.f21709b) {
            return 0.0f;
        }
        C8659a a = mo22894a();
        if (a.mo23295g()) {
            return 0.0f;
        }
        return (this.f21711d - a.mo23292d()) / (a.mo23288a() - a.mo23292d());
    }

    /* renamed from: e */
    public float mo22902e() {
        return this.f21711d;
    }

    /* renamed from: f */
    public A mo22903f() {
        C8659a<K> a = mo22894a();
        float c = mo22900c();
        if (this.f21712e == null && a == this.f21714g && this.f21715h == c) {
            return this.f21716i;
        }
        this.f21714g = a;
        this.f21715h = c;
        A a2 = mo22895a(a, c);
        this.f21716i = a2;
        return a2;
    }

    /* renamed from: g */
    public void mo22904g() {
        for (int i = 0; i < this.f21708a.size(); i++) {
            ((AnimationListener) this.f21708a.get(i)).onValueChanged();
        }
    }

    /* renamed from: h */
    public void mo22905h() {
        this.f21709b = true;
    }

    /* renamed from: a */
    public void mo22896a(float f) {
        if (!this.f21710c.isEmpty()) {
            C8659a a = mo22894a();
            if (f < mo22907i()) {
                f = mo22907i();
            } else if (f > mo22899b()) {
                f = mo22899b();
            }
            if (f != this.f21711d) {
                this.f21711d = f;
                C8659a a2 = mo22894a();
                if (a != a2 || !a2.mo23295g()) {
                    mo22904g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8659a<K> mo22894a() {
        String str = "BaseKeyframeAnimation#getCurrentKeyframe";
        C8505b.m19651a(str);
        C8659a<K> aVar = this.f21713f;
        if (aVar == null || !aVar.mo23289a(this.f21711d)) {
            List<? extends C8659a<K>> list = this.f21710c;
            C8659a<K> aVar2 = (C8659a) list.get(list.size() - 1);
            if (this.f21711d < aVar2.mo23292d()) {
                for (int size = this.f21710c.size() - 1; size >= 0; size--) {
                    aVar2 = (C8659a) this.f21710c.get(size);
                    if (aVar2.mo23289a(this.f21711d)) {
                        break;
                    }
                }
            }
            this.f21713f = aVar2;
            C8505b.m19652b(str);
            return aVar2;
        }
        C8505b.m19652b(str);
        return this.f21713f;
    }

    /* renamed from: a */
    public void mo22898a(C8661c<A> cVar) {
        C8661c<A> cVar2 = this.f21712e;
        if (cVar2 != null) {
            cVar2.mo23300a(null);
        }
        this.f21712e = cVar;
        if (cVar != null) {
            cVar.mo23300a(this);
        }
    }
}
