package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.z0 */
public final class C13160z0 {

    /* renamed from: a */
    private static final ThreadLocal<C13069d0> f33769a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C13160z0 f33770b = new C13160z0();

    private C13160z0() {
    }

    /* renamed from: a */
    public final C13069d0 mo37696a() {
        C13069d0 d0Var = (C13069d0) f33769a.get();
        if (d0Var != null) {
            return d0Var;
        }
        C13069d0 a = C13079g0.m34139a();
        f33769a.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo37698b() {
        f33769a.set(null);
    }

    /* renamed from: a */
    public final void mo37697a(C13069d0 d0Var) {
        C12932j.m33818b(d0Var, "eventLoop");
        f33769a.set(d0Var);
    }
}
