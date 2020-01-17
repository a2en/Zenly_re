package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* renamed from: androidx.dynamicanimation.animation.f */
public final class C0730f extends DynamicAnimation<C0730f> {

    /* renamed from: t */
    private C0731g f3023t = null;

    /* renamed from: u */
    private float f3024u = Float.MAX_VALUE;

    /* renamed from: v */
    private boolean f3025v = false;

    public C0730f(C0728d dVar) {
        super(dVar);
    }

    /* renamed from: h */
    private void m3412h() {
        C0731g gVar = this.f3023t;
        if (gVar != null) {
            double a = (double) gVar.mo3678a();
            if (a > ((double) this.f2993g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f2994h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: a */
    public C0730f mo3672a(C0731g gVar) {
        this.f3023t = gVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3619b(long j) {
        if (this.f3025v) {
            float f = this.f3024u;
            if (f != Float.MAX_VALUE) {
                this.f3023t.mo3683b(f);
                this.f3024u = Float.MAX_VALUE;
            }
            this.f2988b = this.f3023t.mo3678a();
            this.f2987a = 0.0f;
            this.f3025v = false;
            return true;
        }
        if (this.f3024u != Float.MAX_VALUE) {
            this.f3023t.mo3678a();
            long j2 = j / 2;
            C0715p a = this.f3023t.mo3679a((double) this.f2988b, (double) this.f2987a, j2);
            this.f3023t.mo3683b(this.f3024u);
            this.f3024u = Float.MAX_VALUE;
            C0715p a2 = this.f3023t.mo3679a((double) a.f3000a, (double) a.f3001b, j2);
            this.f2988b = a2.f3000a;
            this.f2987a = a2.f3001b;
        } else {
            C0715p a3 = this.f3023t.mo3679a((double) this.f2988b, (double) this.f2987a, j);
            this.f2988b = a3.f3000a;
            this.f2987a = a3.f3001b;
        }
        this.f2988b = Math.max(this.f2988b, this.f2994h);
        this.f2988b = Math.min(this.f2988b, this.f2993g);
        if (!mo3673a(this.f2988b, this.f2987a)) {
            return false;
        }
        this.f2988b = this.f3023t.mo3678a();
        this.f2987a = 0.0f;
        return true;
    }

    /* renamed from: d */
    public void mo3622d() {
        m3412h();
        this.f3023t.mo3681a((double) mo3617b());
        super.mo3622d();
    }

    /* renamed from: e */
    public boolean mo3674e() {
        return this.f3023t.f3027b > 0.0d;
    }

    /* renamed from: f */
    public C0731g mo3675f() {
        return this.f3023t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3625f(float f) {
    }

    /* renamed from: g */
    public void mo3677g(float f) {
        if (mo3621c()) {
            this.f3024u = f;
            return;
        }
        if (this.f3023t == null) {
            this.f3023t = new C0731g(f);
        }
        this.f3023t.mo3683b(f);
        mo3622d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3673a(float f, float f2) {
        return this.f3023t.mo3682a(f, f2);
    }

    public C0730f(C0728d dVar, float f) {
        super(dVar);
        this.f3023t = new C0731g(f);
    }

    /* renamed from: g */
    public void mo3676g() {
        if (!mo3674e()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f2992f) {
            this.f3025v = true;
        }
    }

    public <K> C0730f(K k, C0727c<K> cVar) {
        super(k, cVar);
    }

    public <K> C0730f(K k, C0727c<K> cVar, float f) {
        super(k, cVar);
        this.f3023t = new C0731g(f);
    }
}
