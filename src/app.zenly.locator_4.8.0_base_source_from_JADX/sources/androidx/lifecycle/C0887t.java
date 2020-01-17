package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0862g.C0863a;

/* renamed from: androidx.lifecycle.t */
public class C0887t {

    /* renamed from: a */
    private final C0869k f3504a;

    /* renamed from: b */
    private final Handler f3505b = new Handler();

    /* renamed from: c */
    private C0888a f3506c;

    /* renamed from: androidx.lifecycle.t$a */
    static class C0888a implements Runnable {

        /* renamed from: e */
        private final C0869k f3507e;

        /* renamed from: f */
        final C0863a f3508f;

        /* renamed from: g */
        private boolean f3509g = false;

        C0888a(C0869k kVar, C0863a aVar) {
            this.f3507e = kVar;
            this.f3508f = aVar;
        }

        public void run() {
            if (!this.f3509g) {
                this.f3507e.mo4450a(this.f3508f);
                this.f3509g = true;
            }
        }
    }

    public C0887t(LifecycleOwner lifecycleOwner) {
        this.f3504a = new C0869k(lifecycleOwner);
    }

    /* renamed from: a */
    private void m4086a(C0863a aVar) {
        C0888a aVar2 = this.f3506c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.f3506c = new C0888a(this.f3504a, aVar);
        this.f3505b.postAtFrontOfQueue(this.f3506c);
    }

    /* renamed from: b */
    public void mo4492b() {
        m4086a(C0863a.ON_START);
    }

    /* renamed from: c */
    public void mo4493c() {
        m4086a(C0863a.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4494d() {
        m4086a(C0863a.ON_STOP);
        m4086a(C0863a.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4495e() {
        m4086a(C0863a.ON_START);
    }

    /* renamed from: a */
    public C0862g mo4491a() {
        return this.f3504a;
    }
}
