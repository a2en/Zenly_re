package app.zenly.locator.map.p116n1;

import android.content.Context;
import app.zenly.locator.core.util.C3200e0;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.n1.c */
public final class C4275c {

    /* renamed from: a */
    private int f11450a;

    /* renamed from: b */
    private int f11451b;

    /* renamed from: c */
    private int f11452c;

    /* renamed from: d */
    private int f11453d;

    /* renamed from: e */
    private boolean f11454e;

    /* renamed from: f */
    private final int f11455f;

    /* renamed from: g */
    private final int f11456g;

    /* renamed from: h */
    private final int f11457h;

    /* renamed from: i */
    private final int f11458i;

    public C4275c(int i, int i2, int i3, int i4) {
        this.f11455f = i;
        this.f11456g = i2;
        this.f11457h = i3;
        this.f11458i = i4;
    }

    /* renamed from: e */
    private final void m12690e() {
        if (!this.f11454e) {
            throw new IllegalStateException("Not computed".toString());
        }
    }

    /* renamed from: a */
    public final int mo11287a() {
        m12690e();
        return this.f11453d;
    }

    /* renamed from: b */
    public final int mo11289b() {
        m12690e();
        return this.f11450a;
    }

    /* renamed from: c */
    public final int mo11290c() {
        m12690e();
        return this.f11452c;
    }

    /* renamed from: d */
    public final int mo11291d() {
        m12690e();
        return this.f11451b;
    }

    /* renamed from: a */
    public final void mo11288a(Context context) {
        C12932j.m33818b(context, "context");
        if (!this.f11454e) {
            this.f11454e = true;
            this.f11450a = C3200e0.m10183a(context, this.f11455f);
            this.f11451b = C3200e0.m10183a(context, this.f11456g);
            this.f11452c = C3200e0.m10183a(context, this.f11457h);
            this.f11453d = C3200e0.m10183a(context, this.f11458i);
        }
    }
}
