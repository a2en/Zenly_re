package kotlinx.coroutines;

import kotlin.C12956q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.p415c1.C13065a;
import kotlinx.coroutines.selects.SelectInstance;

/* renamed from: kotlinx.coroutines.y0 */
final class C13158y0<R> extends C13133q0<C13136r0> {

    /* renamed from: i */
    private final SelectInstance<R> f33766i;

    /* renamed from: j */
    private final Function1<Continuation<? super R>, Object> f33767j;

    public C13158y0(C13136r0 r0Var, SelectInstance<? super R> selectInstance, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        C12932j.m33818b(r0Var, "job");
        C12932j.m33818b(selectInstance, "select");
        C12932j.m33818b(function1, "block");
        super(r0Var);
        this.f33766i = selectInstance;
        this.f33767j = function1;
    }

    /* renamed from: a */
    public void mo37574a(Throwable th) {
        if (this.f33766i.trySelect(null)) {
            C13065a.m34085a(this.f33767j, this.f33766i.getCompletion());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo37574a((Throwable) obj);
        return C12956q.f33541a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectJoinOnCompletion[");
        sb.append(this.f33766i);
        sb.append(']');
        return sb.toString();
    }
}
