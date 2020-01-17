package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.i0 */
public final class C13083i0 implements Incomplete {

    /* renamed from: e */
    private final C13150u0 f33667e;

    public C13083i0(C13150u0 u0Var) {
        C12932j.m33818b(u0Var, "list");
        this.f33667e = u0Var;
    }

    public C13150u0 getList() {
        return this.f33667e;
    }

    public boolean isActive() {
        return false;
    }

    public String toString() {
        return C13149u.m34326b() ? getList().mo37692a("New") : super.toString();
    }
}
