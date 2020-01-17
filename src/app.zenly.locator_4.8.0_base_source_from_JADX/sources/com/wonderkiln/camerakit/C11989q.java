package com.wonderkiln.camerakit;

import android.view.SurfaceHolder;

/* renamed from: com.wonderkiln.camerakit.q */
abstract class C11989q {

    /* renamed from: a */
    private C11990a f31250a;

    /* renamed from: b */
    private int f31251b;

    /* renamed from: c */
    private int f31252c;

    /* renamed from: d */
    protected int f31253d;

    /* renamed from: e */
    protected int f31254e;

    /* renamed from: com.wonderkiln.camerakit.q$a */
    interface C11990a {
        /* renamed from: a */
        void mo35546a();
    }

    C11989q() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo35586a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35589a(C11990a aVar) {
        this.f31250a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo35590b() {
        return this.f31252c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo35591c() {
        return this.f31254e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo35592d() {
        return this.f31253d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract SurfaceHolder mo35593e();

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo35594f() {
        return this.f31251b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract float mo35595g();

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract float mo35596h();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract boolean mo35597i();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35585a() {
        this.f31250a.mo35546a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35587a(int i, int i2) {
        this.f31251b = i;
        this.f31252c = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35588a(int i, int i2, int i3) {
        this.f31253d = i;
        this.f31254e = i2;
    }
}
