package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.f */
class C12896f {
    /* renamed from: a */
    public static <T> Lazy<T> m33751a(Function0<? extends T> function0) {
        C12932j.m33818b(function0, "initializer");
        return new C12952m(function0, null, 2, null);
    }

    /* renamed from: a */
    public static <T> Lazy<T> m33750a(C12898h hVar, Function0<? extends T> function0) {
        C12932j.m33818b(hVar, "mode");
        C12932j.m33818b(function0, "initializer");
        int i = C12894d.f33469a[hVar.ordinal()];
        if (i == 1) {
            return new C12952m(function0, null, 2, null);
        }
        if (i == 2) {
            return new C12950l(function0);
        }
        if (i == 3) {
            return new C12957r(function0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
