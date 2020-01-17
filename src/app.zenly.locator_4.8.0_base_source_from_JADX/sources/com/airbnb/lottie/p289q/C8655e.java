package com.airbnb.lottie.p289q;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8506c;

/* renamed from: com.airbnb.lottie.q.e */
public class C8655e extends C8651a implements FrameCallback {

    /* renamed from: g */
    private float f22217g = 1.0f;

    /* renamed from: h */
    private boolean f22218h = false;

    /* renamed from: i */
    private long f22219i = 0;

    /* renamed from: j */
    private float f22220j = 0.0f;

    /* renamed from: k */
    private int f22221k = 0;

    /* renamed from: l */
    private float f22222l = -2.14748365E9f;

    /* renamed from: m */
    private float f22223m = 2.14748365E9f;

    /* renamed from: n */
    private C8506c f22224n;

    /* renamed from: o */
    protected boolean f22225o = false;

    /* renamed from: q */
    private float m20156q() {
        C8506c cVar = this.f22224n;
        if (cVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / cVar.mo22938g()) / Math.abs(this.f22217g);
    }

    /* renamed from: r */
    private boolean m20157r() {
        return mo23278j() < 0.0f;
    }

    /* renamed from: s */
    private void m20158s() {
        if (this.f22224n != null) {
            float f = this.f22220j;
            if (f < this.f22222l || f > this.f22223m) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f22222l), Float.valueOf(this.f22223m), Float.valueOf(this.f22220j)}));
            }
        }
    }

    /* renamed from: a */
    public void mo23262a(C8506c cVar) {
        boolean z = this.f22224n == null;
        this.f22224n = cVar;
        if (z) {
            mo23260a((float) ((int) Math.max(this.f22222l, cVar.mo22943l())), (float) ((int) Math.min(this.f22223m, cVar.mo22936e())));
        } else {
            mo23260a((float) ((int) cVar.mo22943l()), (float) ((int) cVar.mo22936e()));
        }
        float f = this.f22220j;
        this.f22220j = 0.0f;
        mo23259a((float) ((int) f));
    }

    /* renamed from: b */
    public void mo23263b(float f) {
        mo23260a(this.f22222l, f);
    }

    /* renamed from: c */
    public void mo23264c(float f) {
        this.f22217g = f;
    }

    public void cancel() {
        mo23244a();
        mo23282n();
    }

    /* renamed from: d */
    public void mo23267d() {
        this.f22224n = null;
        this.f22222l = -2.14748365E9f;
        this.f22223m = 2.14748365E9f;
    }

    public void doFrame(long j) {
        mo23281m();
        if (this.f22224n != null && isRunning()) {
            String str = "LottieValueAnimator#doFrame";
            C8505b.m19651a(str);
            long j2 = this.f22219i;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float q = ((float) j3) / m20156q();
            float f = this.f22220j;
            if (m20157r()) {
                q = -q;
            }
            this.f22220j = f + q;
            boolean z = !C8657g.m20190b(this.f22220j, mo23276i(), mo23275h());
            this.f22220j = C8657g.m20181a(this.f22220j, mo23276i(), mo23275h());
            this.f22219i = j;
            mo23250c();
            if (z) {
                if (getRepeatCount() == -1 || this.f22221k < getRepeatCount()) {
                    mo23248b();
                    this.f22221k++;
                    if (getRepeatMode() == 2) {
                        this.f22218h = !this.f22218h;
                        mo23284p();
                    } else {
                        this.f22220j = m20157r() ? mo23275h() : mo23276i();
                    }
                    this.f22219i = j;
                } else {
                    this.f22220j = this.f22217g < 0.0f ? mo23276i() : mo23275h();
                    mo23282n();
                    mo23245a(m20157r());
                }
            }
            m20158s();
            C8505b.m19652b(str);
        }
    }

    /* renamed from: e */
    public void mo23269e() {
        mo23282n();
        mo23245a(m20157r());
    }

    /* renamed from: f */
    public float mo23270f() {
        C8506c cVar = this.f22224n;
        if (cVar == null) {
            return 0.0f;
        }
        return (this.f22220j - cVar.mo22943l()) / (this.f22224n.mo22936e() - this.f22224n.mo22943l());
    }

    /* renamed from: g */
    public float mo23271g() {
        return this.f22220j;
    }

    public float getAnimatedFraction() {
        float i;
        float h;
        float i2;
        if (this.f22224n == null) {
            return 0.0f;
        }
        if (m20157r()) {
            i = mo23275h() - this.f22220j;
            h = mo23275h();
            i2 = mo23276i();
        } else {
            i = this.f22220j - mo23276i();
            h = mo23275h();
            i2 = mo23276i();
        }
        return i / (h - i2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo23270f());
    }

    public long getDuration() {
        C8506c cVar = this.f22224n;
        if (cVar == null) {
            return 0;
        }
        return (long) cVar.mo22933c();
    }

    /* renamed from: h */
    public float mo23275h() {
        C8506c cVar = this.f22224n;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.f22223m;
        if (f == 2.14748365E9f) {
            f = cVar.mo22936e();
        }
        return f;
    }

    /* renamed from: i */
    public float mo23276i() {
        C8506c cVar = this.f22224n;
        if (cVar == null) {
            return 0.0f;
        }
        float f = this.f22222l;
        if (f == -2.14748365E9f) {
            f = cVar.mo22943l();
        }
        return f;
    }

    public boolean isRunning() {
        return this.f22225o;
    }

    /* renamed from: j */
    public float mo23278j() {
        return this.f22217g;
    }

    /* renamed from: k */
    public void mo23279k() {
        mo23282n();
    }

    /* renamed from: l */
    public void mo23280l() {
        this.f22225o = true;
        mo23249b(m20157r());
        mo23259a((float) ((int) (m20157r() ? mo23275h() : mo23276i())));
        this.f22219i = 0;
        this.f22221k = 0;
        mo23281m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo23281m() {
        if (isRunning()) {
            mo23265c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo23282n() {
        mo23265c(true);
    }

    /* renamed from: o */
    public void mo23283o() {
        this.f22225o = true;
        mo23281m();
        this.f22219i = 0;
        if (m20157r() && mo23271g() == mo23276i()) {
            this.f22220j = mo23275h();
        } else if (!m20157r() && mo23271g() == mo23275h()) {
            this.f22220j = mo23276i();
        }
    }

    /* renamed from: p */
    public void mo23284p() {
        mo23264c(-mo23278j());
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f22218h) {
            this.f22218h = false;
            mo23284p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23265c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f22225o = false;
        }
    }

    /* renamed from: a */
    public void mo23259a(float f) {
        if (this.f22220j != f) {
            this.f22220j = C8657g.m20181a(f, mo23276i(), mo23275h());
            this.f22219i = 0;
            mo23250c();
        }
    }

    /* renamed from: a */
    public void mo23261a(int i) {
        mo23260a((float) i, (float) ((int) this.f22223m));
    }

    /* renamed from: a */
    public void mo23260a(float f, float f2) {
        if (f <= f2) {
            C8506c cVar = this.f22224n;
            float l = cVar == null ? -3.4028235E38f : cVar.mo22943l();
            C8506c cVar2 = this.f22224n;
            float e = cVar2 == null ? Float.MAX_VALUE : cVar2.mo22936e();
            this.f22222l = C8657g.m20181a(f, l, e);
            this.f22223m = C8657g.m20181a(f2, l, e);
            mo23259a((float) ((int) C8657g.m20181a(this.f22220j, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }
}
