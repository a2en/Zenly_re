package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C8506c;

/* renamed from: com.airbnb.lottie.value.a */
public class C8659a<T> {

    /* renamed from: a */
    private final C8506c f22235a;

    /* renamed from: b */
    public final T f22236b;

    /* renamed from: c */
    public T f22237c;

    /* renamed from: d */
    public final Interpolator f22238d;

    /* renamed from: e */
    public final float f22239e;

    /* renamed from: f */
    public Float f22240f;

    /* renamed from: g */
    private float f22241g;

    /* renamed from: h */
    private float f22242h;

    /* renamed from: i */
    private int f22243i;

    /* renamed from: j */
    private int f22244j;

    /* renamed from: k */
    private float f22245k;

    /* renamed from: l */
    private float f22246l;

    /* renamed from: m */
    public PointF f22247m;

    /* renamed from: n */
    public PointF f22248n;

    public C8659a(C8506c cVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f22241g = -3987645.8f;
        this.f22242h = -3987645.8f;
        this.f22243i = 784923401;
        this.f22244j = 784923401;
        this.f22245k = Float.MIN_VALUE;
        this.f22246l = Float.MIN_VALUE;
        this.f22247m = null;
        this.f22248n = null;
        this.f22235a = cVar;
        this.f22236b = t;
        this.f22237c = t2;
        this.f22238d = interpolator;
        this.f22239e = f;
        this.f22240f = f2;
    }

    /* renamed from: a */
    public float mo23288a() {
        if (this.f22235a == null) {
            return 1.0f;
        }
        if (this.f22246l == Float.MIN_VALUE) {
            if (this.f22240f == null) {
                this.f22246l = 1.0f;
            } else {
                this.f22246l = mo23292d() + ((this.f22240f.floatValue() - this.f22239e) / this.f22235a.mo22935d());
            }
        }
        return this.f22246l;
    }

    /* renamed from: b */
    public float mo23290b() {
        if (this.f22242h == -3987645.8f) {
            this.f22242h = ((Float) this.f22237c).floatValue();
        }
        return this.f22242h;
    }

    /* renamed from: c */
    public int mo23291c() {
        if (this.f22244j == 784923401) {
            this.f22244j = ((Integer) this.f22237c).intValue();
        }
        return this.f22244j;
    }

    /* renamed from: d */
    public float mo23292d() {
        C8506c cVar = this.f22235a;
        if (cVar == null) {
            return 0.0f;
        }
        if (this.f22245k == Float.MIN_VALUE) {
            this.f22245k = (this.f22239e - cVar.mo22943l()) / this.f22235a.mo22935d();
        }
        return this.f22245k;
    }

    /* renamed from: e */
    public float mo23293e() {
        if (this.f22241g == -3987645.8f) {
            this.f22241g = ((Float) this.f22236b).floatValue();
        }
        return this.f22241g;
    }

    /* renamed from: f */
    public int mo23294f() {
        if (this.f22243i == 784923401) {
            this.f22243i = ((Integer) this.f22236b).intValue();
        }
        return this.f22243i;
    }

    /* renamed from: g */
    public boolean mo23295g() {
        return this.f22238d == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyframe{startValue=");
        sb.append(this.f22236b);
        sb.append(", endValue=");
        sb.append(this.f22237c);
        sb.append(", startFrame=");
        sb.append(this.f22239e);
        sb.append(", endFrame=");
        sb.append(this.f22240f);
        sb.append(", interpolator=");
        sb.append(this.f22238d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo23289a(float f) {
        return f >= mo23292d() && f < mo23288a();
    }

    public C8659a(T t) {
        this.f22241g = -3987645.8f;
        this.f22242h = -3987645.8f;
        this.f22243i = 784923401;
        this.f22244j = 784923401;
        this.f22245k = Float.MIN_VALUE;
        this.f22246l = Float.MIN_VALUE;
        this.f22247m = null;
        this.f22248n = null;
        this.f22235a = null;
        this.f22236b = t;
        this.f22237c = t;
        this.f22238d = null;
        this.f22239e = Float.MIN_VALUE;
        this.f22240f = Float.valueOf(Float.MAX_VALUE);
    }
}
