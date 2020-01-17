package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.k0 */
final class C13121k0 extends C13063c {

    /* renamed from: e */
    private final Function1<Throwable, C12956q> f33715e;

    public C13121k0(Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(function1, "handler");
        this.f33715e = function1;
    }

    /* renamed from: a */
    public void mo37503a(Throwable th) {
        this.f33715e.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37503a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(C13151v.m34329a((Object) this.f33715e));
        sb.append('@');
        sb.append(C13151v.m34331b(this));
        sb.append(']');
        return sb.toString();
    }
}
