package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.internal.C13084a;

/* renamed from: kotlinx.coroutines.d0 */
public abstract class C13069d0 extends C13128o {

    /* renamed from: e */
    private long f33646e;

    /* renamed from: f */
    private boolean f33647f;

    /* renamed from: g */
    private C13084a<C13052a0<?>> f33648g;

    /* renamed from: c */
    private final long m34089c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo37537a() {
        C13084a<C13052a0<?>> aVar = this.f33648g;
        if (aVar == null || aVar.mo37578a()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo37541b() {
        return this.f33646e >= m34089c(true);
    }

    /* renamed from: c */
    public final boolean mo37542c() {
        C13084a<C13052a0<?>> aVar = this.f33648g;
        if (aVar != null) {
            return aVar.mo37578a();
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo37543d() {
        C13084a<C13052a0<?>> aVar = this.f33648g;
        if (aVar != null) {
            C13052a0 a0Var = (C13052a0) aVar.mo37579b();
            if (a0Var != null) {
                a0Var.run();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37544e() {
    }

    /* renamed from: b */
    public final void mo37540b(boolean z) {
        this.f33646e += m34089c(z);
        if (!z) {
            this.f33647f = true;
        }
    }

    /* renamed from: a */
    public final void mo37538a(C13052a0<?> a0Var) {
        C12932j.m33818b(a0Var, "task");
        C13084a<C13052a0<?>> aVar = this.f33648g;
        if (aVar == null) {
            aVar = new C13084a<>();
            this.f33648g = aVar;
        }
        aVar.mo37577a(a0Var);
    }

    /* renamed from: a */
    public static /* synthetic */ void m34088a(C13069d0 d0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            d0Var.mo37540b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: a */
    public final void mo37539a(boolean z) {
        this.f33646e -= m34089c(z);
        if (this.f33646e <= 0) {
            if (C13149u.m34325a()) {
                if (!(this.f33646e == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f33647f) {
                mo37544e();
            }
        }
    }
}
