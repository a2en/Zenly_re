package androidx.fragment.app;

import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.fragment.app.s */
class C0840s implements LifecycleOwner {

    /* renamed from: e */
    private C0869k f3398e = null;

    C0840s() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4373a() {
        if (this.f3398e == null) {
            this.f3398e = new C0869k(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4375b() {
        return this.f3398e != null;
    }

    public C0862g getLifecycle() {
        mo4373a();
        return this.f3398e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4374a(C0863a aVar) {
        this.f3398e.mo4450a(aVar);
    }
}
